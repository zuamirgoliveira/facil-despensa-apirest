package br.com.facildespensa.apirest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;
    @Column(name = "SOBRENOME")
    private String sobreNome;
    @Column(name = "NUMERO_TELEFONE")
    private String numeroTelefone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SENHA")
    private String senha;

    @OneToMany
    @JoinColumn(name = "ID")
    private List<Despensa> despensas;

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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Despensa> getDespensas() {
        return despensas;
    }

    public void setDespensas(List<Despensa> despensas) {
        this.despensas = despensas;
    }
}
