package automationtest;

public class IfThenElse_Q3 {

    public boolean isTeen(int age,String name){
        if (age<=18){
            return true;
        }else
           return false;

    }

    public static void main(String[] args) {
        IfThenElse_Q3 OBJ1=new IfThenElse_Q3();
        System.out.println(OBJ1.isTeen(15,"SURBHI"));
    }

}
