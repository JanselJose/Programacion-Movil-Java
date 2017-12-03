package edu.itla.tripdom.dao;

import android.content.Context;

/**
 * Created by jaesj on 11/29/2017.
 */

public class PublicacionDetalleDbo {
    private DbConnection connection;

    public PublicacionDetalleDbo(Context Context){
        connection = new DbConnection(Context);

    }

}
