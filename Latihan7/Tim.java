package Latihan7;

public class Tim {
    private String nama;
    private Member []m = new Member[0];

    public void setMember(Member m){
        if(this.m.length==0){
            this.m = new Member[1];
            this.m[0] = m; 
        }
        else{
            Member member1[] = this.m;
            this.m = new Member[this.m.length+1];
            for (int i = 0;i<this.m.length-1;i++){
                this.m[i]=member1[i];
            }
            this.m[this.m.length-1] = m; 
        }
    }
 
    public void displayFullMember(){
        for (int i = 0;i<m.length;i++){
            if(m[i] instanceof Trainee){}
            else{m[i].display();}
        }
    }
    
    public void displayTrainee(){
        for (int i = 0;i<m.length;i++){
            if(m[i] instanceof Trainee ){m[i].display();}
        }
        System.out.println(""); 
    }

    public String getName(){return this.nama;}
    public void setNama(String nama){this.nama =nama;}
}
