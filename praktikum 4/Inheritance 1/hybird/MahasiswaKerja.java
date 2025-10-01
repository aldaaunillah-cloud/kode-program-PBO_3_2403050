package hybird;

public class MahasiswaKerja extends Manusia implements Pekerja, Pelajar {
    public MahasiswaKerja(String nama) {
        super(nama);
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja paruh waktu");
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar di kampus");
    }

    public void jadwal() {
        System.out.println(nama + " membagi waktu antara kuliah dan kerja");
    }
}