package edu.itla.tripdom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import edu.itla.tripdom.dao.UsuarioDbo;
import edu.itla.tripdom.entity.Usuario;
import edu.itla.tripdom.view.listAdapter.UsuarioListAdapter;

public class ListaUsuarios extends AppCompatActivity {

    private static String LOG_T = ListaUsuarios.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);

        UsuarioDbo usuarioDbo = new UsuarioDbo(this);
        List<Usuario>usuarios = usuarioDbo.buscar();

        Log.i(LOG_T, "Cantidad de usuarios=" + usuarios.size());
        ListView listView = findViewById(R.id.ltvUsuarios);
        listView.setAdapter(new UsuarioListAdapter(this, usuarios));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Usuario u = (Usuario)adapterView.getItemAtPosition(i);
                Intent intent = new Intent(ListaUsuarios.this, RegistroUsuario.class);
                intent.putExtra("usuario", u);

                startActivity(intent);
            }
        });


        Button btnAgregar = findViewById(R.id.btnAgregarUsuarios);
    }
}
