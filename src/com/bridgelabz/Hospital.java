package com.bridgelabz;

import java.security.PrivateKey;

public class Hospital {
    private String name;
   private Patient[]patients;
   private int numPatients;
   public Hospital(String name, int capacity){
       this.name=name;
       this.patients=new Patient[capacity];
       this.numPatients=0;
   }

    public String getName() {
        return name;
    }
    public void addPatient(Patient patient){
       patient[numPatients]=patient;
       numPatients++;
    }

    public Patient[] getPatients() {
        return patients;
    }
    public int getNumPatients(){
       return numPatients;
    }
    @Override
    public String toString(){
       return "Hospital Name:" +name + "Number of Patients:" +numPatients
    }
}
class Patient {
    private String name;
    private int age;
    private String phonenumber;
    private String city;
    private  String state;
    private String department;
    public Patient(String name,int age,String phonenumber,String City,String state,String department){
        this.name=name;
        this.age=age;
        this.phonenumber=phonenumber;
        this.city=city;
        this.state=state;
        this.department=department;

    }
        public String getName(){
        return name;
        }
        public int getAge(){
        return age;
        }
        public String getPhonenumber(){
        return getPhonenumber();
        }
        public String getCity(){
        return city;
        }
        public String getState(){
        return state;
        }
        public String getDepartment(){
        return department;
        }
}
      public class Main {
    public static void main(String[] args) {
      //patients
        Patient patient1=new Patient("atul",20,"445566","mumbai","MH","CARDIOLOGY");
        Patient patient=new Patient("ramesh",45,"778899","delhi","DL","NEUROLOGY");

    }
}