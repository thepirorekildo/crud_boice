import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        

        while(true){
        System.out.println("Enter your Choice : ");
        System.out.println("1. Insert");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");

        Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice < 1 || choice > 4) break;

            switch(choice){
                case 1 : 
                        //create
                        System.out.println("Enter id, name, age, password");
                        int id = sc.nextInt();
                        sc.nextLine();
                        String name = sc.nextLine();
                        int age = sc.nextInt(); sc.nextLine();
                        String password = sc.nextLine();
                        Employee emp = new Employee(id, name, age, password);
                        EmployeeDao.createEmployee(emp);
                        break;
                case 2 :
                        //read
                        System.out.println("The Database Hold the following data : ");
                        ArrayList<Employee> arr = EmployeeDao.readAllEmployee();
                        for(Employee e : arr)
                            System.out.println(e);
                        break;

                case 3:
                        //update
                        System.out.println("Enter id no. and name for which you want to update");
                        id = sc.nextInt(); sc.nextLine();
                        name = sc.nextLine();
                        EmployeeDao.updateEmployee(name,id);
                        break;

                case 4: 
                        //delete
                        System.out.println("Enter id to delete");
                        id = sc.nextInt();
                        EmployeeDao.deleteEmployee(id);
                        break;

            }
        }//end of while loop
    }
}
