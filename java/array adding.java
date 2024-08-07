import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       System.out.println("enter the limit:");
       int sum=0;
       int a=n.nextInt();
       int ar[]=new int[a];
       for(int i=0;i<a;i++){
                          

           ar[i]=n.nextInt();
           sum=sum+ar[i];
           
       }
                  System.out.println(sum);

       
    }
}