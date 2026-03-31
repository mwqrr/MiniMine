package com.minimine;

import com.badlogic.gdx.Screen;
import com.minimine.cenas.Menu;
import com.minimine.cenas.Jogo;
import com.minimine.cenas.MundoMenu;
import com.minimine.cenas.Intro;
import com.minimine.cenas.Config;

public class Cenas {
	// cria novas instâncias a cada navegação pra evitar reusar telas já disposed
	public static Screen intro;

	public static Screen obterIntro() {
		if(intro == null) intro = new Intro();
		return intro;
	}

	public static Screen obterMenu() {
		return new Menu();
	}

	public static Screen obterJogo() {
		return new Jogo();
	}

	public static Screen obterSelecao() {
		return new MundoMenu();
	}

	public static Screen obterConfiguracoes() {
		return new Config();
	}

	static {
		intro = obterIntro();
	}

	public static void mudarCena(Screen cena) {
		Inicio.defTela(cena);
	}
}
