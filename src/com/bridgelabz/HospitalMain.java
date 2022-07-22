package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;


public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //

        Hospital.Department surgery = Hospital.Department.surgery;
        Hospital.Department gynaecology = Hospital.Department.gynaecology;
        Hospital.Department obstetrics = Hospital.Department.obstetrics;
        Hospital.Department paediatrics = Hospital.Department.paediatrics;

        Hospital holySpirit = new Hospital();
        Hospital sevenHills = new Hospital();
        Hospital patelNursingHome = new Hospital();
        Hospital sanjiveeni = new Hospital();

        HashMap<String,Hospital> map = new HashMap<>();
        map.put("Holy Spirit",holySpirit);
        map.put("Seven Hills",sevenHills);
        map.put("Patel Nursing Home",patelNursingHome);
        map.put("Sanjiveeni",sanjiveeni);

        while (true){
            System.out.println("Our facilities in: HolySpirit, SevenHills, PatelNursingHome, Sanjiveeni");
            System.out.println("Enter hospital name: ");
            String check = sc.next();

            if (check.equals("HolySpirit")) {
                System.out.println("1. Add\n2. Edit\n3. Delete");
                int opt = sc.nextInt();
                if(opt == 1)
                    holySpirit.add();
                else if (opt == 2) {
                    holySpirit.edit();
                } else if (opt == 3) {
                    holySpirit.delete();
                }
                System.out.println(holySpirit.list);
            } else if (check.equals("SevenHills")) {
                System.out.println("1. Add\n2. Edit\n3. Delete");
                int opt = sc.nextInt();
                if (opt == 1)
                    sevenHills.add();
                else if (opt == 2) {
                    sevenHills.edit();
                } else if (opt == 3) {
                    sevenHills.delete();
                }
                System.out.println(sevenHills.list);
            } else if (check.equals("PatelNursingHome")) {
                System.out.println("1. Add\n2. Edit\n3. Delete");
                int opt = sc.nextInt();
                if (opt == 1)
                    patelNursingHome.add();
                else if (opt == 2) {
                    patelNursingHome.edit();
                } else if (opt == 3) {
                    patelNursingHome.delete();
                }
                System.out.println(patelNursingHome.list);
            } else if (check.equals("Sanjiveeni")) {
                System.out.println("1. Add\n2. Edit\n3. Delete");
                int opt = sc.nextInt();
                if (opt == 1)
                    sanjiveeni.add();
                else if (opt == 2) {
                    sanjiveeni.edit();
                } else if (opt == 3) {
                    sanjiveeni.delete();
                }
                System.out.println(sanjiveeni.list);
            }
            //for reference hashmap
            else if (check.equals("hashmap")) {
                System.out.println("1.HolySpirit\n2.SevenHills\n3.PatelNursingHome\n4.Sanjiveeni");
                int opt = sc.nextInt();
                if (opt == 1)
                    System.out.println(map);
                else if (opt == 2) {
                    System.out.println(map.get("Seven Hills"));
                } else if (opt == 3) {
                    System.out.println(map.get("Patel Nursing Home"));
                } else if (opt == 4) {
                    System.out.println(map.get("Sanjiveeni"));
                }
            }
        }

    }
}
