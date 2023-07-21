package org.example;
import javax.swing.*;
import java.util.*;

public class Main {
     static int user_index=0;
     static int lawyer_Index=0;
     static int current_user=0;

    static User getNewUser()
    {
        User user = new User();
        user_index++;
        user.id=user_index;
        current_user=user.id-1;
        Scanner ob = new Scanner(System.in);

        System.out.println("User Name: ");
        user.name=ob.nextLine();

        System.out.println("User Input: ");
        user.input=ob.nextLine();

        return user;
    }

    static Lawyer getNewLawyer(){
        Lawyer lawyer= new Lawyer();
        lawyer_Index++;
        lawyer.lawyerID=lawyer_Index;


        Scanner ob = new Scanner(System.in);

        System.out.println("Lawyer Name: ");
        lawyer.name=ob.nextLine();

        System.out.println("Expected Salary: ");
        lawyer.salary=ob.nextInt();

        return lawyer;

    }
    static void SelectLawyer(User user ,Lawyer lawyer){
        user.setLawyer(lawyer);
    }

    static lawyerUserDatabase mp = new lawyerUserDatabase();

    static void StartHome(){
        Home ob = new Home(mp, mp.userList.get(current_user));
    }
    static void StartPreHome() {
        PreHome ob = new PreHome(mp);
        boolean home_flag = true;
    }


    //********** Main Start **********


    public static void main(String arg[]){
        Main object = new Main();
        Lawyer ob1=new Lawyer();lawyer_Index++;ob1.lawyerID=lawyer_Index;ob1.name="apurbo";ob1.salary=30000;
        Lawyer ob2=new Lawyer();lawyer_Index++;ob2.lawyerID=lawyer_Index;ob2.name="annita";ob2.salary=40000;
        mp.addNewLawyar(ob1);mp.addNewLawyar(ob2);

        while (true){
            if(mp.user_mode){
                StartHome();
            } else if (!mp.user_mode) {
                StartPreHome();
            }
        }

    }


    //********** Main end **********


  void StartMain(){
        Main ob = new Main();
      System.out.println("what kind of account would you like ");
      System.out.println("1) Lawyer");
      System.out.println("2) User");
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();

      if(a==1)initiateLawyer();
      else initiateUser();
      if(a==2) {
          int x= chooseLawyer();
          SelectLawyer(mp.userList.get(current_user),mp.lawyerList.get(x));
          System.out.println("Selected Lawyer:");
          ob.LawyerInfo(x);
      }
  }
    static void initiateUser(){
        mp.addNewUser(getNewUser());
        Main ob = new Main();
        mp.user_mode=true;
    }
    static void initiateLawyer(){
        mp.addNewLawyar(getNewLawyer());
    }
    static int chooseLawyer(){

        System.out.println("Choose lawyer:");
        mp.PrintLawyerList();
        Scanner sc = new Scanner(System.in);
        return ((sc.nextInt())-1);
    }
    void LawyerInfo(int in){
            System.out.println(mp.lawyerList.get(in).toString());
    }
    void setUser_mode(boolean x){
        mp.user_mode=x;
    }
}

