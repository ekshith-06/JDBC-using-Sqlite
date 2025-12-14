import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
public class Preparestmt {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Sqlite\\univ.db");
        PreparedStatement stm=con.prepareStatement("select * from students where deptno > ?");
        System.out.println("Enter Range of deptno i.e > what : ");
        int dno=new Scanner(System.in).nextInt();
        stm.setInt(1, dno);
        ResultSet rs=stm.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.println(rs.getInt(4)+" ");
        }
    }
}
