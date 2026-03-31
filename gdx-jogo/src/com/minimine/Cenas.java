package com.minimine;

import com.badlogic.gdx.Screen;
import com.minimine.cenas.Menu;
import com.minimine.cenas.Jogo;
import com.minimine.cenas.MundoMenu;
import com.minimine.cenas.Intro;
import com.minimine.cenas.Config;

public class Cenas {
	// instanciação lazy: cria cada tela somente quando for usada
	// economiza memória em dispositivos com pouca RAM(Galaxy Pocket Neo, etc)
	public static Screen intro, menu, jogo, selecao, configuracoes;

	public static Screen obterIntro() {
		if(intro == null) intro = new Intro();
		return intro;
	}

	public static Screen obterMenu() {
		if(menu == null) menu = new Menu();
		return menu;
	}

	public static Screen obterJogo() {
		if(jogo == null) jogo = new Jogo();
		return jogo;
	}

	public static Screen obterSelecao() {
		if(selecao == null) selecao = new MundoMenu();
		return selecao;
	}

	public static Screen obterConfiguracoes() {
		if(configuracoes == null) configuracoes = new Config();
		return configuracoes;
	}

	static {
		intro = obterIntro();
	}

	public static void mudarCena(Screen cena) {
		Inicio.defTela(cena);
	}
}
