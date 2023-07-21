package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class lawyerUserDatabase {

    ArrayList<Lawyer> lawyerList= new ArrayList();
    ArrayList<User> userList = new ArrayList<>();

    void addNewUser(User user){
        userList.add(user);
    }
    void addNewLawyar(Lawyer lawyer){
        lawyerList.add(lawyer);
    }


    boolean user_mode= false;

    public void PrintLawyerList() {
        for(int i = 0; i<lawyerList.size();i++){
            System.out.print(lawyerList.get(i).lawyerID+") ");
            System.out.print(lawyerList.get(i).name + " (salary : ");
            System.out.print(lawyerList.get(i).salary+") ");
            System.out.println();
        }

    }

}
