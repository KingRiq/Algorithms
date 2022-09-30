public class Fibdriver {
    public static void main(String[] args) {
        testFibMemo(0);
        testFibTab(0);
        testFib(0);
    }

    public static void testFib(int i) {

        // lets test this
        final long number = i;
        long startTime, endTime, duration;
        int toSeconds = 1000000000;
        System.out.println("Fib (" + i + ")");

        startTime = System.nanoTime();
        long result = Fib.fib(number);
        endTime = System.nanoTime();
        duration = endTime - startTime;// 1000000
        // printArr(a);
        System.out.println("Result = " + result + ". This Took " + (double) duration / toSeconds + "seconds");

        if (i < 50) {
            i++;
            testFib(i);
        }
    }

    public static void testFibMemo(int i) {

        // lets test this
        final long number = i;
        long startTime, endTime, duration;
        int toSeconds = 1000000000;
        System.out.println("FibMemo (" + i + ")");

        startTime = System.nanoTime();
        long result = Fib.fibMemo(number);
        endTime = System.nanoTime();
        duration = endTime - startTime;// 1000000
        // printArr(a);
        System.out.println("Result = " + result + ". This Took " + (double) duration / toSeconds + "seconds");

        if (i < 92) {
            i++;
            testFibMemo(i);
        }
    }

    public static void testFibTab(int i) {

        // lets test this
        final long number = i;
        long startTime, endTime, duration;
        int toSeconds = 1000000000;
        System.out.println("FibTab (" + i + ")");

        startTime = System.nanoTime();
        long result = Fib.fibTab(number);
        endTime = System.nanoTime();
        duration = endTime - startTime;// 1000000
        // printArr(a);
        System.out.println("Result = " + result + ". This Took " + (double) duration / toSeconds + "seconds");

        if (i < 92) {
            i++;
            testFibTab(i);
        }
    }

}