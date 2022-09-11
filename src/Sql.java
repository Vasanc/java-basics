import java.sql.*;

public class Sql {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/vasandb1";
        String uname = "root";
        String password = "root";
        String query = "select EmpName, EmpId from employee";

        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
        st.executeUpdate("insert into employee values(6,'gp',26,'ceo')");
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString("EmpName") + " " + rs.getInt("EmpId"));
        }
        st.close();
        con.close();
    }
}
