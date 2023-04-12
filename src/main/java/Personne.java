import java.util.List;

public class Personne {

    private Integer id_personne ;
    private String nom ;
    private  Integer age ;
    private List<Cours> cours ;

    public List<Cours> getCours() {
        return cours;
    }

    public Integer getId_personne() {
        return id_personne;
    }

    public String getNom() {
        return nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setId_personne(Integer id_personne) {
        this.id_personne = id_personne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id_personne=" + id_personne +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
    public Personne(Integer id_personne, String nom, Integer age) {
        this.id_personne = id_personne;
        this.nom = nom;
        this.age = age;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
}

