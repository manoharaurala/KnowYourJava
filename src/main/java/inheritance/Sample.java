package inheritance;

public class Sample {
    public static void main(String[] args) {
        try {
            new Derived("");
        } catch (RuntimeException exception) {
            System.out.println(exception);

        }

        //NullPointerException
//The constructor of Base is first called, before the body of Derived constructor is run.
//The Base's constructor calls check() and that runs the check in Derived before value is
//assigned.

//Do not call virtual functions from within constructors. Even better, don't do anything
//significant from the constructor.
    }
}
