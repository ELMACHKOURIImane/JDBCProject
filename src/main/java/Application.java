public class Application {

    public static void main(String[] args) throws Exception {

        Personne p1  = new Personne(19, "sohaila" , 19);
        Etudiant et = new Etudiant(18,"ismaeil" , 21 , "546tyw");
        Professeur pr = new Professeur(20 , "hmid" , 34 , "536ty");
        PersonneDAO persoone = new PersonneDAO();
        persoone.save(et);
        persoone.save(pr);
        persoone.save(p1);
        persoone.save(p1);
    }

}
