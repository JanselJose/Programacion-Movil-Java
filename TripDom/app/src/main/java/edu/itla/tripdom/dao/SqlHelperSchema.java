package edu.itla.tripdom.dao;

/**
 * Created by jaesj on 26/11/2017.
 */

public class SqlHelperSchema {
    public static final String Usuario_TABLE = "(\n" +
            "\t`id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`nombre`\tTEXT,\n" +
            "\t`tipo_usuario`\tTEXT NOT NULL,\n" +
            "\t`email`\tTEXT,\n" +
            "\t`telefono`\tTEXT\n" +
            ")";
    public static final String Publicacion_TABLE = "(\n" +
            "\t `id`	\tINTEGER PRIMARY KEY AUTOINCREMENT, \n" +
            "\t`fecha_publicacion`\t	TEXT NOT NULL,\n" +
            "\t      `fecha_viaje`\t	TEXT NOT NULL, \n" +
            "\t     `precio`	\tNUMERIC, \n" +
            "\t `descripcion`	\tTEXT, \n" +
            "\t `estado`\t	TEXT, \n" +
            "\t`usuario_id` \t	INTEGER NOT NULL, \n" +
            "\t `origen` \t	TEXT, \n" +
            "\t`cupo` \t	NUMERIC\n" +
            ")";
    public static final String PublicacionDetalle_TABLE = "(\n" +
            "\t`id`\t	INTEGER PRIMARY KEY AUTOINCREMENT, \n" +
            "\t `publicacion_id` \t	INTEGER NOT NULL, \n" +
            "\t `lugar` \t	TEXT, \n" +
            "\t`descripcion` \t	TEXT \n" +
            ")";


}

