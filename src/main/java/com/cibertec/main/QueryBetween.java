package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryBetween {
    public static void main(String[] args) {
        //Create emf and em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

        TypedQuery query= em.createQuery("select l from Libro l where l.precio between 40 and 60", Libro.class);

        List<Libro> reusltado = query.getResultList();
        for (Libro libro : reusltado) {
            System.out.println(libro);
        }
    }
}
