package model;

public abstract class User {
    static int nextValidId;
    private int id;
    private String name, address, email, phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 8 || phoneNumber.length() > 12) {
            System.out.println("The number has to be within 8 to 12 digits");

        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: " + email +
                "\nAddress: " + address + ". Phone: " + phoneNumber;
    }

}