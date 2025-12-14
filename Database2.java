import java.sql.*;
class Database2{
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection c=DriverManager.getConnection("jdbc:sqlite:C:\\Sqlite\\univ.db");
        Statement smt=c.createStatement();
        ResultSet rs=smt.executeQuery("select * from students");
        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.println(rs.getInt(4)+" ");
        }
        smt.close();
        c.close();

    }
}