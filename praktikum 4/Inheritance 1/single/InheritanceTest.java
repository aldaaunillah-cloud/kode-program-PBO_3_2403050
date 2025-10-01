package single;

// Main program
public class InheritanceTest {
    public static void main(String[] args) {
        Manajer manajer1 = new Manajer("Budi", 7000, "IT");
        manajer1.kerja();         // method dari superclass Karyawan
        manajer1.infoGaji();      // method dari superclass Karyawan
        manajer1.pimpinTim();     // method dari subclass Manajer
    }
}