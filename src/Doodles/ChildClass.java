package Doodles;

public class ChildClass extends SuperClass {

    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Called from Child class");
    }
}
