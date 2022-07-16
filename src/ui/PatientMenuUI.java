package ui;

import model.Doctor;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PatientMenuUI {

    public static void showPatientMenu(){
        int response = 0;
        do {

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + MenuUI.loggedPatient.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientAppointments();
                    break;
                case 0:
                    MenuUI.showMenu();
                    break;
            }


        }while (response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            //
            Map<Integer, Map <Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < DoctorMenuUI.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = DoctorMenuUI.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map <Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), DoctorMenuUI.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }

            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> availableDoctorSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor selectedDoctor = new Doctor("","");
            for (Map.Entry<Integer, Doctor> doc:availableDoctorSelected.entrySet()) {
                indexDate = doc.getKey();
                selectedDoctor = doc.getValue();
                
            }
            System.out.println(selectedDoctor.getName() + ". Date: " + selectedDoctor.getAvailableAppointments().get(indexDate).getDate() +
                    " Time: " + selectedDoctor.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change");
            response = Integer.valueOf(sc.nextLine());
            if (response == 1) {
                MenuUI.loggedPatient.addAppointmentDoctors(selectedDoctor, selectedDoctor.getAvailableAppointments().get(indexDate).getDate(null),
                        selectedDoctor.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }

            

        }while (response!= 0);
    }

    private static void showPatientAppointments() {
        int reponse = 0;
        do {
            if (MenuUI.loggedPatient.getAppointmentDoctors().size() == 0) {
                System.out.println("No appointments to show");
                break;
            }

            for (int i = 0; i < MenuUI.loggedPatient.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + " Date: "+ MenuUI.loggedPatient.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + MenuUI.loggedPatient.getAppointmentDoctors().get(i).getTime() + " Doctor:" +
                        MenuUI.loggedPatient.getAppointmentDoctors().get(i).getDoctor(""));
            }
            System.out.println("0. Return");
        } while (reponse!=0);
    }
}
