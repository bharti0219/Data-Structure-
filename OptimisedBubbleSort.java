import java.util.Scanner;
public class OptimisedBubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int flag;
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		for(int j=0;j<n-1;j++)
		{
			flag =0;
			for(int k=0;k<n-j-1;k++)
			{
				if(a[k]>a[k+1])
				{
					a[k]=a[k]+a[k+1];
					a[k+1]=a[k]-a[k+1];
					a[k]=a[k]-a[k+1];
					flag=1;
					
				}
			}
			if(flag==0)
				break;
		}
		for(int l=0;l<n;l++)
			System.out.println(a[l]);
	}

}
