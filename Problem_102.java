import java.util.*;
class Problem_102
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int bin_cap[] = new int [9];
            int total_val[] = new int[6];
            for(int i=0;i<9;i++)
            {
                bin_cap[i] =sc.nextInt();
            }
            total_val[1] = bin_cap[3] + bin_cap [6] + bin_cap[1] + bin_cap[7] + bin_cap[2] + bin_cap[5]; 
            total_val[0] = bin_cap[3] + bin_cap [6] + bin_cap[2] + bin_cap[8] + bin_cap[1] + bin_cap[4]; 
            total_val[4] = bin_cap[4] + bin_cap [7] + bin_cap[0] + bin_cap[6] + bin_cap[2] + bin_cap[5]; 
            total_val[5] = bin_cap[4] + bin_cap [7] + bin_cap[2] + bin_cap[8] + bin_cap[0] + bin_cap[3]; 
            total_val[2] = bin_cap[5] + bin_cap [8] + bin_cap[0] + bin_cap[6] + bin_cap[1] + bin_cap[4]; 
            total_val[3] = bin_cap[5] + bin_cap [8] + bin_cap[1] + bin_cap[7] + bin_cap[0] + bin_cap[3]; 
            int min = 2147483647;
            int pos=0;
            for(int i=0;i<6;i++)
            {
                if (total_val[i]<min )
                {
                    min=total_val[i];
                    pos = i;
                }
            }
            switch(pos)
            {
                case 0 :
                    System.out.println("BCG " + min);
                    break;
                case 1 :
                    System.out.println("BGC " + min);
                    break;
                case 4 :
                    System.out.println("GBC " + min);
                    break;
                case 5 :
                    System.out.println("GCB " + min);
                    break;
                case 2 :
                    System.out.println("CBG " + min);
                    break;
                case 3 :
                    System.out.println("CGB " + min);
                    break;
            }
        }
    }
}
