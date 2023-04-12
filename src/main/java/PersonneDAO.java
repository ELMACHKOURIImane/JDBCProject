import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonneDAO extends BaseDAO<Personne> {

    @Override
    public void save(Personne object) throws Exception {
        Connection con = ConnectionSinglton.getconnection();
        String request = " insert into personne (id_personne , nom , age , cne , doti , dtype ) values (? , ? , ? , ? , ? , ?)";
        PreparedStatement st = con.prepareStatement(request);
        st.setInt(1 , object.getId_personne());
        st.setString(2,object.getNom());
        st.setInt(3,object.getAge());

        if(object instanceof  Etudiant){
        st.setString(4 , ((Etudiant) object).getCne());
        st.setString(5,null);
        st.setString(6,"Etudiant");
        } else if (object instanceof  Professeur){
            st.setString(4 , null);
            st.setString(5,((Professeur) object).getDoti());
            st.setString(6,"Professeur");
        }
        else{
            st.setString(4 , null);
            st.setString(5,null);
            st.setString(6,"Personne");
        }

        st.executeUpdate();

    }

    @Override
    public void update(Personne object) throws SQLException {

    }

    @Override
    public void delete(Long id) throws SQLException {

    }

    @Override
    public Personne getOne(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Personne> getAll() throws SQLException {
        return null;
    }
}
