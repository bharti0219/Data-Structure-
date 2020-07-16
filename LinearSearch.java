import java.util.Scanner;
public class linearsearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int m=s.nextInt();
		int flag=1;
		for(int j=0;j<n;j++)
		{
			if(a[j]==m)
			{
				System.out.println(j);
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("element not found");
			
		
	}

}
