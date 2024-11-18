import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(numbers);//[1,2,3]
        numbers.remove(1);
        System.out.println(numbers);//[2,3]

        /*
        What we change Collection<Integer> to var what will be output?
        [1,3]
         */
        var collection = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(collection);
        collection.remove(1);
        System.out.println(collection);
    }
}
