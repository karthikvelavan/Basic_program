import java.util.*;
import java.math.*;
class Gcd
{  public static int gcd(int num1,int num2)
	{
      if(num2==0)
      	return num1;
      else
      	return gcd(num2,num1%num2);
  }

public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int bi1=sc.nextInt();
	int bi2=sc.nextInt();
    int bi3;
    bi3=gcd(bi1,bi2);
    System.out.println(bi3);
	}
}