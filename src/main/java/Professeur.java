public class Professeur extends Personne{

    private  String doti ;

    public String getDoti() {
        return doti;
    }
    public void setDoti(String doti) {
        this.doti = doti;
    }
    public Professeur(Integer id_personne, String nom, Integer age, String doti) {
        super(id_personne, nom, age);
        this.doti = doti;
    }
}

