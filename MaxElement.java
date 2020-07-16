import java.util.Scanner;
public class helloworld {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
//		Arrays.sort(a); 
//		for(int j=0;j<n;j++)
//			System.out.println(a[j]);
	}

}