package br.com.facildespensa.apirest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

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

    @OneToMany
    @JoinColumn(name = "TB_DESPENSA", referencedColumnName = "ID")
    private long idDespensa;

    @OneToMany
    @JoinColumn(name = "TB_ITEM", referencedColumnName = "ID")
    private long idItem;

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

    public long getIdDespensa() {
        return idDespensa;
    }

    public void setIdDespensa(long idDespensa) {
        this.idDespensa = idDespensa;
    }

    public long getIdItem() {
        return idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }
}
