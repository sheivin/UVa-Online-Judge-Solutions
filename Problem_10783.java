import java.util.Scanner;
class Problem_10783
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        int counter=0;
        for(int i=0;i<cases;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            counter++;
            System.out.print("Case "+counter+": ");
            sum_odd(a,b);
        }
    }
    static void sum_odd(int a,int b)
    {
        int s=0;
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
                s=s+i;
            }
        }
        System.out.println(s);
    }
}