import java.io.*;
import java.math.BigInteger;
class Problem_10302
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        String line = "";
        BigInteger sum=BigInteger.ZERO;
        BigInteger x[]=new BigInteger[50*1000+1];
        for (int i = 1; i < (50 * 1000 + 1); i++)
        {
            sum=sum.add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)).multiply(BigInteger.valueOf(i)));
            x[i] = sum;
        }
        while ((line = br.readLine()) != null) {
            int n=Integer.parseInt(line);
            sb.append(x[n]).append("\n");
        }
        System.out.print(sb);
    }
}