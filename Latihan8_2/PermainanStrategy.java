package Latihan8_2;

public class PermainanStrategy extends Permainan {
    
    @Override
    public int hitungSkor(int hit, int miss){
        return hit*5;
    }
}
