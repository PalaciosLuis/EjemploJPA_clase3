package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryBasico {
    public static void main(String[] args) {
        //creación de emf y em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();


        //Create Query
        //Consulta JPQL
        TypedQuery query = em.createQuery("select l from Libro l" ,Libro.class);

        List<Libro> resultado = query.getResultList();
        for (Libro libro : resultado) {
            System.out.println(libro);
        }

    }
}
