import org.json.JSONObject;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShamirSecretSharing {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("file.json")));
            JSONObject jsonObject = new JSONObject(content);
            JSONObject keys = jsonObject.getJSONObject("keys");
            int n = keys.getInt("n");
            int k = keys.getInt("k");

            double[] x = new double[k];
            double[] y = new double[k];

            int count = 0;
            for (String key : jsonObject.keySet()) {
                if (key.equals("keys")) continue;
                JSONObject root = jsonObject.getJSONObject(key);
                int base = Integer.parseInt(root.getString("base"));
                String value = root.getString("value");
                x[count] = Double.parseDouble(key);
                y[count] = new BigInteger(value, base).doubleValue();
                count++;
                if (count == k) break;
            }
            double secret = lagrangeInterpolation(x, y, k);
            System.out.println("Secret (c) is: " + secret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static double lagrangeInterpolation(double[] x, double[] y, int k) {
        double secret = 0;
        for (int i = 0; i < k; i++) {
            double term = y[i];
            for (int j = 0; j < k; j++) {
                if (i != j) {
                    term *= (0 - x[j]) / (x[i] - x[j]);
                }
            }
            secret += term;
        }
        return secret;
    }
}
