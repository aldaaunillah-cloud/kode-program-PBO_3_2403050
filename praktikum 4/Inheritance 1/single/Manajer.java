package single;

// Subclass
public class Manajer extends Karyawan { 
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji); // memanggil konstruktor superclass
        this.departemen = departemen;
    }

    public void pimpinTim() {
        System.out.println(nama + " memimpin tim di departemen " + departemen);
    }
}