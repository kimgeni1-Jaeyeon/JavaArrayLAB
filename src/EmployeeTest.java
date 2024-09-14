import java.util.Scanner;

class Employee {
    String name;
    String address;
    int money;
    int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                ", number=" + number +
                '}';
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();


        for(int i=0; i<3; i++){
            employees[i].setAddress(scan.next());
            employees[i].setMoney(scan.nextInt());
            employees[i].setNumber(scan.nextInt());
            employees[i].setName(scan.next());
        }

        for(Employee a :employees){
            System.out.println(a);
        }
    }
}