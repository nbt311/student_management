package src;

public class Student {
    private String Code;
    private String Name;
    private String DateOfBirth;

    private String Address;
    private String PhoneNumber;

    public Student(String Code, String Name,String DateOfBirth,String Address,String PhoneNumber){
        this.Code = Code;
        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String averageScore(double Math,double Physics,double Chemist){
        double average = (Math + Physics + Chemist)/3;
        return "AverageScore:" + average;
    }

    public String getinfo(){
        return "StudentCode: " + this.getCode() +"\n"
                + "Name: " + this.getName() + "\n"
                + "DateOfBirth: " + this.getDateOfBirth() + "\n"
                + "Address: " + this.getAddress() + "\n"
                + "PhoneNumber: " + this.getPhoneNumber();
    }
}
