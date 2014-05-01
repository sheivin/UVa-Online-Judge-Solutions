import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
class Problem_458
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
        int ch = 0;
        while ((ch = in.read()) != -1)
        {
            out.write((Character.isWhitespace((char) ch) ? ch : (ch - 7)));
        }
    }
}