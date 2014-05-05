import java.io.*;
class Problem_499
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[];
        String line="";
        while((line=br.readLine())!=null)
        {
            arr=new int[53];
            for(int i=0;i<line.length();i++)
            {
                char ch=line.charAt(i);
                if(ch>96 && ch<123)
                {
                    arr[ch-70]++;
                }
                else if(ch>64 && ch<91)
                {
                    arr[ch-64]++;
                }
            }
            int max=0;
            for(int i=0;i<53;i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
            }
            for(int i=0;i<27;i++)
            {
                if(max==arr[i])
                {
                    sb.append((char)(i+64));
                }
            }
            for(int i=27;i<53;i++)
            {
                if(max==arr[i])
                {
                    sb.append((char)(i+70));
                }
            }
            sb.append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}