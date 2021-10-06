package pratica02_JPQL;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    //Construtor privado, evita criar instâncias na fábrica(?)
    private ConnectionFactory(){
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection(){
        Connection conn = null;

        //Carrega arquivo de propriedades para conexão com DB
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")){

            //Definição de parâmetros para conexão
            Properties prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("jdbc.driver");
            String dataBaseAddress = prop.getProperty("db.address");
            String dataBaseName = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAddress).append("/")
                    .append(dataBaseName);

            String connectionURL = sb.toString();

            //Cria conexão usando DriverManager
            try {
                conn = DriverManager.getConnection(connectionURL, user, password);
                System.out.println("Conexão estabelecida");
            } catch (SQLException e) {
                System.out.println("Falha ao tentar criar conexão");
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("Falha ao tentar carregar arquivos de propriedades");
            e.printStackTrace();
        }

        return conn;

    }

}
