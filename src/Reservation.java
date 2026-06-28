
public class Reservation {

    static void add(Reservation reservation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private String nomUtilisateur;
    private Salle salle;
    private String creneau;

    public Reservation(Salle salle, String nomUtilisateur, String creneau) {
        this.nomUtilisateur = nomUtilisateur;
        this.salle = salle;
        this.creneau = creneau;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public Salle getSalle() {
        return salle;
    }

    public String getCreneau() {
        return creneau;
    }

    public static void add(Reservation reservation) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}