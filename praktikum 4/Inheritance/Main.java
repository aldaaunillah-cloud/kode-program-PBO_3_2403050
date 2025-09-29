class Hewan {
    void makan() {
        System.out.println("Hewan makan");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan();
        k.suara();
    }
}
