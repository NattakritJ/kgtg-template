package tech.kbtg.demo;

public class FizzBuzz {

    public static String handle(int[] i) {
        StringBuilder builder = new StringBuilder();
        for (int ii : i) {
            if (ii % 3 == 0 && ii % 5 == 0)
                builder.append("FizzBuzz");
            else if (ii % 3 == 0)
                builder.append("Fizz");
            else if (ii % 5 == 0)
                builder.append("Buzz");
            else
                builder.append(ii);

            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
