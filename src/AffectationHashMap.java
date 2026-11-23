import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap implements IAffectation {
    Map<Employe,Departement> m=new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        m.put(e,d);
    }

    @Override
    public void afficherEmployesEtDepartements() {
        for(Map.Entry<Employe,Departement> entry : m.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    @Override
    public void supprimerEmploye(Employe e) {
        m.remove(e);
    }

    @Override
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        m.remove(e,d);
    }

    @Override
    public void afficherEmployes() {
        for (Employe e : m.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : m.values()) {
            System.out.println(d);
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return m.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return m.containsValue(d);
    }

    @Override
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(m);
    }
}
