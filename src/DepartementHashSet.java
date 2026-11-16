import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    HashSet<Departement> departements= new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for(Departement d:departements){
            System.out.println(d.toString());
        }
    }

    @Override
    public void trierDepartementsParId() {
        TreeSet<Departement> sorted = new TreeSet<>(departements);
        for (Departement d : sorted) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        TreeSet<Departement> sorted = new TreeSet<>(new DepartementComparator());
        sorted.addAll(departements);
        for (Departement d : sorted) {
            System.out.println(d);
        }
    }
}
