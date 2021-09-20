package br.com.dio;

import br.com.dio.model.Gato; //ctrl + alt + O   ~apaga imports não utilizados

public class PrimeiroPrograma { //shift + F6   ~refatora nome de classe, atributo...
    public static void main(String[] args) {
        Gato gato01 = new Gato("Pantufa", "cinza", 2);

        Livro livro01 = new Livro("O Último Desejo", 320);

        /*int a = 3;
        int b = 6;
        int c = 9;*/ //ctrl + shift + /   ~comenta bloco

//      System.out.println("Hello World!"); ctrl + /   ~comenta linhas


        /*shift + F12   ~layout com apenas editor de cód
        * ctrl + alt + L   ~organiza indentação
        * ctrl + D   ~duplica linha
        * ctrl + Y   ~apaga linha
        * ctrl + shift + {setas pra cima ou baixo}   ~move linha
        *
        * ctrl + K   ~git commit
        *
        * */


    }
}

class Livro {
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
