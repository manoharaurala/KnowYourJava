import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List.of(1,2,3)
                .stream()
                .parallel()
                .map(number->transform(number))
                .sequential()
                .forEach(number->print(number));
    }

    private static void print(int number) {
        System.out.println("print: "+Thread.currentThread());
    }

    private static int transform(int number) {
        System.out.println("transform: "+Thread.currentThread());
        return number*2;
    }
}
