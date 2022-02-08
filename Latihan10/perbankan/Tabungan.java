package Latihan10.perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo =saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }
    
    public void simpanUang(int jumlah){
        this.saldo += jumlah; 
    }
    
    public boolean ambilUang(int jumlah){
        boolean check = false;
        if (this.saldo>=jumlah){
            this.saldo -=  jumlah;
            check = true; 
        }
        return check;
    }
}
