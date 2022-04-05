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

    @OneToOne
    @JoinColumn(name = "ID_DESPENSA")
    private Despensa despensa;

    @OneToOne
    @JoinColumn(name = "ID_LISTA_DE_COMPRA")
    private ListaDeCompra listaDeCompra;

}
