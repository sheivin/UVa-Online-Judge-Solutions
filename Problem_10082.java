import java.util.*;
class Problem_10082
{
    static char arr[]={'`','1','2','3','4','5','6','7','8','9','0','-','=',
        'Q','W','E','R','T','Y','U','I','O','P','[',']','\\',
        'A','S','D','F','G','H','J','K','L',';','\'',
        'Z','X','C','V','B','N','M',',','.','/'};
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String temp="";
            String in=sc.nextLine();
            for(int i=0;i<in.length();i++)
            {
                if(in.charAt(i)==' ')
                {
                    temp=temp+" ";
                }
                else if(in.charAt(i)=='\n')
                {
                    temp=temp+"\n";
                }
                else
                {
                    int index=find_pos(in.charAt(i));
                    temp=temp+arr[index-1];
                }
            }
            System.out.println(temp);
        }
    }
    static int find_pos(char ch)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                return i;
            }
        }
        return -1;
    }
}