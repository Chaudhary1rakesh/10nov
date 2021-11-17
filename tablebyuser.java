package first_java_programe;
import java.util.Scanner;
public class tablebyuser {
	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your table Row:");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
//			System.out.print("Table of:");
			System.out.println(n*i);
		}
	}

}
