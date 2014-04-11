import java.io.*;
import java.util.*;
class Problem_113
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        String line="";
        int counter=1;
        double n=0;
        double p=0;
        while(((line=br.readLine())!=null) && (line.length()!=0))
        {
            if(counter%2!=0)
            {
                n=Double.parseDouble(line);
            }
            else
            {
                p=Double.parseDouble(line);
            }
            if(counter%2==0)
            {
                System.out.println(Math.round(Math.pow(p, 1/n)));
            }
            counter++;
        }
    }
}