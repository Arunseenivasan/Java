import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] numbers={1,2,3,4,5,6};
       String[] cars={"BMW","AUDI"};
       char[] symbol={'a','b'};
       for(int i:numbers){
           System.out.println(i);
       }
       for(String i:cars){
           System.out.println(i);
       }
       for(char i:symbol){
           System.out.println(i);
       }
    }
}