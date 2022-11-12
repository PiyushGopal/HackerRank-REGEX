import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int find_hackerRank(String s)
        {
        Pattern p1=Pattern.compile("hacker[.]*rank$");
        Pattern p2=Pattern.compile("hackerrank.*$");
        Pattern p3=Pattern.compile(".+hackerrank$");
        Matcher m=p1.matcher(s);
        if(m.matches())
            {
            return 0;
        }
        m=p2.matcher(s);
        if(m.matches())
            {
            return 1;
        }
        m=p3.matcher(s);
        if(m.matches())
            {
            return 2;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
    int t;
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            t=Integer.parseInt(in.readLine());
            for(int i=0;i<t;i++)
                {
                String s=in.readLine();
                System.out.println(find_hackerRank(s));
            }  
    }
}
