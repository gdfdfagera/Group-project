import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionUtil s = new ConnectionUtil();
        Connection con = s.connect_to_db("project", "postgres", "2222");

        s.createTable(con, "laptops");

        s.delete(con, 1);

        s.showLaptops(con, "laptops");

    }
}