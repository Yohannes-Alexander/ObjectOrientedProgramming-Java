package Latihan8_2;

public class PermainanArcade extends Permainan{
    
    @Override
    public int hitungSkor(int hit, int miss) {
        return hit*3 - miss;
    }
}
