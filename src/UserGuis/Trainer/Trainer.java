package UserGuis.Trainer;

public class Trainer {
    private String name;
    private String address;
    private String contactNumber;
    private String email;
    private String education;
    private String experience;
    private String dateOfBirth;

    public Trainer(String name, String address, String contactNumber, String email, String education, String experience, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
        this.education = education;
        this.experience = experience;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getExperience() {
        return experience;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    @Override
    public String toString()
    {
        String s = name +" "+address + " "+contactNumber + " " + email + " " + education + " " + experience + " "+ dateOfBirth;
        return s;
    }
    
}
