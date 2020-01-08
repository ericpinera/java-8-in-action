package lambdasinaction;

import java.util.stream.IntStream;

public class lambdademo {

    public static void main(String...args)
    {
        System.out.println("Hello");

        IntStream.range(0, 5)
                .forEach(i -> {System.out.println(i);});
    }
}
