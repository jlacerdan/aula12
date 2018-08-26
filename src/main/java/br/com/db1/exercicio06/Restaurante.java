package br.com.db1.exercicio06;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private Endereco endereco;
	private List<TelefoneExercicio6> telefones;
	private List<Pedido> pedidos;

	public Restaurante() {
		telefones = new ArrayList<TelefoneExercicio6>();
		pedidos = new ArrayList<Pedido>();
	}

	public List<TelefoneExercicio6> getTelefones() {
		return telefones;
	}

	public void addTelefones(TelefoneExercicio6 telefones) {
		this.telefones.add(telefones);
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedidos(Pedido pedidos) {
		this.pedidos.add(pedidos);
	}

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
