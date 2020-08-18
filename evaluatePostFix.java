import java.util.*;
import java.lang.*;
import java.io.*;
class evaluatePostFix
{
    static int arr[]=new int[100];
    static int top=-1;
    public static int pop()
    {
        int l=arr[top];
        top--;
        return l;
    }
    public static void EvaluatePostFix(String str)
    {
        int length=str.length();
        int result=0;
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)=='*'||str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='/')        
            {
                int y=pop();
                int x=pop();
                if(str.charAt(i)=='+')
                result=x+y;
                else if(str.charAt(i)=='-')
                result=x-y;
                else if(str.charAt(i)=='*')
                result=x*y;
                else if(str.charAt(i)=='/')
                result=x/y;
                else
                System.out.print("");
                top++;
                arr[top]=result;
            }
            else
            {
               top++;
               arr[top]=str.charAt(i)-'0';
            }
        }
        System.out.println(result);
    }
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str=s.next();
		    EvaluatePostFix(str);
		}
	}
}