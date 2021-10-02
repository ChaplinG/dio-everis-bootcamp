package pratica02_JPQL;

public class Jogador {

    private int id;
    private String nomeUser;
    private int nivel;
    private String pais;

    public Jogador(int id, String nomeUser, int nivel, String pais){
        this.id = id;
        this.nomeUser = nomeUser;
        this.nivel = nivel;
        this.pais = pais;
    }

    public Jogador(String nomeUser, int nivel, String pais){
        this.nomeUser = nomeUser;
        this.nivel = nivel;
        this.pais = pais;
    }

    public Jogador() {}

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nomeUser='" + nomeUser + '\'' +
                ", nivel=" + nivel +
                ", pais='" + pais + '\'' +
                '}';
    }
}
