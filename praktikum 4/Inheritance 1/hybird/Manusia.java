package hybird;

// Superclass
public class Manusia { // Pastikan 'public'
    protected String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}