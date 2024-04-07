package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainBorrar {
    public static void main(String[] args) {
        //Inicializar emf y em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

        Libro libroBorrar=em.find(Libro.class, "L1");
        em.getTransaction().begin();
        em.remove(libroBorrar);
        em.getTransaction().commit();


    }
}
