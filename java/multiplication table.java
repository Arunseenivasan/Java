import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number:");
        int number = a.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }
    }
        }
