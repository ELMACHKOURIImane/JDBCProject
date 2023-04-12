public class Etudiant extends Personne{

    private String cne ;

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Etudiant(Integer id_personne, String nom, Integer age, String cne) {
        super(id_personne, nom, age);
        this.cne = cne;
    }
}
