package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainActualizar {
    public static void main(String[] args) {
        //Inicializar emf y em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

        Libro libroActualizar = em.find(Libro.class , "L2");
        libroActualizar.setPrecio(50);

        em.getTransaction().begin();
        em.merge(libroActualizar);
        em.getTransaction().commit();

        System.out.println(libroActualizar);



    }
}
