import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Diego Navarra", "Pediatrics", "test@email.com");

        Patient myPatient = new Patient("Santiago Lopez", "fulano@gmail.com");
        myPatient.setPhoneNumber("12345678901");
        myPatient.setAddress("Calle 99, N 4-12");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "9am");

        System.out.println(myDoctor);

    }
}
