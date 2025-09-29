interface Terbang {
    void terbang();
}

interface Berenang {
    void berenang();
}

class Bebek implements Terbang, Berenang {
    public void terbang() {
        System.out.println("Bebek terbang");
    }
    public void berenang() {
        System.out.println("Bebek berenang");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bebek b = new Bebek();
        b.terbang();
        b.berenang();
    }
}
