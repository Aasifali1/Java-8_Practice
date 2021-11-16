package learn.java.interfaces;

public interface InterfaceTwo {
    public void m4();
    default void printMsg(){
        System.out.println("hello from default method");
    }

}
class TestMain {
    TestMain obj=new TestMain();
}