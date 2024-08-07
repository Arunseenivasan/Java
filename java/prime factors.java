import java.util.*;
class HelloWorld{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int i=2;
        while(n!=1){
            while(n%i==0){
                n=n/i;
                System.out.println(i);
            }
            i++;
        }
        
        
    
        
    }
}
        
