import java.sql.*;
public class Database{
public static void main(String []ar) throws Exception{
Class.forName("org.sqlite.JDBC");
Connection con=DriverManager.getConnection("jdbc:sqlite:C://Sqlite//univ.db");
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("select *from students");

int dno;
String dename;
while(rs.next()){
dno=rs.getInt("deptno");
dename=rs.getString("name");
System.out.println(dno+" "+dename);
}
}
}