package hybird;

// Demo
public class hybirdinheritanceDemo {
    public static void main(String[] args) {
        MahasiswaKerja mhs = new MahasiswaKerja("Ani");

        mhs.makan();     // method dari superclass Manusia
        mhs.bekerja();   // method dari interface Pekerja
        mhs.belajar();   // method dari interface Pelajar
        mhs.jadwal();    // method khusus subclass MahasiswaKerja
    }
}