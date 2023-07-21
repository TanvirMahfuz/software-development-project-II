package org.example;

import java.util.List;
import java.util.Scanner;
public class User {
    int id;
    String name;
    String input;
    Lawyer lawyer;

    void setLawyer(Lawyer lawyer){
        this.lawyer=lawyer;
        lawyer.setUsers(this);
    }
     void ChangeLawyer(Lawyer lawyer, Lawyer lawyer0){

        if(lawyer0.lawyerID==lawyer.lawyerID){}
        else {
            this.setLawyer(lawyer);
            // search function
            for (int i = 0; i < lawyer0.users.size(); i++) {
                if (lawyer0.users.get(i).id == this.id) {
                    lawyer0.users.set(i, null);
                }
            }
        }
    }

    void setInput(String s){
        this.input=s;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lawyer=" + lawyer.name +
                '}';
    }
}