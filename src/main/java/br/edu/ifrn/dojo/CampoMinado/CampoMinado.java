package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {

    private int[][] campo;
    private Boolean valor = true;

    private void atribui(int linha, int coluna, int valor) {

    }

    private int pegue(int linha, int coluna) {
        return -1;
    }

    private int minasAtivas(int[][] campoM){
      int qtdeMinas = 0;

      for(int i = 0; i< campoM.length; i++){
        for(int j = 0; j < campoM.length; j++){
          if(campoM[i][j] == -1 && valor==false){
            qtdeMinas++;
          }
          j++;
        }
        i++;
      }
      return qtdeMinas;
    }

}
