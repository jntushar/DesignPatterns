package CreationalDesignPatterns.BuilderPattern;


public class Main {
    public static void main(String[] args) {
        Employee fresherEmployee = new Employee().firstName("Tushar").lastName("Jain")
                .employeeId("101").age(22).isFresher(true).build();

        Employee experiencedEmployee = new Employee().firstName("Siddharth").lastName("Sharma")
                .employeeId("302").lastCTC(1000000.0).previousCompany("OLX").age(25).build();

    }
}
