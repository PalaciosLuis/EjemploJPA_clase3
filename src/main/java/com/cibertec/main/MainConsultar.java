package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MainConsultar {
    public static void main(String[] args) {

        //Referenciar persistence unit
        //inicializar entity manager factory y entity manager
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

        //Creando nuevo Libro
        Libro libro01=em.find(Libro.class, "L1");


        System.out.println(libro01);

    }
}
