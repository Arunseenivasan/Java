import java.util.*;
class HelloWorld {
    public static String joinstring(String x1,String x2 ){
        return x1.concat(x2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(joinstring(s1,s2));
    }
}
       