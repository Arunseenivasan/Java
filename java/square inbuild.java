import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        double a=Math.sqrt(n);
        a=(int)a;
        if(a*a==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
        
    
        
    }
}