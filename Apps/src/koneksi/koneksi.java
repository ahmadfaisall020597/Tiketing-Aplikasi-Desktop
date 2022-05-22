package koneksi;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection conn;
    public static Connection getKoneksi(){
        String host     ="jdbc:mysql://localhost:3306/tiket",
                user = "root",
                pass = "";
        try{
                conn = (Connection) DriverManager.getConnection(host, user, pass);
        }
        catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
        }
        }
    
