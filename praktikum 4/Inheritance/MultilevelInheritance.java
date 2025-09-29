class Hewan {
    void hidup() {
        System.out.println("Hewan hidup");
    }
}

class Mamalia extends Hewan {
    void menyusui() {
        System.out.println("Mamalia menyusui");
    }
}

class Kucing extends Mamalia {
    void suara() {
        System.out.println("Meong");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.hidup();      // dari Hewan
        k.menyusui();   // dari Mamalia
        k.suara();      // dari Kucing
    }
}
