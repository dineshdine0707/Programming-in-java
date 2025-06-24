import java.util.*;
class rebound
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int vF=sc.nextInt();
        int vI=sc.nextInt();
        System.out.println((int)h*Math.pow((vI/vF),2)+01);
}
}