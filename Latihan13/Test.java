package Latihan13;

public class Test {
    Stack stack;
    public Test(){stack = new Stack();}
    public Test(int s){stack = new Stack(s);}
    public void testStackPush(){
        try{
            stack.push("3");
            stack.push("4");
            System.out.println(stack.pop().toString());
            stack.push("5");
            stack.push("6");
            stack.push("7");
            stack.push("8");
            stack.push("9");
        }catch(FullStackException e){
            System.out.println("Full");
        }finally{
            System.out.println("Yang ini selalu dijalankan");
        }
    }

    public void testStackPop(){
        try{
            stack.push("1");
            stack.push("2");
            System.out.println(stack.pop().toString());
            System.out.println(stack.pop().toString());
            System.out.println(stack.pop().toString());
        }catch(EmptyStackException e){
            System.out.println(e.toString());
        }finally{
            System.out.println("Yang ini selalu dijalankan");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testStackPop();
        t.testStackPush();
    }
}
