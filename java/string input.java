import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       System.out.println("enter the limit:");
       int a=n.nextInt();
       n.nextLine();
       String ar[]=new String[a];
       for(int i=0;i<a;i++){
                          

           ar[i]=n.nextLine();
       }
                  System.out.println("---------");

       for(String s:ar){
           System.out.println(s);
       }
    }
}