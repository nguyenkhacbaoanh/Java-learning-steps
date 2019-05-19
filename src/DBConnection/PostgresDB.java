package DBConnection;

// import these Class to connect to all kind DB
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// java I/O
import java.util.Scanner;

public class PostgresDB {
	private final String url = "jdbc:postgresql://localhost/Exo17_1";
	private final String user = "nguyenkhacbaoanh";
	private final String password = "Baoanh";
	
	// this is Class Overriding in Java
	public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password); //method getConnection to allow to connect
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
	public static void main(String[] args) {
//		System.out.println("Hello Postgresql");
		PostgresDB pgdb = new PostgresDB();
		System.out.println("Your Query for pet table: \nEX: select * from pet where age >= 5 limit 10;\n");
		Scanner obj = new Scanner(System.in);
		String SQLQuery = (String)obj.nextLine();
		obj.close();
		try {
			Statement stmt = pgdb.connect().createStatement();
			ResultSet rs = stmt.executeQuery(SQLQuery);
			while (rs.next()) {
				System.out.println(rs.getString("petid") + "\t\t"
	                    + rs.getString("name") + "\t\t"
	                    + rs.getString("kind") + "\t\t"
	                    + rs.getString("gender") + "\t\t"
	                    + rs.getInt("age") + "\t\t"
	                    + rs.getInt("ownerid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
