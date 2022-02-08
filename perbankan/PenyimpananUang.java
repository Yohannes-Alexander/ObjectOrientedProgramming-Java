package perbankan;

public class PenyimpananUang extends Tabungan{
    private double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga){
        this.saldo = saldo;
        this.tingkatBunga = tingkatBunga;
    }
    public double cekUang(){
        return this.saldo+(this.saldo*this.tingkatBunga);
    }
}
