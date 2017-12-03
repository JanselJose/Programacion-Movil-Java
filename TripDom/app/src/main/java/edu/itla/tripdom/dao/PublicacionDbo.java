package edu.itla.tripdom.dao;

import android.content.Context;

import edu.itla.tripdom.entity.Publicacion;

/**
 * Created by jaesj on 11/29/2017.
 */

public class PublicacionDbo {
    private DbConnection connection;

    public PublicacionDbo(Context Context) {
        connection = new DbConnection(Context);

    }

    public void crear (Publicacion publicacion) {
        //SQLiteDatabase db


    }
}
