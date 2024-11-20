package inheritance;

public class Derived extends Base{
    private String value;
    public Derived(String value) {
        this.value=value;
        System.out.println("Derived class constructor");
    }

    public void check(){
        System.out.println("Derived class check method");
        if(value.length()==0) throw new RuntimeException("value given is empty");
    }
}
