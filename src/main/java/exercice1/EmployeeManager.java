package exercice1;

/**
 * Cette classe gère les opérations liées aux employés, telles que le calcul du salaire.
 */
public class EmployeeManager {

    /**
     * Calcule le salaire d'un employé en fonction de son niveau et de son expérience.
     * @param employee L'employé pour lequel le salaire doit être calculé.
     * @return Le salaire calculé de l'employé.
     * @throws IllegalArgumentException Si le niveau d'expérience de l'employé est invalide.
     */
    public double calculateSalary(Employee employee) {
        double baseSalary;
        switch (employee.getNiveau()) {
            case "Junior":
                baseSalary = 20000;
                break;
            case "Intermédiaire":
                baseSalary = 40000;
                break;
            case "Senior":
                baseSalary = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau d’expérience invalide");
        }

        double experienceMultiplier = calculateExperienceMultiplier(employee.getAnneesExperience());
        return baseSalary * experienceMultiplier;
    }

    /**
     * Calcule le coefficient d'ancienneté en fonction du nombre d'années d'expérience.
     * @param anneesExperience Le nombre d'années d'expérience de l'employé.
     * @return Le coefficient d'ancienneté calculé.
     */
    public double calculateExperienceMultiplier(int anneesExperience) {
        return 1 + (0.05 * anneesExperience);
    }
}
