
import java.util.ArrayList;

/*

Wrapper Class
int --> Integer.parseInt("35");
double --> Double.parseDouble
char --> Character.parseCharacter

Integer.MAXVALUE
Integer.MINVALUE
*/  

public class notes {

public static void main (String[]args){

    Integer x = 55;
    int y = x;
    System.out.println(y);

    ArrayList<Integer> al = new ArrayList<>();
    al.add(100);
    al.add(500);
    System.out.println(al);

    int num1 = Integer.parseInt("100");
    int num2 = Integer.parseInt("102");
    System.out.println(num2 + num1);
    System.out.println(Integer.toBinaryString(num1));


    // =============================== Character
    Character c = 'm';
    System.out.println(Character.isDigit(c));


    // =============================== RegionMatches
    String s = "Okay World, let's gooooo.";
    System.out.println(s.regionMatches(3, "w", 2, 5));
    System.out.println(s.substring(5, 10));
}
}

/* 
 static methods you dont need to call the object to use their methods
 instance methods are the ones that are not static methods

tokenizing
String [] tokens = s.split(" ");
for (String t: tokens)
{
    System.out.println(t);
}

String s5 = "aw.drewtales@gmail.com";
String [] tokens = s.split("[@.]");
for (String t1: tokens)
{
    System.out.println(t1);
}


 */

    