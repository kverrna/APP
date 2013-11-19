package com.mds.app.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.mds.app.R;
import com.mds.app.controller.FavoritosController;
import com.mds.app.controller.ListaController;

public class MenuPrincipal extends Activity {

	ImageButton busca;
	ImageButton sobre;
	Button favoritos;
	Button historico;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);

		FavoritosController.popularProjetosFavoritados();

		busca_addListener();
		sobre_addListener();
		favoritos_addListener();
		historico_addListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void busca_addListener() {
		busca = (ImageButton) findViewById(R.id.imgbutton_busca);
		busca.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ListaController.setTipoAtual(ListaController.Tipo.PESQUISA);
				Intent i = new Intent(MenuPrincipal.this, Busca.class);
				startActivity(i);
			}
		});
	}

	private void sobre_addListener() {
		sobre = (ImageButton) findViewById(R.id.imgbutton_sobre);
		sobre.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MenuPrincipal.this, Sobre.class);
				startActivity(i);
			}
		});
	}

	private void favoritos_addListener() {
		favoritos = (Button) findViewById(R.id.favoritos);
		favoritos.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ListaController.setTipoAtual(ListaController.Tipo.FAVORITOS);
				Intent i = new Intent(MenuPrincipal.this, Lista.class);
				startActivity(i);
			}
		});
	}

	private void historico_addListener() {
		historico = (Button) findViewById(R.id.historico);
		historico.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ListaController.setTipoAtual(ListaController.Tipo.HISTORICO);
				Intent i = new Intent(MenuPrincipal.this, Lista.class);
				startActivity(i);
			}
		});
	}

}
