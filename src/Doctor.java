import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    static int nextValidId;
    String specialty;


    Doctor(String name, String specialty, String email) {
        super(name, email);
        this.specialty = specialty;
        super.setId(++nextValidId);
        System.out.println("The assigned doctor's name is: " + this.getName());
        System.out.println("The assigned id is: " + getId());
    }

    public static void showNextValidId() {
        System.out.println(nextValidId);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
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
    }

}
