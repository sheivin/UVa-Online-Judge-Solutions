import java.io.*;
class Problem_151
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        int temp=0;
        int c=0;
        int arr[];
        String line="";
        int N=0;
        int m=0;
        int i=0;
        int flag=0;
        int check=0;
        int num=0;
        while(true)
        {
            line=br.readLine();
            if(line.charAt(0)=='0')
            {
                break;
            }
            N=Integer.parseInt(line);
            arr=new int[N];
            arr[0]=1;
            flag=0;
            temp=1;
            m=1;
            while(flag==0)
            {
                temp=2;
                c=1;
                while(c<N)
                {
                    num=0;
                    while(true)
                    {
                        check=0;
                        for(i=0;i<c;i++)
                        {
                            if(arr[i]==temp)
                            {
                                check=1;
                            }
                        }
                        if(check==0)
                        {
                            num++;
                        }
                        if(num==m)
                        {
                            break;
                        }
                        if(temp==N)
                        {
                            temp=1;
                        }
                        else
                        {
                            temp++;
                        }
                    }
                    arr[c++]=temp;
                    //System.out.println(temp);
                }
                if(arr[N-1]==13)
                {
                    System.out.println(m);
                    flag=1;
                }
                else
                {
                    m++;
                }
            }
        }
    }
}