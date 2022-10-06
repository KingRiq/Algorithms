
/**
 * typeConversion
 */
import java.util.Random;

public class typeConversion {

    public static void main(String[] args) {
        // practice changing types;

        // lets us create a string of random numbers
        String randomString = randomIntString();
        System.out.println(randomString);

        // we can do this two ways
        int integer = Integer.parseInt(randomString);
        double doubleNum = Double.parseDouble(randomString);
        float floatNum = Float.parseFloat(randomString);
        long longNum = Long.parseLong(randomString);

        // log
        System.out.println("int " + integer);
        System.out.println("double " + doubleNum);
        System.out.println("float " + floatNum);
        System.out.println("long " + longNum);

        // or These return the wrapper class
        integer = Integer.valueOf(randomString);
        doubleNum = Double.valueOf(randomString);
        floatNum = Float.valueOf(randomString);
        longNum = Long.valueOf(randomString);

        // log
        System.out.println("int " + integer);
        System.out.println("double " + doubleNum);
        System.out.println("float " + floatNum);
        System.out.println("long " + longNum);

        // proof
        // produces error because a primitive is returned compilation error

        // System.out.println(Integer.parseInt(randomString).getClass().getName());
        // System.out.println(Double.parseDouble(randomString).getClass().getName());
        // System.out.println(Float.parseFloat(randomString).getClass().getName());
        // System.out.println(Long.parseLong(randomString).getClass().getName());

        // works because wrapper Object is returned
        System.out.println(Integer.valueOf(randomString).getClass().getName());
        System.out.println(Double.valueOf(randomString).getClass().getName());
        System.out.println(Float.valueOf(randomString).getClass().getName());
        System.out.println(Long.valueOf(randomString).getClass().getName());

        /*
         * // test random edge cases
         * // converting to something else
         * String num = null;
         * 
         * // int to others
         * doubleNum = Double.parseDouble(integer);
         * longNum = Long.parseLong(integer);
         * floatNum = Float.parseFloat(integer);
         * num = String.format(integer);
         * 
         * System.out.println("double " + doubleNum);
         * System.out.println("float " + floatNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * doubleNum = Double.valueOf(integer);
         * floatNum = Float.valueOf(integer);
         * longNum = Long.valueOf(integer);
         * num = String.valueOf(integer);
         * 
         * System.out.println("double " + doubleNum);
         * System.out.println("float " + floatNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * // double to others
         * integer = Integer.parseInteger(doubleNum);
         * longNum = Long.parseLong(doubleNum);
         * floatNum = Float.parseFloat(doubleNum);
         * num = String.format(doubleNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("float " + floatNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * integer = Integer.valueOf(doubleNum);
         * floatNum = Float.valueOf(doubleNum);
         * longNum = Long.valueOf(doubleNum);
         * num = String.valueOf(doubleNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("float " + floatNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * // float to others
         * integer = Integer.parseInteger(floatNum);
         * doubleNum = Double.parseDouble(floatNum);
         * longNum = Long.parseLong(floatNum);
         * num = String.format(floatNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("double " + doubleNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * integer = Integer.valueOf(floatNum);
         * doubleNum = Double.valueOf(floatNum);
         * longNum = Long.valueOf(floatNum);
         * num = String.valueOf(floatNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("double " + doubleNum);
         * System.out.println("long " + longNum);
         * System.out.println("string " + num);
         * 
         * // long to others
         * integer = Integer.parseInteger(longNum);
         * doubleNum = Double.parseDouble(longNum);
         * floatNum = Float.parseFloat(longNum);
         * num = String.format(longNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("double " + doubleNum);
         * System.out.println("float " + floatNum);
         * System.out.println("string " + num);
         * 
         * integer = Integer.valueOf(longNum);
         * doubleNum = Double.valueOf(longNum);
         * floatNum = Float.valueOf(longNum);
         * num = String.valueOf(longNum);
         * 
         * System.out.println("int " + integer);
         * System.out.println("double " + doubleNum);
         * System.out.println("float " + floatNum);
         * System.out.println("string " + num);
         */

        // the previous test taught me that you can only pass the primitive of the
        // Object or a String any other type will render an error

    }

    public static String randomIntString() {
        Random rd = new Random(); // creating Random object

        // get a random int and convert it to string.
        return String.valueOf(rd.nextInt());
    }
}