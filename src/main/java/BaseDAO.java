import java.sql.*;
import java.util.List;

public abstract  class BaseDAO  <T>{

    protected Connection connection ;
    protected Statement statement ;
    protected PreparedStatement preparedStatement ;

    protected ResultSet resultSet ;

    public BaseDAO(){

    }
    public abstract void save(T object) throws Exception;
    public abstract void update(T object)throws SQLException ;

    public abstract void delete (Long id) throws SQLException;

    public abstract T getOne(Long id) throws SQLException;

    public abstract List<T> getAll() throws SQLException;


}
