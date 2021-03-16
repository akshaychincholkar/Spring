package java8;

@java.lang.FunctionalInterface
interface MyInterface{
    public abstract  void  myMethod();
    public static  void  staticMethod(){};
    public default void defaultMethod(){};
}
public class FunctionalInterface{
    public static void main(String[] args){
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello world for functional interface");
            }
        };

        MyInterface myInterface1 = () -> {
            System.out.println("Hello world for functional interface using lambda");
        };
        myInterface1.myMethod();
    }
}