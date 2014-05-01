import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Problem_492
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        String m="";
        StringBuilder temp=new StringBuilder("");
        while (true)
        {
            int c = br.read();
            if (c < 0)
            {
                break;
            }
            char ch=(char)c;            
            if((ch>='a' && ch<='z') || (ch>='A' &&ch<='Z'))
            {
                temp.append(ch);
            }
            else
            {
                if(temp.length()>0)
                {
                    sb.append(changeWord(temp.toString()));
                }
                sb.append(ch);
                temp=new StringBuilder("");
            } 
        }
        System.out.print(sb);
    }
    static String changeWord(String s)
    {
        if(s.charAt(0)=='a' || s.charAt(0)=='e'|| s.charAt(0)=='i'|| s.charAt(0)=='o'|| s.charAt(0)=='u'||
           s.charAt(0)=='A' || s.charAt(0)=='E'|| s.charAt(0)=='I'|| s.charAt(0)=='O'|| s.charAt(0)=='U')
        {
            return s+"ay";
        }
        return s.substring(1)+s.charAt(0)+"ay"; 
    }
}