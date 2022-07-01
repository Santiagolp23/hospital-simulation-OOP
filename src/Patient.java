public class Patient extends User{
    private String birthday, bloodType;
    private double height, weight;

    Patient(String name, String email) {
        super(name, email);
        System.out.println("The assigned patient's name is: " + name);
        System.out.println("email is: " + email);
    }

    public String getWeight() {
        return weight + " kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getHeight() {
        return height + " meters.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Patient: " +
                "birthday=  " + getBirthday() + '\'' +
                ", bloodType= " + getBloodType() + '\'' +
                ", height= " + getHeight() +
                ", weight= " + getWeight() +
                '}';
    }
}