package Latihan2;
import java.util.Scanner;

public class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang(){
        return this.pembilang;
    }

    public int getPenyebut(){
        return this.penyebut;
    }

    public Pecahan tambah(Pecahan pecahan){
        int penyebutResult;
        if(this.penyebut==pecahan.penyebut){
            penyebutResult=this.penyebut;
        }
        else{
            penyebutResult = this.penyebut * pecahan.penyebut;
        }

        int pembilangResult =((penyebutResult/this.penyebut)*this.pembilang)
        +((penyebutResult/pecahan.penyebut)*pecahan.pembilang);
        
        
        int i=2;int seq=0;
        if(pembilangResult<penyebutResult){
            while(seq==0){
                if(!(pembilangResult%i == 0 && penyebutResult%i  == 0)){
                    while (!(pembilangResult%i == 0 && penyebutResult%i  == 0 )){
                        i++;
                        // System.out.println(i);
                        if(i>penyebutResult){
                            break;
                        }
                    }
                    if(i<=penyebutResult){
                        pembilangResult = pembilangResult / i;
                        penyebutResult = penyebutResult/i;
                        i=2;
                    }
                    else{
                        break;
                    }
                }
                else{
                    pembilangResult = pembilangResult / i;
                    penyebutResult = penyebutResult/i;
                }
            }

        }else{
            while(seq==0){
                if(!(pembilangResult%i == 0 && penyebutResult%i  == 0)){
                    while (!(pembilangResult%i == 0 && penyebutResult%i  == 0 )){
                        i++;
                        // System.out.println(i);
                        if(i>pembilangResult){
                            break;
                        }
                    }
                    if(i<=pembilangResult){
                        pembilangResult = pembilangResult / i;
                        penyebutResult = penyebutResult/i;
                        i=2;
                    }
                    else{
                        break;
                    }
                }
                else{
                    pembilangResult = pembilangResult / i;
                    penyebutResult = penyebutResult/i;
                }
            }
        }
        Pecahan FinalResult = new Pecahan(pembilangResult,penyebutResult);
        return FinalResult;
    }

    public Pecahan perkalian(Pecahan pecahan){
        int penyebutResult = this.penyebut  * pecahan.penyebut;
        int pembilangResult =this.pembilang * pecahan.pembilang;
        
        int i=2;int seq=0;
        if(pembilangResult<penyebutResult){
            while(seq==0){
                if(!(pembilangResult%i == 0 && penyebutResult%i  == 0)){
                    while (!(pembilangResult%i == 0 && penyebutResult%i  == 0 )){
                        i++;
                        // System.out.println(i);
                        if(i>penyebutResult){
                            break;
                        }
                    }
                    if(i<=penyebutResult){
                        pembilangResult = pembilangResult / i;
                        penyebutResult = penyebutResult/i;
                        i=2;
                    }
                    else{
                        break;
                    }
                }
                else{
                    pembilangResult = pembilangResult / i;
                    penyebutResult = penyebutResult/i;
                }
            }

        }else{
            while(seq==0){
                if(!(pembilangResult%i == 0 && penyebutResult%i  == 0)){
                    while (!(pembilangResult%i == 0 && penyebutResult%i  == 0 )){
                        i++;
                        // System.out.println(i);
                        if(i>pembilangResult){
                            break;
                        }
                    }
                    if(i<=pembilangResult){
                        pembilangResult = pembilangResult / i;
                        penyebutResult = penyebutResult/i;
                        i=2;
                    }
                    else{
                        break;
                    }
                }
                else{
                    pembilangResult = pembilangResult / i;
                    penyebutResult = penyebutResult/i;
                }
            }
        }   

        Pecahan FinalResult = new Pecahan(pembilangResult,penyebutResult);
        return FinalResult;
    }
    
}

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ,b,c,d;
        System.out.print("Pembilang pecahan 1 : ");
        a = input.nextInt();
        System.out.print("Penyebut pecahan 2 : ");
        b = input.nextInt();
        while(b==0){
            System.out.println("Masukkan nilai penyebut yang tidak sama dengan 0");
            System.out.print("Penyebut pecahan 2 : ");
            b = input.nextInt();
        }
        System.out.print("Pembilang pecahan 1 : ");
        c = input.nextInt();
        System.out.print("Penyebut pecahan 2 : ");
        d = input.nextInt();
        while(d==0){
            System.out.println("Masukkan nilai penyebut yang tidak sama dengan 0");
            System.out.print("Penyebut pecahan 2 : ");
            d = input.nextInt();
        }
        Pecahan fractions1 = new Pecahan(a,b);
        Pecahan fractions2 = new Pecahan(c,d);
        System.out.println("Objek 1 = "+fractions1.getPembilang()+" / "+fractions1.getPenyebut());
        System.out.println("Objek 2 = "+fractions2.getPembilang()+" / "+fractions2.getPenyebut());

        Pecahan penjumlahan = fractions1.tambah(fractions2); // that's addition
        
        System.out.println("Hasil penjumlahannya = "+penjumlahan.getPembilang()+" / "+penjumlahan.getPenyebut());

        penjumlahan = fractions1.perkalian(fractions2); // that's multiply
        System.out.println("Hasil perkaliannya = "+penjumlahan.getPembilang()+" / "+penjumlahan.getPenyebut());

    }
}
