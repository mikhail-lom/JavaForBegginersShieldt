package test_space;

import java.util.TreeSet;

public class Test {
    static String a = "xyaabbbccccdefww";
    static String b = "xxxxyyyyabklmopq";

    public static String longest (String s1, String s2){
        s1 += s2;
        System.out.println(s1);
        char[] buffer = s1.toCharArray();
        s1 = "";
        TreeSet<Character> resultSet = new TreeSet<Character>();
        for (char item :
                buffer) {
            resultSet.add(item);
        }

        for (Character item :
                resultSet) {
            s1 += item;
        }
        return s1;
    }
    public static void main(String args[]) {
        System.out.println(Test.longest(a, b));
    }

}



