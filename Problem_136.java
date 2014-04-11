class Problem_136
{
    static int ugly[]=new int[1500];
    static int ptr2=0;
    static int ptr3=0;
    static int ptr5=0;
    public static void main(String args[])
    {
        ugly[0]=1;
        int i=0;
        for(i=1;i<1500;i++)
        {
            next_ugly_num(i);
        }
        System.out.println("The 1500'th ugly number is "+ugly[1499]+".");
    }
    static int minimum(int x,int y,int z)
    {
        if(x<y)
        {
            return(x<z?x:z);
        }
        return(y<z?y:z);
    }
    static void next_ugly_num(int pos)
    {
        int num2=ugly[ptr2]*2;
        int num3=ugly[ptr3]*3;
        int num5=ugly[ptr5]*5;
        ugly[pos]=minimum(num2,num3,num5);
        if(ugly[pos]==num2)
        {
            ptr2++;
        }
        if(ugly[pos]==num3)
        {
            ptr3++;
        }
        if(ugly[pos]==num5)
        {
            ptr5++;
        }
    }
}