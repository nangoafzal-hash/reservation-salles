
public class Reservation {
    private String nomUtilisateur;
    private Salle salle;
    private String creneau;

    public Reservation(String nomUtilisateur, Salle salle, String creneau) {
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
}