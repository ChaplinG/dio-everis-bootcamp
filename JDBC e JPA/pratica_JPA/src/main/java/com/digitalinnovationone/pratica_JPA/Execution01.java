package com.digitalinnovationone.pratica_JPA;

import classes.Jogador;
import classes.Pais;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Execution01 {

    public static void main(String[] args) {

        //Criar gerenciador de entidades com DB especificado no arquivo "persistente.xml"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratica01JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Pais paisParaAdicionar = new Pais("Brasil");
        Pais paisParaAdicionar1 = new Pais("Rivia");
        Jogador jogadorParaAdicionar = new Jogador("Chap", 9, 1);
        Jogador jogadorParaAdicionar1 = new Jogador("Geraldão", 36, 2);


        //INSERT
        //Iniciar transação - obrigatório usar transação para entidades mapeadas
        entityManager.getTransaction().begin();

        entityManager.persist(paisParaAdicionar1);
        entityManager.persist(jogadorParaAdicionar1);

        entityManager.getTransaction().commit();

        //Encerrar gerenciador de entidades e o factory
        entityManager.close();
        entityManagerFactory.close();

    }
}
