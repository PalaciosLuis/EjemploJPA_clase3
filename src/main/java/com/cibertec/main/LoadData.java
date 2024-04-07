package com.cibertec.main;

import jakarta.persistence.Persistence;

public class LoadData {
    public static void main(String[] args) {
        Persistence.generateSchema("db_biblioteca",null);
    }
}
