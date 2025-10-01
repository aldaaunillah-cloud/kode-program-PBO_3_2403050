package hierarchical;

public class Manager extends Karyawan {
    private int jumlahTim;

    public Manager(String nama, double gaji, int jumlahTim) {
        super(nama, gaji);
        this.jumlahTim = jumlahTim;
    }

    public void kelolaTim() {
        System.out.println(nama + " mengelola " + jumlahTim + " anggota tim.");
    }
}
