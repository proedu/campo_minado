package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {

    private int[][] valores;
    private int[][] estados;


    public CampoMinado(int linhaEColuna, int qtdBombas) {
      this.valores = new int[linhaEColuna][linhaEColuna]();
      this.estados = new int[linhaEColuna][linhaEColuna]();
    }

    private void atribui(int linha, int coluna, int valor) {

    }

    private int pegue(int linha, int coluna) {
        return -1;
    }
}
