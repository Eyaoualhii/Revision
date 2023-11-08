public class CritereMarque implements Critère{
    private String marque;
    public CritereMarque(String marque) {
        this.marque = marque;
    }
    @Override
    public boolean estSatisfaitPar(Voiture v) {
        if (v.getMarque()==marque)  return true;
        return false;
    }
}
