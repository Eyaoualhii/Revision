import java.util.Objects;

public class Client implements Comparable<Client>{
    private int code;
    private String nom;
    private String prenom;

    public Client(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNom() {

        return nom;
    }
    public void setNom(String nom) {

        this.nom = nom;
    }
    public String getPrenom() {

        return prenom;
    }
    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public int hashCode() {

        return Objects.hash(code);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Client client)) return  false;
        return Objects.equals(code,client.code) ;
    }

    public String toString() {
        return "Client{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Client cl) {
        return this.code-cl.getCode() ;
    }
}
