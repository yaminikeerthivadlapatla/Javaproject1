import java.util.*;
public class Percentage1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("enter value of a:");
		 int a=s.nextInt();
		 System.out.println("enter value of b:");
		 int b=s.nextInt();
		 System.out.println("enter value of c:");
		 int c=s.nextInt();
		 System.out.println("enter value of d:");
		 int d=s.nextInt();
    int avg=(a+b+c+d)/4;
    int per=(avg*100)/100;
    System.out.println(per);
}
}