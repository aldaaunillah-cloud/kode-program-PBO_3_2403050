package multilevel;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Anak a = new Anak();
        a.sifatKakek();  // method dari Kakek
        a.sifatAyah();   // method dari Ayah
        a.sifatAnak();   // method dari Anak
    }
}