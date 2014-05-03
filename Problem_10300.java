import java.util.Scanner;
class Problem_10300
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int cases=sc.nextInt();
            for(int i=0;i<cases;i++)
            {
                int s=0;
                int farmers=sc.nextInt();
                for(int j=0;j<farmers;j++)
                {
                    int size=sc.nextInt();
                    int ani=sc.nextInt();
                    int envi=sc.nextInt();
                    s=s+(size*envi);
                }
                System.out.println(s);
            }
        }
    }
}