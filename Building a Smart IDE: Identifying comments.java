/*java 15*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String text = "";
        String regex = "(\\/)(\\*)(.|\\s)*?\\2\\1|(\\/\\/.*)";
        
        while (input.hasNextLine()) {
            sb.append(input.nextLine().trim());
            sb.append("\n");
        }
        
        text = sb.toString();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    
}
