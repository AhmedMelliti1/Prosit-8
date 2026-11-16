import java.util.Comparator;

class DepartementComparator implements Comparator<Departement> {

    @Override
    public int compare(Departement d1, Departement d2) {
        int result = d1.getNomDepartement().compareTo(d2.getNomDepartement());
        if (result == 0) {
            return Integer.compare(d1.getNombreEmployes(), d2.getNombreEmployes());
        }
        return result;
    }
}