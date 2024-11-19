import java.util.*;

public class Stream {
    public static void main(String[] args) {
        int [] factor=new int[]{2};

        var numbers= List.of(1,2,3);

        var stream=numbers.stream()
                .map(number->number*factor[0]);//is not pure
        factor[0]=0;
        stream.forEach(System.out::println);

        //FP lies on Lazy evaluation for efficiency
        //lazy evaluation on purity of function correctness
        //We need to make sure the lambdas are pure

        //Rules for purity(rule 1 is necessary not sufficient
        //1.the function does not make any change that is visible outside
        //2. the function does not depend on anything that may change from outside.





    }
}
