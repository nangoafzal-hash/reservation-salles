import java.util.ArrayList;

public class GestionnaireReservation {
    private ArrayList<Reservation> listeReservations;

    public GestionnaireReservation() {
        this.listeReservations = new ArrayList<>();
    }

    public boolean estDisponible(Salle salle, String creneau) {
        for (Reservation r : listeReservations) {
            if (r.getSalle().getNom().equals(salle.getNom())
                && r.getCreneau().equals(creneau)) {
                return true; 
            }
        }
        return false; 
    }
}