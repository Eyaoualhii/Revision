import java.util.*;

public class Main {
    public static void main(String[] args) {

        Agence agence = new Agence("Agence");
        Voiture v1 = new Voiture(1, "peugeot", 1500);
        Voiture v2 = new Voiture(2, "clio", 1555);
        Voiture v3 = new Voiture(3, "FIAT", 1540);
        Client c1 = new Client(1, "eya", "oualhi");
        Client c2 = new Client(2, "nourhene", "dahMENI");
        Critère critere = new CritereMarque("Peugeot");

        try {

            agence.ajoutVoiture(v1);
        } catch (VoitureException| PrixNegatifException  e) {
            System.out.println("Agence plein de voiture");
        }
        try {

            agence.ajoutVoiture(v2);
        } catch (VoitureException | PrixNegatifException e){
            System.out.println("Agence plein de voiture");
        }
        try {

            agence.suppVoiture(v3);
        } catch (VoitureException e){
            System.out.println("Agence plein de voiture");
        }
        try {

            agence.loueClientVoiture(c1, v1);
        } catch (VoitureException e){
            System.out.println("Agence plein de voiture");
        }

        agence.afficheLesClientsEtLeursListesVoitures();
        //            agence.ajoutVoiture(v2);
//            agence.ajoutVoiture(v3);
//            agence.suppVoiture(v3);
//            agence.loueClientVoiture(c1, v1);
//            agence.loueClientVoiture(c2, v2);


//            agence.afficheLesClientsEtLeursListesVoitures();
//            System.out.println(agence.ensembleClientsLoueurs());
//            agence.retourClientVoiture(c2, v2);
//            agence.selectVoitureSelonCritere(critere);
//            agence.ensembleClientsLoueurs();
//            agence.collectionVoituresLouees();
//            agence.triCodeCroissant();
//            agence.triNomCroissant();





    }
}