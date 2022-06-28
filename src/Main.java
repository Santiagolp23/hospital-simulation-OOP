import ui.UIMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Diego Savarra");
        Doctor myDoctorSantiago = new Doctor();
        Doctor.showNextValidId();
        UIMenu.showMenu();
    }
}
