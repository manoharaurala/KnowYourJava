import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> funds = List.of("Nippon Debt Fund", "HDFC midcap fund", "Zerodha Nifty 250 index ELSS FUND", "ICIC Regular Gold fund", "PPFS", "Quant small cap fund");
        List<String> fundsInUpperCase = new ArrayList<>();
        /*funds.stream()
                .map(String::toUpperCase)
                .forEach(fundsInUpperCase::add);*/
        // Mutation is OK.
        // Sharing is good thing
        // But shared mutability is devils work
        //mutability is moving around with in a train.-It is ok
        //Shared mutability is putting head outside train when it is moving

        //What could possible go wrong with this code

        /*funds.parallelStream()
                .map(String::toUpperCase)
                .forEach(fundsInUpperCase::add);
        System.out.println(funds.size());
        System.out.println(fundsInUpperCase.size());
        fundsInUpperCase.clear();*/

        //Solution to this problem

        fundsInUpperCase = funds.parallelStream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(funds.size());
        System.out.println(fundsInUpperCase.size());


    }
}
