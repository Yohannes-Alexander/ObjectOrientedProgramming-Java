package UTSMatrix;

public class Matriks {
    private int[][] element;
    private int sizeRow;
    private int sizeColumn;

    public Matriks(int sizeRow, int sizeColumn){
        this.sizeRow = sizeRow;
        this.sizeColumn = sizeColumn;
        element = new int[this.sizeRow][this.sizeColumn];
    }
    public Matriks(int[][] element){
        this.element = element;
        this.sizeRow = element.length;
        this.sizeColumn = element[0].length;
    }

    public void setElement(int row , int col,int value){this.element[row][col] = value;}
    public int getSizeRow(){return this.sizeRow;}
    public int getSizeColumn(){return this.sizeColumn;}
    public int getValue(int row, int col){return this.element[row][col];}
    public void display(){
        for (int row = 0 ; row < this.sizeRow;row++){
            for (int col = 0; col < this.sizeColumn;col++){
                System.out.print(this.element[row][col]+"\t");
            }
            System.out.println("");
        }
    }
    public Matriks penjumlahan2Matriks(Matriks matriks1, Matriks matriks2){
        Matriks Resultelement = new Matriks(this.sizeRow, this.sizeColumn);
        for(int row = 0 ; row < this.sizeRow;row++){
            for(int col = 0 ; col < this.sizeColumn;col++){
                Resultelement.element[row][col] =matriks1.getValue(row, col)+matriks2.getValue(row, col);
            }
        }
        return Resultelement;
    }

    public Matriks pengurangan2Matriks(Matriks matriks1, Matriks matriks2){
        Matriks Resultelement = new Matriks(this.sizeRow, this.sizeColumn);
        for(int row = 0 ; row < this.sizeRow;row++){
            for(int col = 0 ; col < this.sizeColumn;col++){
                Resultelement.element[row][col] = matriks1.getValue(row, col)-matriks2.getValue(row, col);
            }
        }
        return Resultelement;
    }
    
}
