import java.util.*;
import java.util.Map;
public class Agence {
    private String nom;
        private ListVoitures vs;
        private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        this.vs = new ListVoitures();
        this.ClientVoitureLoue = new HashMap<>();
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        vs.ajoutVoiture(v);
    }

    public void suppVoiture(Voiture v)throws VoitureException {
        if (this.ClientVoitureLoue != null) {
            for (ListVoitures voitureList : ClientVoitureLoue.values()) {
                voitureList.supprimeVoiture(v);
            }
        }
        }

    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (!ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.put(cl, new ListVoitures());
        }

        ListVoitures listeVoituresLouees = ClientVoitureLoue.get(cl);
        listeVoituresLouees.ajoutVoiture(v);
    }

    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (this.ClientVoitureLoue != null) {
            ListVoitures listeVoitures = ClientVoitureLoue.get(cl);
            listeVoitures.supprimeVoiture(v);

        }
    }


    public List<Voiture> selectVoitureSelonCritere(Critère c) {
        List<Voiture> voitures = new ArrayList();
        if(this.vs !=null ){
            for (Voiture v : vs.getVoitures()) {
                if (c.estSatisfaitPar(v)) {
                    voitures.add(v);
                }
            }
        }
        return voitures;
    }
    public Set<Client> ensembleClientsLoueurs() {
        Set<Client> clientsLoueurs = new HashSet<>();
        if (this.ClientVoitureLoue != null) {
            for (Client cl : ClientVoitureLoue.keySet()) {
                clientsLoueurs.add(cl);
            }
        }
        return clientsLoueurs;
    }
        public Collection<ListVoitures> collectionVoituresLouees () {
            if (this.ClientVoitureLoue != null) {
                for (ListVoitures vs : ClientVoitureLoue.values()) {
                    if (ClientVoitureLoue.values() != null)
                        return ClientVoitureLoue.values();
                }
            }
            return null;
        }
        public void afficheLesClientsEtLeursListesVoitures () {
            if (this.ClientVoitureLoue != null) {
                for (Map.Entry<Client, ListVoitures> entry : ClientVoitureLoue.entrySet()) {
                    System.out.println("Client : " + entry.getKey().getCode());
                    for (Voiture v : entry.getValue().getVoitures()) {
                        System.out.println("Voitures : " + v.getImmariculation());
                    }
                }
            }
        }
        public Map<Client, ListVoitures> triCodeCroissant () {
            Map<Client,ListVoitures> tri = new TreeMap<>();
            if (this.ClientVoitureLoue != null) {
                tri.putAll(ClientVoitureLoue);
            }
            return tri;
        }
        public Map<Client, ListVoitures> triNomCroissant () {
              Map<Client,ListVoitures> tri = new TreeMap(new TriNomCroissant());
            if (this.ClientVoitureLoue != null) {
                tri.putAll(ClientVoitureLoue);
            }
              return tri;


        }

    }
