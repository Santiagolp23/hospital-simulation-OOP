import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Diego Navarra", "Pediatrics", "test@email.com");

        Patient myPatient = new Patient("Santiago Lopez", "fulano@gmail.com");
        myPatient.setPhoneNumber("12345678901");
        myPatient.setAddress("Calle 99, N 4-12");

/*        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "9am");

        for (Doctor.AvailableAppointment Aa: myDoctor.getAvailableAppointments()) {
            System.out.println(Aa.getDate() + " " + Aa.getTime());
        }*/

        System.out.println(myPatient.toString());
    }
}
