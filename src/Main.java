
public class Main {

    public static void main(String[] args) {
        /*
        SocieteArrayList societe = new SocieteArrayList();

        // Ajouter des employés
        societe.ajouterEmploye(
                new Employe(3, "Ali", "Ahmed", "Informatique", 2)
        );

        societe.ajouterEmploye(
                new Employe(1, "Sami", "Mohamed", "RH", 1)
        );

        societe.ajouterEmploye(
                new Employe(2, "Amira", "Sara", "Informatique", 1)
        );

        societe.ajouterEmploye(
                new Employe(4, "Youssef", "Ali", "RH", 2)
        );

        // Affichage initial
        System.out.println("=== Liste des employés ===");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("\nRecherche par nom :");
        System.out.println(societe.rechercherEmploye("Ali"));

        // Tri par ID
        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par département, grade et nom
        System.out.println("\n=== Tri personnalisé ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Recherche par département
        System.out.println("\n=== Employés du département Informatique ===");

        for (Employe e :
                societe.rechercherParDepartement("Informatique")) {
            System.out.println(e);
        }*/
        DepartementHashSet dh = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Informatique", 15);
        Departement d4 = new Departement(4, "Finance", 25);
        Departement d5 = new Departement(5, "RH", 30);

        dh.ajouterDepartement(d1);
        dh.ajouterDepartement(d2);
        dh.ajouterDepartement(d3);
        dh.ajouterDepartement(d4);
        dh.ajouterDepartement(d5);

        System.out.println("Before sorting:");
        dh.afficherDepartements();

        System.out.println("\nAfter sorting:");
        dh.trierDepartementsParNomEtNombreEmployes();
        System.out.println("\nTri By Id:");

        dh.trierDepartementsParId();
    }
}
