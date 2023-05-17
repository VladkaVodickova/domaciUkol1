package engeto.java.lesson2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guests {
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer age;
    private LocalDate dateOfBirth;

    //constructor of must information
    public Guests(String firstName, String lastName, Integer age, String dateOfBirthStr){
        setFirstName(firstName);
        setLastName(lastName);
        fullName = firstName + " " + lastName;
        setAge(age);
        setDateOfBirth(dateOfBirthStr);
    }
    public Guests(String firstName, String lastName, String dateOfBirthStr){
        setFirstName(firstName);
        setLastName(lastName);
        fullName = firstName + " " + lastName;
        setDateOfBirth(dateOfBirthStr);
    }

    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    //setters
    public void setFirstName(String firstName){
        if (firstName.length() >= 1){
            this.firstName=firstName;
        } else {
            throw new IllegalArgumentException("Enter valid first name.");
        }
    }

    public void setLastName(String lastName){
        if (lastName.length() >= 1){
            this.lastName=lastName;
        } else {
            throw new IllegalArgumentException("Enter valid last name.");
        }
    }

    public void setAge(Integer age){
        if (age == null){
            throw new NullPointerException();
        } else if (age <= 0 || age >= 120) {
            throw new IllegalArgumentException("Enter valid age - numbers between 0 and 120.");
        } else {
            this.age=age;
        }
    }

    public void setDateOfBirth(String dateOfBirthStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
        if (dateOfBirth.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Enter correct date of birth.");
        } else {
            this.dateOfBirth=dateOfBirth;
        }
    }

    public String getDescription (){
        if (age == null){
            return "\nName: " + this.fullName + "\nDate of Birth: " + this.dateOfBirth;
        } else {
            return "\nName:" + this.fullName + "\nDate of Birth: " + this.dateOfBirth + "\nAge: " + this.age;
        }
    }
}
