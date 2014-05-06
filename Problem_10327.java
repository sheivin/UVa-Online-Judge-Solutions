import java.util.*;
class Problem_10327
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[];
        StringBuffer sb=new StringBuffer("");
        while(sc.hasNext())
        {
            int elements=sc.nextInt();
            arr=new int[elements];
            for(int i=0;i<elements;i++)
            {
                arr[i]=sc.nextInt();
            }
            int steps=0;
            for(int i=0;i<elements-1;i++)
            {
                for(int j=i+1;j<elements;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        steps++;
                    }
                }
            }
            System.out.printf("Minimum exchange operations : %d\n",steps);
        }
    }
}