import java.util.*;
public class SortDigits {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();

        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);
        System.out.println(new String(digits));
}
}