public class Doctor {
    static int nextValidId = 0;
    int id;
    String name;

    Doctor() {
        id = ++nextValidId;
    }

    Doctor(String name) {
        this.name = name;
        id = ++nextValidId;
        System.out.println("The assigned doctor's name is: " + this.name);
        System.out.println(id);
    }

    public void printName() {
        System.out.println(name);
    }
}
