package pratica02_JPQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JogadorDAO {

    //CONSULTA GERAL (SELECT *)
    public List<Jogador> list() {
        //Prepara lista que irá retornar após consulta do DB
        List<Jogador> jogadores = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            //Prepara consulta SQL
            String sql = "SELECT * FROM jogador";

            //Prepara statement com parâmetros recebidos
            PreparedStatement stmt = conn.prepareStatement(sql);

            //Executa consulta e armazena seu retorno
            ResultSet rs = stmt.executeQuery();

            //Cria objeto jogador e armazena na lista criada
            while(rs.next()) {
                int id = rs.getInt("id");
                String nomeUser = rs.getString("nomeUser");
                int nivel = rs.getInt("nivel");
                String pais = rs.getString("pais");

                jogadores.add(new Jogador(id, nomeUser, nivel, pais));
            }

        } catch (Exception e) {
            System.out.println("Falha ao listar jogadores");
            e.printStackTrace();
        }
        return jogadores;
    }



    //CONSULTA COM FILTRO (SELECT WHERE)
    public Jogador getByID(int id) {
        Jogador jogador = new Jogador();

        try (Connection conn = ConnectionFactory.getConnection()) {
            //Prepara consulta
            String sql = "SELECT * FROM jogador WHERE id = ?";

            //Prepara statement com parâmetros recebidos
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            //Executa consulta e armazena seu retorno
            ResultSet rs = stmt.executeQuery();

            //Guardar valores retornados tabela jogador -> obj jogador
            if (rs.next()){
                jogador.setId(rs.getInt("id"));
                jogador.setNomeUser(rs.getString("nomeUser"));
                jogador.setNivel(rs.getInt("nivel"));
                jogador.setPais(rs.getString("pais"));
            }

        } catch (Exception e) {
            System.out.println("Falha ao listar jogadores");
            e.printStackTrace();
        }
        return jogador;
    }


    //INSERT
    public void create(Jogador jogador) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO jogador(nomeUser, nivel, pais) VALUES (?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, jogador.getNomeUser());
            stmt.setInt(2, jogador.getNivel());
            stmt.setString(3, jogador.getPais());


            //Executa INSERT e armazena o numero de linhas afetadas
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Inserção bem sucedida! " +rowsAffected +" linha(s) adicionada(s)");

        } catch (SQLException e) {
            System.out.println("Falha ao inserir");
            e.printStackTrace();
        }
    }


    //DELETE
    public void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM jogador WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            //Executa DELETE e armazena numero de linhas afetadas
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Exclusão bem sucedida! " +rowsAffected +" linha(s) afetada(s)");

        } catch (SQLException e) {
            System.out.println("Falha ao deletar");
            e.printStackTrace();
        }
    }


    //UPDATE
    public void update(Jogador jogador) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE jogador SET nomeUser = ?, nivel = ?, pais = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, jogador.getNomeUser());
            stmt.setInt(2, jogador.getNivel());
            stmt.setString(3, jogador.getPais());
            stmt.setInt(4, jogador.getId());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Atualização bem sucedida! " +rowsAffected +" linha(s) afetada(s)");
        } catch (SQLException e) {
            System.out.println("Falha ao atualizar");
            e.printStackTrace();
        }
    }

}
