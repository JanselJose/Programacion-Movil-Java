package edu.itla.tripdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class ListaUsuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);

        ListView ltvUsuarios = findViewById(R.id.ltvUsuarios);
        Button btnAgregar = findViewById(R.id.btnAgregarUsuarios);
    }
}
