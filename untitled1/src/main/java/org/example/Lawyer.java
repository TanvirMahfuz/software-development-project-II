package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lawyer {
    int lawyerID;
    String name;
    int salary;

    ArrayList<User> users = new ArrayList<>();
    void setUsers(User u){
        users.add(u);
    }
    @Override
    public String toString() {
        return "Lawyer{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}