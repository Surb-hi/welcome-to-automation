package automationtest;

public class Variable_Q2 {
    int id;
    String name;

    public Variable_Q2(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void disply(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Variable_Q2 obj1=new Variable_Q2(10,"surbhi");
         obj1.disply();
        Variable_Q2 obj2=new Variable_Q2(20,"Prime");
        obj2.disply();

    }
}
