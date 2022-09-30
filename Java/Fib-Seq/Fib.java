public class Fib {

    // calculates the nth fib number
    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // fib using memoization
    public static long fibMemo(long n) {

        // create a array that will be our memo
        long[] count = new long[(int) n + 1];

        // we will calculate n and pass a memo as a reference. (More memory to go
        // faster)
        return calculate(n, count);
    }

    private static long calculate(long n, long[] count) {
        // if n is our base case simply return it
        if (n <= 1)
            return n;
        // if count[n] == 0 then we have not calculated fib(n) yet
        if (count[(int) n] > 0)
            return count[(int) n];
        // store what we found in our memo (pro tip: we dont have to recalculate this
        // because the code above)
        count[(int) n] = calculate(n - 1, count) + calculate(n - 2, count);
        return count[(int) n];
    }

    // fib using tabulation
    public static long fibTab(long n) {

        // create an array n+1
        long[] count = new long[(int) n + 1];

        // base case
        if (n >= 0)
            count[0] = 0;
        if (n >= 1)
            count[1] = 1;

        // iterate from 2 to n+1
        for (int i = 2; i < count.length; i++) {
            count[i] = count[i - 1] + count[i - 2];

        }

        return count[(int) n];
    }

}