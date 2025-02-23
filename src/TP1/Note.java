package TP1;


class Note {
    private String intitule;
    private float valeur;

    public Note(String intitule, float valeur) {
        this.intitule = intitule;
        this.valeur = valeur;
    }

    public float getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return intitule + " : " + valeur;
    }
}
