import java.util.Comparator;

public class TriNomCroissant implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        System.out.println(o1.getNom().compareTo(o2.getNom()));
        return o1.getNom().compareTo(o2.getNom());
    }
}
