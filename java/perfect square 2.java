import java.util.*;
import java.lang.Math;
public class Main
{
    static int methodOne(int n){
        int i = 1;
        int check = 0;
        while(i*i<=n){
            if(i*i==n){
                check = 1;
                break;
            }
            i+=1;
        }
        if(check==1){
            
            return 1;
        }
        return 0;
    }
    
    static int methodTwo(int n){
        int a = (int)Math.sqrt(n);
        if(a*a==n){
            return 1;
        }
        return 0;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		int i;
		int a=0;
		for(i=2;i<=n;i++){
		    if(n%i==0){
		        //flag = methodOne(i);
		        flag = methodTwo(i);
		        a++;
		        if(flag==1){
		            break;
		        }
		    }
		}
		if(flag==0){
		    System.out.println("Square Free Number");
		}
		else{
		    System.out.println("Not a Square Free Number");
		}
				    System.out.println("Count:"+a);

	}
}
