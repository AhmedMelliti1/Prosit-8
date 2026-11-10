import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe>{
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes,
                Comparator.comparing(Employe::getNomDepartement)
                        .thenComparingInt(Employe::getGrade)
                        .thenComparing(Employe::getNom)
        );
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> res = new ArrayList<>();

        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                res.add(e);
            }
        }
        return res;
    }
}
