// Facture.java
public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;
        double tarifHT = prix * quantite;
        double tva = 0.20;
        double tarifTTC = tarifHT * (1 + tva);
        
        System.out.println("Prix unitaire: " + prix);
        System.out.println("Quantité: " + quantite);
        System.out.println("Montant HT: " + tarifHT);
        System.out.println("Montant TTC: " + tarifTTC);
    }
}
