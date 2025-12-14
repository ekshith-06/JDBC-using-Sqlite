import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class DDL_DataDescription {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Sqlite\\univ.db");
        Statement stm=con.createStatement();
        stm.executeUpdate("create table temp2(a integer,b float)");
        stm.close();
        con.close(); 

    }
}
