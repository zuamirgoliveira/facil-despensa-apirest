package br.com.facildespensa.apirest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "TB_LISTA_DE_COMPRA")
public class ListaDeCompra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "DATA")
    private Timestamp data;
    @Column(name = "TIPO_LISTA")
    private long tipoLista;
    @Column(name = "STATUS")
    private long status;
    @Column(name = "VALOR_TOTAL")
    private double valorTotal;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DESPENSA", nullable = false)
    @JsonBackReference
    private Despensa despensa;

    @ManyToMany(mappedBy = "listasDeCompra")
    @JsonManagedReference
    private List<Item> itens;

    public Despensa getDespensa() {
        return despensa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public long getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(long tipoLista) {
        this.tipoLista = tipoLista;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDespensa(Despensa despensa) {
        this.despensa = despensa;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
