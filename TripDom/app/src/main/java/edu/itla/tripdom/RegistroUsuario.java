package edu.itla.tripdom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import edu.itla.tripdom.dao.UsuarioDbo;
import edu.itla.tripdom.entity.Usuario;

public class RegistroUsuario extends AppCompatActivity {
    private static final String LOG_T = "RegistroUsuario";

    //PublicacionDbo publicacionDbo;
    private UsuarioDbo usuarioDbo;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        usuarioDbo = new UsuarioDbo(this);

        final EditText txtNombre = findViewById(R.id.txtNombre);
        final EditText txtEmail = findViewById(R.id.txtEmail);
        final EditText txtTelefono = findViewById(R.id.txtTelefono);
        final EditText txtTipoUsuario = findViewById(R.id.txtTipoUsuario);
        Button btnAgregar = findViewById(R.id.btnAgregar);
        Button btnBuscar = findViewById(R.id.btnBuscar);

        Bundle parametros = getIntent().getExtras();
        if (parametros.containsKey("usuarios")) {
            usuario = (Usuario) parametros.getSerializable("usuario");
            txtNombre.setText(usuario.getNombre());
            txtEmail.setText(usuario.getEmail());
            txtTelefono.setText(usuario.getTelefono());
        }
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usuario == null) {
                    usuario = new Usuario();

                }
                Usuario usuario = new Usuario();
                usuario.setNombre(txtNombre.getText().toString());
                usuario.setEmail(txtEmail.getText().toString());
                usuario.setTelefono(txtTelefono.getText().toString());
                usuario.setTipoUsuario(txtTipoUsuario.getText().toString());
                usuarioDbo.crear(usuario);
                Log.i(LOG_T, usuario.toString());

            }
        });
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                List<Usuario> usuarios = usuarioDbo.buscar();

                for (Usuario u : usuarios) {
                    Log.i("ListUsuarios", u.toString());
                }

            }
        });


    }

}
