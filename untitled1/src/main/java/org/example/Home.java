package org.example;

import java.util.Scanner;

public class Home {
    boolean show_user=false;
    User user;
    static Main ob = new Main();
    static lawyerUserDatabase database = new lawyerUserDatabase();
    Home(lawyerUserDatabase d,User user1){
        database=d;user = user1;
        System.out.println("\n\nMODE:USER\n");
        System.out.println("\t\t HOME:");
        System.out.println("A bunch of Strings...");
        System.out.println("1) View User Profile");
        System.out.println("2) See All Lawyer List");
        System.out.println("3) change Lawyer");
        System.out.println("4) Add new User");
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a==1) System.out.println(user1.toString());
        else if (a==2) LawyerSection();
        else if(a==3) {
            System.out.println("Select Lawyer: ");
            LawyerSection();
            Scanner sc1 = new Scanner(System.in);
            user.ChangeLawyer(database.lawyerList.get(sc.nextInt()-1),user.lawyer);
            System.out.println(user.toString());
        }
        else if(a==4){
            database.user_mode=false;
        }
        else doNothing();

    }

    static void LawyerSection(){
        database.PrintLawyerList();
    }

    static void doNothing(){

    }
}
