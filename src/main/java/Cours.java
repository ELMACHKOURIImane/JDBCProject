public class Cours {
    private Integer id_cour ;
    private  String nom ;
    private  Integer coef ;
    private Personne personne ;

    public Integer getId_cour() {
        return id_cour;
    }

    public String getNom() {
        return nom;
    }

    public Integer getCoef() {
        return coef;
    }

    public void setId_cour(Integer id_cour) {
        this.id_cour = id_cour;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCoef(Integer coef) {
        this.coef = coef;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Cours(Integer id_cour, String nom, Integer coef, Personne personne) {
        this.id_cour = id_cour;
        this.nom = nom;
        this.coef = coef;
        this.personne = personne;
    }

}
