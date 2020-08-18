import java.util.Scanner;
class infixToPostfix 
{
    public static char[] arr=new char[100];
       public  static int top=-1;
    public static int precedence(char c)
    {
        if(c=='^')
        return 3;
        else if(c=='*'||c=='/')
        return 2;
        else if(c=='+'||c=='-')
        return 1;
        else
        return 0;
    }
    public static void push(char s)
    {
        arr[++top]=s;
    }
    public static char pop()
    {
        char p=arr[top];
        top--;
        return p;
    }
    public static void postfix(String str)
    {
        int length=str.length();
        int len=length;
        //System.out.println(length);
        char s[]=new char[length];
        int k=0;
        for(int j=0;j<length;j++)
        {
            if(str.charAt(j)>=65&&str.charAt(j)<=90||str.charAt(j)>=97&&str.charAt(j)<=122)
            {
              s[k]=str.charAt(j);
              k++;
            }
            else
            {
            	if(str.charAt(j)=='('||str.charAt(j)=='{'||str.charAt(j)=='[')
                {
               push(str.charAt(j));
               len--;
                }
               else
               {
                int l=precedence(str.charAt(j));
                if(top<0||l>=precedence(arr[top]))
                {
                    push(str.charAt(j));
                }
                else if(arr[top]=='('||arr[top]=='{'||arr[top]=='[')
                {
                    push(str.charAt(j));
                }
                else if(str.charAt(j)==')'||str.charAt(j)=='}'||str.charAt(j)==']')
                {
                	len--;
                    if(str.charAt(j)==')')
                    {
                        while(arr[top]!='(')
                        {
                            char m=pop();
                            if(m==')')
                            System.out.println();
                            else
                            {
                            s[k]=m;
                            k++;
                            }
    
                        }
                        char t=pop();
                    }
                    if(str.charAt(j)=='}')
                    {
                        while(arr[top]!='{')
                        {
                            char m=pop();
                            if(m=='}')
                            System.out.println();
                            else
                            {
                            s[k]=m;
                            k++;
                            }
    
                        }
                         char t=pop();
                    }
                    if(str.charAt(j)==']')
                    {
                        while(arr[top]!='[')
                        {
                            char m=pop();
                            if(m=='[')
                            System.out.println();
                            else
                            {
                            s[k]=m;
                            k++;
                            }
    
                        }
                         char t=pop();
                    }
                }
                else
                {
                    while(precedence(arr[top])<=l)
                    {
                        char ch=pop();
                        s[k]=ch;
                        k++;
                        
                    }
                }
               }
            }
        }
        while(top!=-1)
        {
            char l=pop();
            if(l=='('||l=='{'||l=='['||l==')'||l=='}'||l==']')
             System.out.print("");
             else
             {
            s[k]=l;
            k++;
             }
        }
           for(int m=0;m<len;m++)
           {
        	   if(s[m]==' ')
        		   break;
        	   else
                 System.out.print(s[m]);
           }         
            System.out.println();
            
    }
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str=s.next();
		    postfix(str);
		}
	}
}