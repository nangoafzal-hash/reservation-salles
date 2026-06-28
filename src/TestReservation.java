public class TestReservation {
    public static void main(String[] args) {
        Salle salle = new Salle("Salle A", 30);
        GestionnaireReservation g = new GestionnaireReservation();

        g.ajouterReservation(salle, "8h-10h", "Afzal");

        boolean dispo = g.estDisponible(salle, "8h-10h");
        System.out.println("Disponible ? " + dispo);
    }
}