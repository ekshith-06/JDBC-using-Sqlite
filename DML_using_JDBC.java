import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class DML_using_JDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Sqlite\\univ.db");
        Statement stm=con.createStatement();
       // stm.executeUpdate("insert into dept values(60,'CHEMICAL ENGINEERING')");
       stm.executeUpdate("insert into dept(dname,deptno) values('EEE',80)");
        stm.close();
        con.close();
    }
}
