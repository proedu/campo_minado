package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {
    private int[][] valores;
    private int[][] estados;
    private int quantidadeBombas;
    
    static CampoMinado criar(int tamanho, int qtqBombas) {
        CampoMinado campo = new CampoMinado();
        campo.valores = new int[tamanho][tamanho];
        campo.estados = new int[tamanho][tamanho];
        campo.quantidadeBombas = qtqBombas;
        
        return campo;
    }

}
