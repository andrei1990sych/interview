import java.util.ArrayList;
import java.util.List;

public class Generics {
    private static class Animal {
        private String name;
        private Integer age;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Animal> objects = new ArrayList<>();

        System.out.println(strings.getClass() == numbers.getClass());
        System.out.println(numbers.getClass() == objects.getClass());
    }
}