import java.sql.*;

public class ViewerDAO {

    public void getAllViewers() {
        String sql = "SELECT * FROM viewers";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
