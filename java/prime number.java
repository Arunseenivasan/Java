import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        int count=0 ;
        for(int i=2;i<=number/2;i++){
        if(number%i==0){
            System.out.println("not a Prime");
             count=1;
         
        }
        }
        if(count==0){
            System.out.println(" Prime");

        }
    
   
   
    }
}