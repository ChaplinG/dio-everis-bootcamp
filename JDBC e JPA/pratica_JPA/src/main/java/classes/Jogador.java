package classes;


import javax.persistence.*;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //o DB irá gerar o id/cod automaticamente
    private int id;

    @Column
    private String nomeUser;

    @Column
    private int nivel;

    @ManyToOne(fetch = FetchType.LAZY )
    private int idPais;

    public Jogador(int id, String nomeUser, int nivel, int idPais) {
        this.id = id;
        this.nomeUser = nomeUser;
        this.nivel = nivel;
        this.idPais = idPais;
    }

    public Jogador(String nomeUser, int nivel, int idPais) {
        this.nomeUser = nomeUser;
        this.nivel = nivel;
        this.idPais = idPais;
    }

    public Jogador() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nomeUser='" + nomeUser + '\'' +
                ", nivel=" + nivel +
                ", idPais=" + idPais +
                '}';
    }
}
