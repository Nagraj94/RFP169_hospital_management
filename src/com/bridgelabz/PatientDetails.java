package com.bridgelabz;

/*
Hospital Management System
Maintain Multiple patients in an hospital.
Also maintain multiple hospitals in a Map (Key=> hospitalname , value => hospital object)
Patient Details -> Pateient Id , Name , Department(in which he is admitted),
city,state.
Create Edit,Add and Delete options for patients.
Patient Id will be unique in a hospital.
 search a patient by patientId while editing.
Hospital class will have hospital name, List of Patients.
Create a main class with main method separately.
For Departments use ENUM
 */

import java.util.Scanner;

public class PatientDetails {

    int patientId;
    String patientName;
    String city;
    String state;

    public PatientDetails(int patientId, String patientName, String city, String state, Hospital.Department dep) {
        super();
        this.patientId = patientId;
        this.patientName = patientName;
        this.city = city;
        this.state = state;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "PatientDetails " +
                "patientId = " + patientId +
                ", patientName = " + patientName +
                ", city = " + city +
                ", state = " + state ;
    }

    public void editExisting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Patient Id: ");
        patientId = sc.nextInt();
        System.out.println("Patient name: ");
        patientName = sc.next();
        System.out.println("City: ");
        city = sc.next();
        System.out.println("State: ");
        state = sc.next();
        System.out.println("Department: ");
        Hospital.Department dep = Hospital.Department.valueOf(sc.next());
    }
}
