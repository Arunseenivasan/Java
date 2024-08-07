import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=1;i<=a&&i<=b;i++){
		    if(a%i==0&b%i==0){
		        c=i;
		    }
		    System.out.println(c);
		}
	}
}


another method

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=0,min=0;
		if(a<b&&a<c)
		     min=a;
		else if(b<a&&b<c)
		     min=b;
		 else
		     min=c;
				    System.out.println("----------");

		for(int i=1;i<=min;i++){
		    if(a%i==0&&b%i==0&&c%i==0){
		        d=i;
		    }
		}
				    System.out.println(d);

	}
}