package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {
    public void printMyName(String name,int howManyTime){
        for(int i=1;i<=howManyTime;i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter how many time's you want to print:");
        int Howmanytime=obj1.nextInt();
        ForLoop_Q4 OBJ=new ForLoop_Q4();
        OBJ.printMyName("Prime",10);
    }
}
