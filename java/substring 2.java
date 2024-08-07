import java.util.*;
class HelloWorld {
    public static String substring(String x,int d ){
        return x.substring(d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=sc.nextInt();
        String s3=substring(s1,n);
        System.out.println(s3);
       
    }
}
       
       