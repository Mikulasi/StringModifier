package by.epam.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyString {
    public static void main(String[] args) {

        String input = "qwertyuiop.lkjhgfdser, fghjklkjhgfghjkl/hgfdghgfdsdfg";
        String regx = "[a-z0-9_]{1,200}+\\.?\\w{0,50}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println("Output is:" + matcher.group());
        }
    }
}
