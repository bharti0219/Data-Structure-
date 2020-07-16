import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int m=s.nextInt();
		int lb=0,ub=n-1,mid;
		int flag=1;
		while(flag!=0)
		{
		mid=(lb+ub)/2;
		if(m==a[mid])
		{
			System.out.println("element found at"+mid);
			flag=0;
		}
		else if(mid<m)
		{
			lb=mid+1;
		}
		else
		{
			ub=mid-1;
		}
		}
		
		

	}

}
