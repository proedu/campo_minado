package br.edu.ifrn.dojo.CampoMinado;

/**
* @author Leonardo Minira
*/
public class CampoMinado {
    private int[][] valores;
    private int[][] estados;
    private int quantidadeBombas;

    static CampoMinado criar(int tamanho, int qtqBombas) {
        CampoMinado campo = new CampoMinado();
        campo.valore = new int[tamanho][tamanho];
        campo.estado = new int[tamanho][tamanho];
        campo.quantidadeBombas = qtqBombas;
        campo.score = int();
	system.out.print("teste1");
        return campo;
    }

}
