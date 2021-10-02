package pratica01_DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

    public static void main(String[] args) {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        //CRIAR CONEXÃO COM BD - PRÁTICA ATUAL
        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "password")) {
            System.out.println("Sucesso");
        } catch (Exception e) {
            System.out.println("Falha");
        } //não precisa do finally, pois o try-with-resources vai fechar automaticamente

        //CRIAR CONEXÃO COM DB - PRÁTICA ANTIGA
        //colocar "throws SQLException" no main
        /*Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConnection, "root", "password");
            System.out.println("Sucesso");
        } catch (SQLException e) {
            System.out.println("Falha");
        } finally {
            conn.close();
        }*/

        //DEFINIR PARÂMETROS PARA SE CONECTAR AO DB MYSQL, para facilitar manutenção
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseNome = "digital_innovation_one";
        String user = "root";
        String password = "password";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseNome);

        String urlConnection01 = sb.toString();







    }
}
