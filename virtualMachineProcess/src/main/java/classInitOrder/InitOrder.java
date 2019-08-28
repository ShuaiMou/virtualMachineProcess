package classInitOrder;

public class InitOrder {
    static{
        System.out.println("the InitOrder class is initializing");
    }

    public static int numberOfInstance = 1;

    public  static void hello(){
        System.out.println("hello");
    }

}
