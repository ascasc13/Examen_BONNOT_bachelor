package exercice1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeManagerTest {

    @Test
    public void testCalculateSalaryForOneYearExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("John", "Doe", 1, "Junior");
        double expectedSalary = 20000 * (1 + 0.05 * employee.getAnneesExperience());
        assertEquals(expectedSalary, manager.calculateSalary(employee), 0.001);
    }

    @Test
    public void testCalculateSalaryForFiveYearsExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Jane", "Smith", 5, "Intermédiaire");
        double expectedSalary = 40000 * (1 + 0.05 * employee.getAnneesExperience());
        assertEquals(expectedSalary, manager.calculateSalary(employee), 0.001);
    }

    @Test
    public void testCalculateSalaryForTenYearsExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Alice", "Johnson", 10, "Senior");
        double expectedSalary = 60000 * (1 + 0.05 * employee.getAnneesExperience());
        assertEquals(expectedSalary, manager.calculateSalary(employee), 0.001);
    }

    @Test
    public void testCalculateSalaryForTwentyYearsExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Bob", "Williams", 20, "Senior");
        double expectedSalary = 60000 * (1 + 0.05 * employee.getAnneesExperience());
        assertEquals(expectedSalary, manager.calculateSalary(employee), 0.001);
    }

    @Test
    public void testInvalidEmployeeLevel() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Philip", "Johnson", 3, "Junior junior");
        manager.calculateSalary(employee);
    }

}