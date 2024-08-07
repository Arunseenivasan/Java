import java.util.*;
class HelloWorld {
        public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int number=sc.nextInt();
       int arr[]=new int[number];
       for(i=0;i<number;i++){
           arr[i]=sc.nextInt();
}
System.out.println("enter the target value:");
       int target=sc.nextInt();
       {
           for(j=i;j<number;j++){
               if(arr[i]+arr[j] == target)
     
                     System.out.println(arr[i]+" "+arr[j]);