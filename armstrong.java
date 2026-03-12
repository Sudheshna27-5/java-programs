package models;
import java.util.*;
public class armstrong {
	public static void main(String[] args)
	{
		Scanner sin=new Scanner(System.in);
		int num=sin.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}