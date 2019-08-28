package classInitOrder;

public class ChildOfInitOrder extends InitOrder{
    static{
        System.out.println("the ChildOfInitOrder class is initializing");
    }
}
