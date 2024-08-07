import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number:");
        int number = a.nextInt();
        System.out.println("enter the starting range:");
        int start=a.nextInt();
        System.out.println("enter the ending range:");
        int end=a.nextInt();
        for(int i=start;i<=end;i++){
            int b=number*i;
            System.out.println(number+"x"+i+"="+b);
        }
      
        
        
    }
        }
