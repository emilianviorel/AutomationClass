package moduleA9;

// Class representing ClassC implementing InterfaceA and InterfaceB
public class ClassC implements InterfaceA, InterfaceB {

    // Implementation of methodA from InterfaceA
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    // Implementation of methodB from InterfaceB
    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}
