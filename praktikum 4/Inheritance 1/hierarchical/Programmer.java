package hierarchical;

public class Programmer extends Karyawan {
    private String bahasaPemrograman;

    public Programmer(String nama, double gaji, String bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void coding() {
        System.out.println(nama + " sedang ngoding pakai " + bahasaPemrograman + ".");
    }
}
