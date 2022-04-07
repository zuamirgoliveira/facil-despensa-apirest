package br.com.facildespensa.apirest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DESPENSA", nullable = false)
    @JsonBackReference
    private Despensa despensa;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "TB_ITEM_LISTA_DE_COMPRA",
            joinColumns = { @JoinColumn(name = "ID_ITEM") },
            inverseJoinColumns = { @JoinColumn(name = "ID_LISTA_DE_COMPRA") })
    @JsonBackReference
    private List<ListaDeCompra> listasDeCompra;

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

    public Despensa getDespensa() {
        return despensa;
    }

    public void setDespensa(Despensa despensa) {
        this.despensa = despensa;
    }

    public List<ListaDeCompra> getListasDeCompra() {
        return listasDeCompra;
    }

    public void setListasDeCompra(List<ListaDeCompra> listasDeCompra) {
        this.listasDeCompra = listasDeCompra;
    }
}
