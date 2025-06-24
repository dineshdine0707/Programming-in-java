import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int source = sc.nextInt();
        int dest = sc.nextInt();
        
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        if (!list3.contains(source) || !list3.contains(dest)) {
            System.out.println("NO");
            return;
        }
        if (list1.contains(source) && list1.contains(dest)) {
            System.out.println("YES");
            return;
        }
        if (list2.contains(source) && list2.contains(dest)) {
            System.out.println("YES");
            return;
        }
        for (int i=0;i<list1.size();i++) {
            if (list2.contains(list1.get(i))) {
                flag = true;
                if (list2.indexOf(dest)>=i) {
                    System.out.println("YES");
                    return;
                }
                else
                System.out.println("NO");
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
    }
}
