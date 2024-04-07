package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryGroupBy {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em = emf.createEntityManager();

       TypedQuery<Object[]> query= em.createQuery("select l.autor, count(*) from Libro l group by l.autor", Object[].class);

       //Obtener resultados
        List<Object[]> resultado = query.getResultList();
        for (Object[] item : resultado) {
            System.out.println(item[0]+""+item[1]);
        }

    }
}
