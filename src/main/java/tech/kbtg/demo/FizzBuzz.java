package tech.kbtg.demo;

public class FizzBuzz {

    public static String handle(int i) {
        StringBuilder builder = new StringBuilder();
        for (int j = 1; j <= i; j++) {
            if (j % 3 == 0 && j % 5 == 0)
                builder.append("FizzBuzz");
            else if (j % 3 == 0)
                builder.append("Fizz");
            else if (j % 5 == 0)
                builder.append("Buzz");
            else
                builder.append(j);

            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
