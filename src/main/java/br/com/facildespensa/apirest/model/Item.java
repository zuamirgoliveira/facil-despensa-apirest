package br.com.facildespensa.apirest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_ITEM")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "QUANTIDADE")
    private int quantidade;
    @Column(name = "VALOR")
    private double valor;
    @Column(name = "ITEM_PADRAO")
    private int itemPadrao;

    @OneToMany
    @JoinColumn(name = "TB_DESPENSA", referencedColumnName = "ID")
    private long idDespensa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getItemPadrao() {
        return itemPadrao;
    }

    public void setItemPadrao(int itemPadrao) {
        this.itemPadrao = itemPadrao;
    }

    public long getIdDespensa() {
        return idDespensa;
    }

    public void setIdDespensa(long idDespensa) {
        this.idDespensa = idDespensa;
    }
}
