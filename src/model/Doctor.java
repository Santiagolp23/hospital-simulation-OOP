package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    static int nextValidId;
    String specialty;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String specialty, String email) {
        super(name, email);
        this.specialty = specialty;
        super.setId(++nextValidId);
        System.out.println("The assigned doctor's name is: " + this.getName());
        System.out.println("The assigned id is: " + getId());
    }

    public static void showNextValidId() {
        System.out.println(nextValidId);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialty: " + specialty + "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        public Date date;
        public String time;
        private int id;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public void printVariables() {
            System.out.println(date + time);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }

}