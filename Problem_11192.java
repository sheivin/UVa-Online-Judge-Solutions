import java.util.Scanner;
class Problem_11192
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int groups=sc.nextInt();
            if(groups==0)
            {
                break;
            }
            String line=sc.next();
            int range=(line.length())/groups;
            int counter=0;
            for(int i=0;i<groups;i++)
            {
                reverse(line.substring(counter,counter+range));
                counter=counter+range;
            }
            System.out.println();
        }
    }
    static void reverse(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}