package packagecom.example.acessemployee;
import packagecom.example.emplyoeeentity.Employee;
import org.springframework
            .stereotype
            .Repository;
import packagecom.example.emplyoeeentity.Emplyoees;

@Repository

// Class to create a list
// of employees
    public class EmployeeDAO {

        private static Emplyoees list
                = new Emplyoees();

        // This static block is executed
        // before executing the main
        // block
        static
        {

            // Creating a few employees
            // and adding them to the list
            list.getEmployeeList().add(
                    new Employee(
                            1,
                            "Prem",
                            "Tiwari",
                            "chapradreams@gmail.com"));

            list.getEmployeeList().add(
                    new Employee(
                            2, "Vikash",
                            "Kumar",
                            "abc@gmail.com"));

            list.getEmployeeList().add(
                    new Employee(
                            3, "Ritesh",
                            "Ojha",
                            "asdjf@gmail.com"));


        }

        // Method to return the list
        public Emplyoees getAllEmployees()
        {

            return list;
        }


        // Method to add an employee
        // to the employees list
        public void
        addEmployee(Employee employee)
        {
            list.getEmployeeList()
                    .add(employee);

        }
    }


