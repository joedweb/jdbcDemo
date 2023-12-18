import java.sql.*;

public class jdbcExample {
    // java; JDBC -> database

    //Java Database Connectivity (JDBC)
    // 1) Download the driver
    // SQL mysql, postgres
    // link to database
    // username, password

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/demo_db";
        String username = "root";
        String password = "Kinesis123!";

        Statement statement = null;
        ResultSet resultSet = null;
        Connection conn = null;


        try{
            conn = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connected to database succesfully ");
            statement = conn.createStatement();           //?
            statement.executeQuery("SELECT * FROM employees");              // executeQuery when reading
                statement.execute(" INSERT INTO employees  VALUES(NULL, 'Jack Lauren', 29)");       // update, delete,etc use execute



            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
            }


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        //execute the SQL statements
    }

}


// stablished the connection ^


