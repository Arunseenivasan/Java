import java.util.*;
class HelloWorld {
    public static String joinstring(String x1,String x2 ){
        return x1.concat(x2);
    }
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(joinstring(s1,s2));
        System.out.println(reverse(s1));
          System.out.println(reverse(s2));
          boolean s3=s1.equalsIgnoreCase(s2);
          if(s3){
              System.out.println("anagram");
          }
          else{
              System.out.println(" not anagram");
          
              
          }
    }
}
       
       