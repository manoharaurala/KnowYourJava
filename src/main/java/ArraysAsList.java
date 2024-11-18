import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        //Mutable fixed size list returned by Arrays.asList
        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        //It is far from being immutable
        System.out.println(list.getClass());
        try{
            list.add(11);
        }
        catch (Exception e){
            System.out.println("add unsupported:"+e.getMessage());
        }

        try {
            list.set(4,13);
        }
        catch (Exception e){
            System.out.println("set unsupported");
        }

        System.out.println(list);

        List<Integer>number=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(number.getClass());
        //number.add(6); it is immutable list add operation not supported

        //of provide immutable collection won't allow null values
    }
}
