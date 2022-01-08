package CreationalDesignPatterns.BuilderPattern;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String expertise;
    private String previousCompany;
    private Boolean isFresher;
    private int experience;
    private int age;
    private Double lastCTC;

    public Employee employeeId(String employeeId){
        this.employeeId = employeeId;
        return this;
    }

    public Employee firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public Employee lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Employee expertise(String expertise){
        this.expertise = expertise;
        return this;
    }

    public Employee previousCompany(String previousCompany){
        this.previousCompany = previousCompany;
        return this;
    }

    public Employee isFresher(Boolean isFresher){
        this.isFresher = isFresher;
        return this;
    }

    public Employee experience(int experience){
        this.experience = experience;
        return this;
    }

    public Employee age(int age){
        this.age = age;
        return this;
    }

    public Employee lastCTC(Double lastCTC){
        this.lastCTC = lastCTC;
        return this;
    }

    public Employee build(){
        return this;
    }



}
