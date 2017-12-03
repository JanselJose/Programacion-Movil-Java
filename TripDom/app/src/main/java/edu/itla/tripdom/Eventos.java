package edu.itla.tripdom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        Button btnAgregar = findViewById(R.id.btnAgregarEventos);
        ListView ltvEventos = findViewById(R.id.ltvEventos);

       // btnAgregar.setOnClickListener((View));
    }
}
