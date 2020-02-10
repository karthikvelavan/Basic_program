import java.util.Scanner;
import java.io.*;
class File
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("input.txt");
		int val=(int)fr.read();
		for(int i=0;i<val;i++)
		{
			System.out.println((int)fr.read());
		}
	}
}