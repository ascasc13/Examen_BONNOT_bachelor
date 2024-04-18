package exercice1;

/**
 * Cette classe représente un employé d'une entreprise.
 */
public class Employee {
    private String prenom;
    private String nomFamille;
    private int anneesExperience;
    private String niveau;

    /**
     * Constructeur de la classe Employee.
     * @param prenom Le prénom de l'employé.
     * @param nomF Le nom de famille de l'employé.
     * @param annesEx Le nombre d'années d'expérience de l'employé.
     * @param niveau Le niveau d'expérience de l'employé (Junior, Intermédiaire, Senior).
     */
    public Employee(String prenom, String nomF, int annesEx, String niveau) {
        this.prenom = prenom;
        this.nomFamille = nomF;
        this.anneesExperience = annesEx;
        this.niveau = niveau;
    }

    /**
     * Retourne le prénom de l'employé.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom de l'employé.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne le nom de famille de l'employé.
     */
    public String getNomFamille() {
        return nomFamille;
    }

    /**
     * Définit le nom de famille de l'employé.
     */
    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    /**
     * Retourne le nombre d'années d'expérience de l'employé.
     */
    public int getAnneesExperience() {
        return anneesExperience;
    }

    /**
     * Définit le nombre d'années d'expérience de l'employé.
     */
    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    /**
     * Retourne le niveau d'expérience de l'employé.
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Définit le niveau d'expérience de l'employé.
     */
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
