import java.sql.*;

public class FilmDAO {

    // CREATE
    public void addFilm(Film film) {
        String sql = "INSERT INTO films (title, duration, genre) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, film.getTitle());
            stmt.setInt(2, film.getDuration());
            stmt.setString(3, film.getGenre());
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void getAllFilms() {
        String sql = "SELECT * FROM films";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("title") + " | " +
                                rs.getInt("duration") + " min | " +
                                rs.getString("genre")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateGenre(String title, String newGenre) {
        String sql = "UPDATE films SET genre = ? WHERE title = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newGenre);
            stmt.setString(2, title);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteFilm(String title) {
        String sql = "DELETE FROM films WHERE title = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, title);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
