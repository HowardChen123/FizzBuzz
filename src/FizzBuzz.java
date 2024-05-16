import java.util.List;
import java.util.ArrayList;

/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    static String fizzBuzzWhileLoop(int n) {

        int i = 1;
        List<String> res = new ArrayList<String>();

        while (i < n) {

            doFizzBuzz(i, res);
            i ++;

        }
        return res.toString();

    }

    private static void doFizzBuzz(int i, List<String> res) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            res.add("FizzBuzz");

        } else if (divisibleBy3) {

            res.add("Fizz");

        } else if (divisibleBy5) {

            res.add("Buzz");

        } else {

            res.add(Integer.toString(i));

        }
    }

    static String fizzBuzzForLoop(int n) {

        List<String> res = new ArrayList<String>();

        for (int i = 1; i < n; i++) {

            doFizzBuzz(i, res);

        }
        return res.toString();
    }

    public static void main(String[] args) {

        String forResult = fizzBuzzForLoop(10);
        String whileRes = fizzBuzzWhileLoop(10);

        System.out.println(forResult);
        System.out.println(whileRes);

        System.out.println(whileRes.equals(forResult));

    }
}
