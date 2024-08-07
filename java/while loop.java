import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number:");
        int number = a.nextInt();
        while(number>5){
            int remainder = number%10;;
            System.out.println(remainder);
             number=number/10;
            }
   
        
        
      
        
        
    }
        }
