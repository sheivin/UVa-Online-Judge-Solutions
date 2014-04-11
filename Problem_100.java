import java.io.*;
import java.util.*;
class Problem_100
{
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        int A[][]=new int[1000000][3];
        int c=0;
        boolean swap=false;
        int max=0;
        int a=0;
        int b=0;
        int t=0;
        int i=0;
        int temp=0;
        StringTokenizer st;
        String line="";
        while(((line=obj.readLine())!=null) && line.length()!=0)
        {
            max=0;
            temp=0;
            swap=false;
            st=new StringTokenizer(line);
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            if(a>b)
            {
                swap=true;
                t=a;
                a=b;
                b=t;
            }
            for(i=a;i<=b;i++)
            {
                temp=cycle_length(i);
                if(temp>max)
                {
                    max=temp;
                }
            }
            if(swap==true)
            {
                A[c][0]=b;
                A[c][1]=a;
            }
            else
            {
                A[c][0]=a;
                A[c][1]=b;
            }
            A[c][2]=max;
            c++;
        }
        for(i=0;i<c;i++)
        {
            System.out.println(A[i][0]+" "+A[i][1]+" "+A[i][2]);
        }
    }
    static int cycle_length(int x)
    {
        int counter=1;
        while(x!=1)
        {
            if(x%2==0)
            {
                x=x/2;
            }
            else
            {
                x=3*x+1;
            }
            counter++;
        }
        return counter;
    }
}
