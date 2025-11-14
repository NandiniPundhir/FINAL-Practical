import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Add");
            System.out.println("2 Update");
            System.out.println("3 Remove");
            System.out.println("4 Display");
            System.out.println("5 Exit");
            System.out.print("Choice: ");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Salary: ");
                    double s = sc.nextDouble();
                    list.add(new Employee(id, n, s));
                    break;

                case 2:
                    System.out.print("ID to update: ");
                    int uid = sc.nextInt();
                    for (Employee e : list) {
                        if (e.id == uid) {
                            sc.nextLine();
                            System.out.print("New Name: ");
                            e.name = sc.nextLine();
                            System.out.print("New Salary: ");
                            e.salary = sc.nextDouble();
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID to remove: ");
                    int rid = sc.nextInt();
                    list.removeIf(e -> e.id == rid);
                    break;

                case 4:
                    for (Employee e: list) System.out.println(e);
                    break;

                case 5:
                    return;
            }
        }
    }
}
