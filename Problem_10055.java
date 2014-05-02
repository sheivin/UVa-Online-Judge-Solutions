import java.util.*;
class Problem_10055
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long diff=0;
        long num1=0;
        long num2=0;
        while(sc.hasNext())
        {
            num1=sc.nextLong();
            num2=sc.nextLong();
            if(num1>num2)
            {
                diff=num1-num2;
            }
            else
            {
                diff=num2-num1;
            }
            System.out.println(diff);
        }
    }
}