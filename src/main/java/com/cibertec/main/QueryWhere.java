package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryWhere {
    public static void main(String[] args) {
        //conexion y creacion emf y em
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em= emf.createEntityManager();

        //create query and sentence jpql
        TypedQuery query= em.createQuery("select l from Libro l where l.autor= :autor", Libro.class);
        query.setParameter("autor", "Claudia");

        // Resultado and for resultad
        List<Libro> resultado = query.getResultList();
        for (Libro libro : resultado) {
            System.out.println(libro);
        }



    }
}
