import java.util.ArrayList;
public class Salle {
    private String nom;
    private int capacite;
    private ArrayList<String> creneaux;
    
    public Salle(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.creneaux = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    
    public int getCapacite() {
        return capacite;
    }
    public ArrayList<String> getCreneaux() {
         return creneaux; }
}