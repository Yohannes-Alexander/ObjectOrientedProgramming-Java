package Tugas1;

public class MyArray {
   private int[] data;
   private int maxSize;
   private int size;

    public  MyArray(){ 
        this.maxSize = 5;
        this.size = 0;
        this.data = new int[this.maxSize];
        for (int start = 0;start<this.maxSize;start++){
            this.data[start] = this.size;
        }

        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);
    }

    public MyArray(int xsize){
        this.maxSize = xsize;
        this.size = 0;
        this.data = new int[this.maxSize];
        for(int start = 0 ; start < this.maxSize; start++ ){
            this.data[start] = this.size;
        }

        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);

    }

    public void rand(int n){
        this.size=0;
        for(int start = 0;start<this.maxSize;start++){
            this.data[start]=(int) (Math.random()*(n));
            if (this.data[start]!=0){
                this.size++;
            }
        }
        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);
    }

    public void display(){
        for(int start=0;start<this.maxSize;start++){
            System.out.print(this.data[start]+"\t");
        }
        System.out.println();
    }

    public int getSize(){
        int x = this.maxSize;
        return x;
    }

    public void insert(int x){
        for(int start = (this.maxSize-1) ;start > 0 ;start--){
            this.data[start]=this.data[start-1];
        }
        this.data[0]=x; this.size=0;
        for(int start = 0;start<this.maxSize;start++){
            if (this.data[start]!=0){
                this.size++;
            }
        }
        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);
    }

    public void setElement(int position, int element){
        this.data[position]=element;

        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);
    }

    public int getElement(int position){
        int x = this.data[position];

        display();
        System.out.println("maxSize: "+this.maxSize);
        System.out.println("Size: "+this.size);
        return x;
        
    }

    public MyArray copy(){
       MyArray copy=new MyArray(this.maxSize) ;
       
       copy.data= this.data;
       copy.maxSize=this.maxSize;
       copy.size=this.size;

       return copy;
    }
}

class array{
    public static void main(String[] args) {
        
        MyArray r = new MyArray(3); 
        r.rand(10);
        r.display();
        System.out.println("Ukuran array ="+r.getSize());
        r.insert(12);
        r.setElement(1,25);
        System.out.println( "element 2 adalah "+r.getElement(2)+"\n\n");
        System.out.println("Ini Myarray s");
        
        MyArray s = r.copy();
        s.display();
    }
}
