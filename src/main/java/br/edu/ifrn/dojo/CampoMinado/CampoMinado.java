package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {
    private int[][] valore;
    private int[][] estado;
    private int quantidadeBombas;

    static CampoMinado criar(int tamanho, int qtqBombas) {
        CampoMinado campo = new CampoMinado();
        campo.valore = new int[tamanho][tamanho];
        campo.estado = new int[tamanho][tamanho];
        campo.quantidadeBombas = qtqBombas;

        return campo;
    }

}
