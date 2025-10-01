package multiple;

// Kelas yang mengimplementasikan dua interface
public class MahasiswaKerja implements Pegawai, Pelajar { // Dibuat 'public'
    private String nama;

    public MahasiswaKerja(String nama) {
        this.nama = nama;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    public void jadwalHarian() {
        bekerja();
        belajar();
    }
}