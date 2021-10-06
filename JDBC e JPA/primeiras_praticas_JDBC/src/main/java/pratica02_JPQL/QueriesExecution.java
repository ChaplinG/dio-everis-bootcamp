package pratica02_JPQL;

import java.util.*;

public class QueriesExecution {

    public static void main(String[] args) {

        JogadorDAO jogadorDAO = new JogadorDAO();

        List<Jogador> jogadores = jogadorDAO.list();

        System.out.println(jogadores);

        //SELECT
        jogadores.stream().forEach(System.out::println);

        //SELECT WHERE
        Jogador jogadorConsulta = jogadorDAO.getByID(1);
        System.out.println(jogadorConsulta);

        /*//INSERT
        Jogador jogadorInsercao = new Jogador("ChipsTato", 13, "Elmas");
        jogadorDAO.create(jogadorInsercao);

        //DELETE
        jogadorDAO.delete(2);

        //UPDATE
        Jogador jogadorAtualiza = jogadorDAO.getByID(3);
        jogadorAtualiza.setNomeUser("Geralt");
        jogadorAtualiza.setNivel(10);
        jogadorAtualiza.setPais("Rivia");
        jogadorDAO.update(jogadorAtualiza);

        //SELECT
        System.out.println("\n\n");
        jogadores.stream().forEach(System.out::println);*/
    }

}
