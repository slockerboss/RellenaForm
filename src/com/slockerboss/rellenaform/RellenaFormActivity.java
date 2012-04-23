package com.slockerboss.rellenaform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RellenaFormActivity extends Activity {

	private Button btnEnviarForm, btnMostrar;
	private TextView textViewPruebaBorrar;
	private EditText editTextNombre;
	private Usuario usuario1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);

		usuario1 = new Usuario();

		textViewPruebaBorrar = (TextView) findViewById(R.id.TextViewPrueba);
		editTextNombre = (EditText) findViewById(R.id.EditTextNombre);

		btnEnviarForm = (Button) findViewById(R.id.BotonEnviarFormulario);
		btnEnviarForm.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				textViewPruebaBorrar.setText("probando boton\n");

			}
		});

		btnMostrar = (Button) findViewById(R.id.BotonMostrar);
		btnMostrar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String nombre = editTextNombre.getText().toString();
				usuario1.setNombre(nombre);
				mostrar(usuario1);

			}
		});
	}

	protected void mostrar(Usuario usuario) {

		textViewPruebaBorrar.append("Nombre: ");
		textViewPruebaBorrar.append(usuario.getNombre() + "\n");

	}
}