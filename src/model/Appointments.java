package model;

import java.util.Date;

public class Appointments implements ISchedulable{

    private int id;
    private User healthProvider;
    private Patient patient;
    private Date date;
    private String time;

    Appointments(User healthProvider, Patient patient, Date date, String time) {
        if (healthProvider instanceof Patient) {
            System.out.println("Cannot assign appointment with patients");
        } else {
            this.healthProvider = healthProvider;
            this.patient = patient;
            this.date = date;
            this.time = time;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
    public void schedule(Date date, String time) {

    }
}
