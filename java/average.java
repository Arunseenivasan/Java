import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int average=0;
  System.out.println("Enter the mark limit:");
       int a=sc.nextInt();
    int b[]=new int[a];
    for (int i=0;i<a;i++){
        b[i]=sc.nextInt();
        sum=sum+b[i];
    }
    average=sum/a;
    System.out.println(average);
    
       
    }
}