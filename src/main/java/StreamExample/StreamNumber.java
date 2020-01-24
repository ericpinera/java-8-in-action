package StreamExample;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamNumber {
    public static void main(String[] args) {
        Stream.iterate(1,(x) -> x + 1).limit(20).forEach(x -> {
            if (x % 3 == 0 && x % 5 == 0){
                System.out.println(x + ": Multiplo 3 y 5");
            }
            if(x % 2 == 0){
                System.out.println(x + ": Multiplo 2");
            }
            if(x % 3 == 0){
                System.out.println(x + ": Multiplo 3");
            }
        });
    }

}
