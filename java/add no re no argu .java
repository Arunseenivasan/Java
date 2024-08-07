import java.util.*;
class HelloWorld {
    static int a,b,c;
    public static void sum()
    {
         c=a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         sum();
        System.out.println("result "+c);
       
    }
}