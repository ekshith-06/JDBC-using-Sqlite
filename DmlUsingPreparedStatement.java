import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class DmlUsingPreparedStatement {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Sqlite\\univ.db");
        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
        Scanner p=new Scanner(System.in);
        System.out.println("Enter roll , name , city , deptno of student : ");
        int roll=p.nextInt();
        String name=p.next();
        String city=p.next();
        int deptno=p.nextInt();
        stm.setInt(1, roll);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setObject(4, deptno);
        stm.executeUpdate();
        stm.close();
        con.close();

    }
}
