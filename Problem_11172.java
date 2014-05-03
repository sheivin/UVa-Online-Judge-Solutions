import java.util.Scanner;
class Problem_11172
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++)
        {
            long a=sc.nextInt();
            long b=sc.nextInt();
            long diff=a-b;
            if(diff==0)
            {
                System.out.println("=");
            }
            else if(diff>0)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("<");
            }
        }
    }
}