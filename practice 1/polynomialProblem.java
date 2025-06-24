
import java.util.*;
import java.math.BigInteger;
public class polynomialProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of entries (n): ");
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter base for entry " + (i + 1) + ": ");
            int base = scanner.nextInt();

            System.out.print("Enter value for entry " + (i + 1) + ": ");
            String value = scanner.next();

            x[i] = i+1;

            BigInteger decimalValue = new BigInteger(value, base);
            y[i] = decimalValue.doubleValue();
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+","+y[i]);
        }
    }
}
