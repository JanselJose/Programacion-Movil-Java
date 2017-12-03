package edu.itla.tripdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnUsuarios = findViewById(R.id.btnUsuarios);
        Button btnEventos = findViewById(R.id.btnEventos);
    }
}
