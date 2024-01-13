import  java.util.Scanner;

class Employee {
    private String name;
    private int regNo;
    private String city;


    public Employee(String name, int regNo, String city) {
        this.name = name;
        this.regNo = regNo;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter registration number: ");
        int regNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        Employee employee = new Employee(name, regNo, city);


        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Registration Number: " + employee.getRegNo());
        System.out.println("City: " + employee.getCity());


        scanner.close();
    }
}