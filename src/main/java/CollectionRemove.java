import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionRemove {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);

        /*
        If we change  the List<Integer> to Collection<Integer> what will be the output?
        [2,3]
         */
        /*
        Collection<T>- remove(T) object
        List<T>      -remove(T) object

         */

        Collection<Integer> collection = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(collection);
        collection.remove(1);
        System.out.println(collection);

        List<String>stringList=new ArrayList<String>(List.of("Annayya","Ruby","Aanemari"));
        System.out.println(stringList);
        stringList.remove("Ruby");
        System.out.println(stringList);

        stringList=new ArrayList<String>(List.of("Annayya","Ruby","Aanemari"));
        System.out.println(stringList);
        stringList.remove(2);
        System.out.println(stringList);

    }
}
