import java.util.*;
class HelloWorld {
   public static int max(int x,int y){
            if(x>y){
                return x;
            }
            else{
                return y;
            }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(max(a,b));
    }
}