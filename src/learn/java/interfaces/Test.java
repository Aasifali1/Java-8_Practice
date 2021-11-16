package learn.java.interfaces;

public abstract class Test implements TestInter{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    abstract void m3();
     void m4(){
         System.out.println("hello");
     }

}

class Test2 extends Test{
    @Override
    void m3() {
        System.out.println("Override");
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.m3();
    }

    @Override
    public void m5() {

    }
}