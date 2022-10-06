import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        // So I had an interview question that accepted two string tuples.
        // I couldn't get it for the ;ife of me becaus eI forgot my String methods.
        // Idk how they expected me to code from memory but thats just life.

        // So we were given two strings of which I assume they were concatenated. So I
        // will simulate it.
        // then I am assuming we had to calculate the area 1/2(b*h) its output seemed
        // wrong but they wanted 6 decimal places
        // so I will be practicing that too.

        String input1 = null;
        String input2 = null;
        Scanner sc = new Scanner(System.in);

        // log
        // So test input1 [3 2] (As a string so I first had to convert several strings
        // to integers... I know we needed at least 4)
        // input 2 [6 10]

        // this is just to emulate the input they gave me.
        System.out.println("Add first part of tuple");
        input1 = sc.next();
        input1 += " ";
        System.out.println("Now add second part");

        input1 += sc.next();
        System.out.println("Add first part of tuple");
        input2 = sc.next();
        input2 += " ";
        System.out.println("Now add second part");
        input2 += sc.next();

        // print the greater of either of them
        // there are 3 ways to convert a Integer to String
        // String.format(int variable);
        // Integer.toString(int variable);
        // String.valueOf(int variable)

        // so a reliable way to convert is Object.valueOf(primitive) String-> Integer
        // Integer.valueOf(string var)
        // Integer -> string String.valueOf(int var)

        // valueOf seems to be reliable and worth memorizing.
        System.out.printf("%.6f\n", getArea(input1, input2));

        // I believe this was the answer to the question but I could not formulate it.
        // Now I have an understanding of both integer parsing from string and split()

    }

    public static float getArea(String input1, String input2) {
        // input was given as one string separated by a space... I need to know what to
        // do when I am given these inputs.
        // I need to know what to do with strings when integers are expected of some
        // sort.

        String[] s1 = input1.split(" ");
        String[] s2 = input2.split(" ");

        // ok now convert them and I need to remember this going forward this is a silly
        // thing to forget.
        // String to integer is a common operation.

        // I can only assume now that we were strictly given integers so
        float b1;
        float b2;
        float h1;
        float h2;

        // convert string to integer = Integer.parseInt(StringVariable);
        // Integer.valueOf(stringvariable)
        b1 = Integer.parseInt(s1[0]);
        b2 = Integer.parseInt(s2[0]);
        h1 = Integer.parseInt(s1[1]);
        h2 = Integer.parseInt(s2[1]);

        float area1 = (b1 * h1) / 2;
        float area2 = (b2 * h2) / 2;

        return Math.max(area1, area2);
    }

}