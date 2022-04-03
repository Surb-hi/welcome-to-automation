package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> software_testing=new ArrayList<>();
        software_testing.add("Scrum");
        software_testing.add("Java");
        software_testing.add("Jira");
        software_testing.add("Selenium");
        software_testing.add("Cucumber");
        software_testing.add("Postman");
        software_testing.add("Rest Assured");

        for(String COURSE:software_testing){
            System.out.println(COURSE);
        }
    }
}
