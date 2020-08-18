import java.io.*;
import java.util.Scanner;
class InfixToPrefix
{
    static String arr1[]=new String[100];
    static char arr2[]=new char[100];
    public static int top1=-1,top2=-1;
    public static String pop1()
    {
        String st=arr1[top1];
        top1--;
        return st;
        
    }
     public static char pop2()
    {
        char st=arr2[top2];
        top2--;
        return st;
    }
    public static int precedence(char c)
    {
        if(c=='^')
        return 3;
        if(c=='*'||c=='/')
        return 2;
        if(c=='+'||c=='-');
        return 1;
    }
    public static String d="";
    public static void prefix(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
            {
                top2++;
                arr2[top2]=str.charAt(i);
            }
            else if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')
            {
            	if(top2!=-1&&(arr2[top2]!='('||arr2[top2]!='{'||arr2[top2]!='['))
            	{
            		while(precedence(arr2[top2])>precedence(str.charAt(i)))
                    {
                        char a=pop2();
                        String b=pop1();
                        String c=pop1();
                        String d=a+c+b;
                        top1++;
                        arr1[top1]=d;
                    }
                    top2++;
                    arr2[top2]=str.charAt(i);
            	}
                else
                {
                  top2++;
                  arr2[top2]=str.charAt(i);
                }
            }
            else if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')
            {
                
            	if(str.charAt(i)==')')
            	{
            	    
            	   while(arr2[top2]!='(')
            	   {
            		   char ach=pop2();
                       String bch=pop1();
                       String cch=pop1();
                       d=ach+cch+bch;
                      top1++;
                      arr1[top1]=d;
            	   }
            	   
            	   char ch=pop2();
            	}
            	if(str.charAt(i)==']')
            	{
            	    
            	   while(arr2[top2]!='[')
            	   {
            		   char ach=pop2();
                       String bch=pop1();
                       String cch=pop1();
                       d=ach+cch+bch;
                      top1++;
                      arr1[top1]=d;
            	   }
            	   
            	   char ch=pop2();
            	}
            	if(str.charAt(i)=='}')
            	{
            	    
            	   while(arr2[top2]!='{')
            	   {
            		   char ach=pop2();
                       String bch=pop1();
                       String cch=pop1();
                       d=ach+cch+bch;
                      top1++;
                      arr1[top1]=d;
            	   }
            	   
            	   char ch=pop2();
            	}
            	
            }
            else
            {
            	top1++;
            	arr1[top1]=String.valueOf(str.charAt(i));
            }
        }
        if(top2!=-1)
        {
            char ach=pop2();
            String bch=pop1();
            String cch=pop1();
            d=ach+cch+bch;
        }
        System.out.print(d);
    }
	public static void main (String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
		    str=s.next();
		    prefix(str);
		}
		
	}
}
