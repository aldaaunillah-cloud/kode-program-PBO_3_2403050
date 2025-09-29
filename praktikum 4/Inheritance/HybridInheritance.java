// File: HybridInheritance.java

// Parent class
class A {
    void methodA() {
        System.out.println("Class A");
    }
}

// Child class (multilevel)
class B extends A {
    void methodB() {
        System.out.println("Class B");
    }
}

// Interface (supaya bisa multiple inheritance)
interface C {
    void methodC();
}

// Class D turunan dari B (class) + implement C (interface)
class D extends B implements C {
    public void methodC() {
        System.out.println("Class C");
    }

    void methodD() {
        System.out.println("Class D");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // dari A
        obj.methodB(); // dari B
        obj.methodC(); // dari interface C
        obj.methodD(); // dari D sendiri
    }
}
