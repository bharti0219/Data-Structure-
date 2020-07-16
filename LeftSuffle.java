import java.util.Scanner;

public class left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		  for(int j=0;j<4;j++)
	        {
	           int m=a[0];
	            for(int k=0;k<5-1;k++)
	            a[k]=a[k+1];
	            a[n-1]=m;

	        }
	        for(int l=0;l<n;l++)
	        System.out.println(a[l]);
	}

}
