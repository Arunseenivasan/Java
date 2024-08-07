import java.util.*;
class HelloWorld {
   public static int max(int x[]){
       int temp=0;
       int i;
       for(i=0;i<x.length;i++){
           if(temp<x[i]){
               temp=x[i];
           }
       }
       return temp;
   }
          
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maximum=max(a);
        System.out.println(maximum);
    }
}