package Latihan13;

public class Stack {
    private int size;
    private int top;
    private Object element[] ;

    public Stack(){
        this.size = 5;
        element = new Object[this.size];
        this.top = 0;
    }

    public Stack(int s){
        this.size = s;
        element = new Object[this.size];
        this.top = 0;
    }

    public int getSize(){return this.size;}

    public int getTop(){return this.top;}

    public void push(Object o){
        if(this.top < this.size){
            element[this.top] = o;
            this.top++;
            
        }
        else{
            throw new FullStackException("Penuh");
        }
        
    }

    public Object pop(){
        Object copy = 0;
        if(this.top > 0){
            copy = this.element[this.top-1];
            this.top-=1;
            this.element[this.top] = null;
            
        }
        else{
            throw new EmptyStackException("Kosong");
        }
        
        return copy;
    }

}
