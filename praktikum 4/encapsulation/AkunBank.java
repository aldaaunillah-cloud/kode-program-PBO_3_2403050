public class AkunBank {

    private int saldo;

    public AkunBank (int saldo){
        this.saldo = saldo;

    }
    public void setSaldo(int saldo){
        this.saldo = saldo;

    }
    public int getsaldo(){
        return this.saldo ;
    }

    //method menabung
    public int menabung(int saldo) {
    if (saldo > 0) { 
        this.saldo += saldo; 
        System.out.println("Berhasil menabung Rp" + saldo);
    } else {
        System.out.println("Jumlah harus melebihi 10");
    }
    return this.saldo; 
}
    public void tarikTunai(int saldo) {
        if (this.saldo - saldo <= 10) {
            System.out.println("Saldo harus tersisa Rp10");
        } else {
            this.saldo -= saldo;
            System.out.println("Berhasil tarik tunai Rp" + saldo);
        }
    
 }

}