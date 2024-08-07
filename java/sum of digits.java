import java.util.*;
class HelloWorld {
   public static int sumofdigits(int a){
       int temp=0;
       int sum=0;
      
       while(a>0){
           temp=a%10;
           a=a/10;
           sum=sum+temp;
           }
                      return sum;

   }
       
      
   
          
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigits(n));
    }
        
}