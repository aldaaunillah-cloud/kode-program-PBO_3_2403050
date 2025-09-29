 import java.util.ArrayList;

 public class ArrayListMain {
    

    public static void main(String[] args) {
        

        ArrayList<String> daftarNama = new ArrayList<String>();
        daftarNama.add("Alda");
        daftarNama.add("Ainun");
        daftarNama.add("Siska");
        daftarNama.add("Bunga");

        for (String nama : daftarNama) {
            System.out.println(nama);
        }



        
    }
}
