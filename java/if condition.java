import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a%2!=0)
        {
            a=a+1;
            System.out.println(a);
            if(a%2==0){
                a=a*a;
                System.out.println("it is even number");
                System.out.println(a+1);
            }
        }
            
            
            
            
        
        
   
    }
}	
