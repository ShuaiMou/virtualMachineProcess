package classInitOrder;


/**
 * 触发类的初始化的5种条件：
 * 1。使用new关键字实例化对象，读取或设置一个类的静态字段（被final修饰，已在编译期把结果放入常量池的静态字段除外），
 *  以及调用一个类的静态方法的时候
 *
 * 2。使用java.lang.reflect包的方法对类进行反射调用对时候，如果类没有进行过初始化，则需要先触发其初始化。
 *
 * 3。当初始化一个类的时候，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化。
 *
 * 4。当虚拟机启动时，用户需要指定一个要执行的主类（包含main方法的那个类)，虚拟机会先初始化这个主类
 *
 * 5。
 */
public class TestLoadOrder {
    static{
        System.out.println("当虚拟机启动时，用户需要指定一个要执行的主类（包含main方法的那个类)，虚拟机会先初始化这个主类");
    }
    public static void main(String[] args) {
        //1。使用new关键字实例化对象
//        InitOrder initOrder = new InitOrder();

        //1。读取或设置一个类的静态字段（被final修饰，已在编译期把结果放入常量池的静态字段除外）
//        System.out.println(InitOrder.numberOfInstance);

        //1。以及调用一个类的静态方法的时候
//        InitOrder.hello();

        //2。使用java.lang.reflect包的方法对类进行反射调用对时候，如果类没有进行过初始化，则需要先触发其初始化。
//        try {
//            InitOrder initOrder = (InitOrder) Class.forName("classInitOrder.InitOrder").newInstance();
//            System.out.println(initOrder);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }

        //3。当初始化一个类的时候，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化。
//        ChildOfInitOrder child = new ChildOfInitOrder();



    }
}
