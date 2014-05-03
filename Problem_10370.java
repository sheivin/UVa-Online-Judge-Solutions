import java.util.Scanner;
class Problem_10370
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++)
        {
            int N=sc.nextInt();
            int arr[]=new int[N];
            int sum=0;
            float average=0;
            for(int j=0;j<N;j++)
            {
                arr[j]=sc.nextInt();
                sum=sum+arr[j];
            }
            average=sum/N;
            int num=0;
            for(int k=0;k<N;k++)
            {
                if(arr[k]>average)
                {
                    num++;
                }
            }
            System.out.printf("%.3f%%%n",(float)num*100/N);
        }
    }
}