package HW_04_1.model;

public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty;
    private Double salary;

    public Developer() {

    }
    public Developer(Long id, String firstName, String lastName, String specialty, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID= " + id +
                ", first name= '" + firstName + '\'' +
                ", last name= '" + lastName + '\'' +
                ", specialty= '" + specialty + '\'' +
                ", salary= '" + salary +
                "'\n";
    }
}