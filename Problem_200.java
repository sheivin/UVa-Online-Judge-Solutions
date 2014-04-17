import java.io.*;
class Problem_200
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        String line="";
        int c=0;
        char characters[][]=new char[1000000][20];
        for(int i=0;i<1000000;i++)
        {
            for(int j=0;j<20;j++)
            {
                characters[i][j]='0';
            }
        }
        while(true)
        {
            line=br.readLine();
            if(line.charAt(0)=='#')
            {
                break;
            }
            int len=line.length();
            for(int i=0;i<len;i++)
            {
                characters[c][i]=line.charAt(i);
            }
            c++;
        }
        String final_order="";
        int l=0;
        int flag=0;;
        for(int j=0;j<20;j++)
        {
            for(int i=0;i<c;i++)
            {
                if(characters[i][j]=='0')
                {
                    continue;
                }
                flag=0;
                l=final_order.length();
                for(int k=0;k<l;k++)
                {
                    char ch=final_order.charAt(k);
                    if(characters[i][j]==ch)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag!=1)
                {
                    final_order=final_order+characters[i][j];
                }
            }
        }
        System.out.println(final_order);
    }
}