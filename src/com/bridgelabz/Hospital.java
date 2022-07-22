package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    enum Department{
        surgery,  gynaecology, obstetrics, paediatrics, eye;
    }

    ArrayList<PatientDetails> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void add(){
        System.out.println("Patient Id: ");
        int patientId = sc.nextInt();
        System.out.println("Patient name: ");
        String patientName = sc.next();
        System.out.println("City: ");
        String city = sc.next();
        System.out.println("State: ");
        String state = sc.next();
        System.out.println("Department: ");
        Department dep = Department.valueOf(sc.next());

        PatientDetails details = new PatientDetails(patientId,patientName,city,state,dep);
        list.add(details);
    };

    void edit(){
        System.out.println("Patient ID");
        int patientId = sc.nextInt();
        for (PatientDetails details : list) {
            if (patientId == details.getPatientId()){
                details.editExisting();
            }
        }
    };
    void delete(){
        System.out.println("Patient ID");
        int patientId = sc.nextInt();
        for (PatientDetails details : list) {
            if (patientId == details.getPatientId()){
                list.remove(details);
            }
        }
    };
}
