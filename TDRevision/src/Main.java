import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
        Agence agence = new Agence("Agence");
        Voiture v1 = new Voiture(1, "peugeot", 1500);
        Voiture v2 = new Voiture(2, "clio", 1555);
        Voiture v3 = new Voiture(3, "FIAT", 1540);
        Client c1 = new Client(1, "eya", "oualhi");
        Client c2 = new Client(2, "nourhene", "dahmeni");
        Critère critere = new CritereMarque("Peugeot");



            agence.ajoutVoiture(v1);

            agence.ajoutVoiture(v2);
            agence.ajoutVoiture(v3);
            agence.loueClientVoiture(c1, v1);
            agence.loueClientVoiture(c1, v2);
            agence.loueClientVoiture(c2, v3);

            agence.retourClientVoiture(c1, v2);

            List<Voiture> voituresSelonCritere = agence.selectVoitureSelonCritere(critere);
            System.out.println("Voitures selon le critère:");
            for (Voiture v : voituresSelonCritere) {
                System.out.println(v.getImmariculation() + " - " + v.getMarque() + " - " + v.getPrixLocation());
            }
            Set<Client> clientsLoueurs = agence.ensembleClientsLoueurs();

            System.out.println("Clients loueurs: " + clientsLoueurs);
            Collection<ListVoitures> voituresLouees = agence.collectionVoituresLouees();

            System.out.println("Voitures louées: " + voituresLouees);
            agence.afficheLesClientsEtLeursListesVoitures();

            Map<Client, ListVoitures> triCodeCroissant = agence.triCodeCroissant();
            System.out.println("Tri par code croissant: " + triCodeCroissant);

            Map<Client, ListVoitures> triNomCroissant = agence.triNomCroissant();
            System.out.println("Tri par nom croissant: " + triNomCroissant);
        } catch (VoitureException e) {
            System.out.println(e);
        }


    }
}