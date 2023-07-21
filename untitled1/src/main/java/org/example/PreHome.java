package org.example;

import java.util.Scanner;

public class PreHome {
    Main ob = new Main();
    lawyerUserDatabase database;
    PreHome(lawyerUserDatabase d){
        database=d;
        System.out.println("\n\nMODE:GLOBAL\n");
        System.out.println("\t\t HOME:");
        System.out.println("A bunch of Strings...");
        System.out.println("1) create an account");
        System.out.println("2) See Lawyer List");
        System.out.println("3) Log in ");
        Scanner sc = new Scanner(System.in);
        int a;
        a= sc.nextInt();
        if(a==1) ob.StartMain();
        else if(a==2){
            for(int i=0;i<database.lawyerList.size();i++){
                System.out.println((i+1)+")"+database.lawyerList.get(i).name);
            }
        }
        else if(a==3){
            int id;

        }
    }
}
