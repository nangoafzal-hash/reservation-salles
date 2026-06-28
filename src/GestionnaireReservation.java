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

    public boolean ajouterReservation(Salle salle, String creneau, String nomUtilisateur) {
        if (!estDisponible(salle, creneau)) {
            System.out.println("refusé : " + salle.getNom() + " déjà prise à " + creneau);
            return false;
        }
        listeReservations.add(new Reservation(nomUtilisateur, salle, creneau));
        System.out.println("ok : " + nomUtilisateur + " réserve " + salle.getNom() + " à " + creneau);
        return true;
    }

    public void annulerReservation(Reservation res) {
        listeReservations.remove(res);
    }
}