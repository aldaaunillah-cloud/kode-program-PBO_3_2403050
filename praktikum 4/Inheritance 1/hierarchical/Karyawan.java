package hierarchical;

public class Karyawan {
    protected String nama;
    protected double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void kerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    public void infoGaji() {
        System.out.println("Gaji " + nama + ": Rp " + gaji);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Gaji: " + gaji);
    }
}
