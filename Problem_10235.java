import java.io.*;
class Problem_10235
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        String line = "";
        boolean notPrime[] = checkPrime(1000 * 1000);
        while ((line = br.readLine()) != null)
        {
            int x = Integer.parseInt(line);
            if (notPrime[x])
            {
                sb.append(x).append(" is not prime.\n");
            }
            else
            {
                int r=rev(x);
                if (notPrime[r] || r==x)
                {
                    sb.append(x).append(" is prime.\n");
                }
                else
                {
                    sb.append(x).append(" is emirp.\n");
                }
            }
        }
        System.out.print(sb);
    }
    static boolean[] checkPrime(int x)
    {
        boolean notPrime[] = new boolean[x + 1];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < x + 1; i++)
        {
            if (!notPrime[i])
            {
                for (int j = i; i * j < x + 1; j++)
                {
                    notPrime[i * j] = true;
                }
            }
        }
        return notPrime;
    }
    static int rev(int x)
    {
        int b=0;
        int d=0;
        while(x!=0)
        {
            b=x%10;
            d=d*10+b;
            x=x/10;
        }
        return d;
    }
}