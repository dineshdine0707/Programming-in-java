import java.util.*;
interface one
{
    void print_one();
}
interface two
{
    void print_two();
}
interface three extends one,two
{
    void print_one();
}
class child implements three{
    public void print_one()
    {
        System.out.println("one");
    }
    public void print_two()
    {
        System.out.println("two");
    }
}
 public class muiltipleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.print_one();
        c.print_two();
    }

}
