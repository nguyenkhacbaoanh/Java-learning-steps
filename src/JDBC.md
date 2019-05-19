# JDBC with Postgress

## install Drive class
- add dependency in pom.xml of Maven
```
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.2.5.jre7</version>
  <type>bundle</type>
</dependency>
```
- or download jar file from that link [postgresql for java8](https://jdbc.postgresql.org/download/postgresql-42.2.5.jar)

## Declare url, user, pw:
```java
private final String url = "jdbc:postgresql://localhost/your_database";
private final String user = "user name";
private final String password = "user password";
```

## import those of Class to Override:
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
```
- override them to Class

```java
public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
```

## import class for query data:

````java
import java.sql.ResultSet;
import java.sql.Statement;
```

- sample query:

```java
PostgresDB pgdb = new PostgresDB();
Statement stmt = pgdb.connect().createStatement();
			ResultSet rs = stmt.executeQuery(SQLQuery);
			// rs.next() return true if there are the next row of data, it depend on your query (ex: Limit)
			while (rs.next()) {
				// rs is an object java, so you can get obj like get key in dictionary
				System.out.println(rs.getString("petid") + "\t\t"
	                    + rs.getString("name") + "\t\t"
	                    + rs.getString("kind") + "\t\t"
	                    + rs.getString("gender") + "\t\t"
	                    + rs.getInt("age") + "\t\t"
	                    + rs.getInt("ownerid"));
			}

``
