package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.Date;

public class MainInsertar {

    public static void main(String[] args) {
        //Inicializar emf y em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

        //Crear objeto
        Libro libro=new Libro("L2","El gato con botas","Un dato",new Date(),30.00);

        //Insertar Libro
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    }


}
