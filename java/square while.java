import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int i=0;
        int flag=0;
        while(i*i<=n){
            if(i*i==n){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
        
    
        
    }
}