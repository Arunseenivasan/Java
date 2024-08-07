import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number:");
        int number = a.nextInt();
        int count=5;
        while(number>0 && count!=0){
            int remainder = number%10;
            System.out.println(remainder);
             number=number/10;
             count--;
            }
            
   
        
        
      
        
        
    }
        }
