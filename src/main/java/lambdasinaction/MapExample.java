package lambdasinaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight){
            this.weight = weight;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    @FunctionalInterface
    public interface Function<T, R>{
        R apply(T t);
    }

    public static <T, R> List<R> map(List<T> list,
                                     Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for(T s: list){
            result.add(f.apply(s));
        }
        return result;
    }

    public static List<Apple> mapApples(List<Integer> list,
                                  Function<Integer, Apple> f){
        List<Apple> result = new ArrayList<>();
        for(Integer e: list){
            result.add(f.apply(e));
        }
        return result;
    }

    public static void main(String...args) {
        // [7, 2, 6]
        List<Integer> l = map(
                Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length()
        );


        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = mapApples(weights, Apple::new);

        System.out.println(apples);

    }
}
