import java.util.Scanner;
class Problem_591
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        while(true)
        {
            int stacks=sc.nextInt();
            if(stacks==0)
            {
                break;
            }
            int sum=0;
            int arr[]=new int[stacks];
            for(int i=0;i<stacks;i++)
            {
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }
            int avg=sum/stacks;
            int moves=0;
            for(int i=0;i<stacks;i++)
            {
                if(arr[i]>avg)
                {
                    moves=moves+(arr[i]-avg);
                }
            }
            System.out.println("Set #"+counter+"\nThe minimum number of moves is "+moves+".\n");
            counter++;
        }
    }
}