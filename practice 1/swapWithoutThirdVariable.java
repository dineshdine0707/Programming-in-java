public class swapWithoutThirdVariable {
    public static void main(String[] args)
    {
        int a=5;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
