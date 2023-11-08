public class CriterePrix implements Critère{
    private float prix;
    public CriterePrix(float prix) {
        this.prix = prix;
    }
    @Override
    public boolean estSatisfaitPar(Voiture v) {
        if (v.getPrixLocation()==prix)  return true;
        return false;
    }
}
