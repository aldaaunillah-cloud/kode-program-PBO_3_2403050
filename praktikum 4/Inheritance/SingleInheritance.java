public class SingleInheritance {
    public static void main(String[] args) {
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

        Kucing k = new Kucing();
        k.makan();
        k.suara();
    }
}
