package br.edu.ifrn.dojo.CampoMinado;

import java.util.Random;

public class CampoMinado {


  private Random r1;
  private int[][] campo;
  private Boolean valor = true;



  public CampoMinado(int linhaEColuna, int qtdBombas) {
    this.valores = new int[linhaEColuna][linhaEColuna]();
    this.estados = new int[linhaEColuna][linhaEColuna]();
  }


  private void atribui(int linha, int coluna, int valor) {
    this.valores[linha][coluna] = valor;
  }

  private int pegue(int linha, int coluna) {
    return this.valores[linha][coluna];
  }

    private int pegue(int linha, int coluna) {
        return -1;
    }

public boolean jogoFinalizado() {
   return true;
}


  private void posicionarMinas( ){

    r1 = new Random();
    qtd =0;
    int linha, coluna, qtd=0;

    while((qtd<valor)){
      linha = r1.nextInt(campo[][].length);
      coluna = r1.nextInt(campo[].length);


      if(campo[linha][coluna]!=null){
        continue;
      }else{
        campo[linha][coluna] = -1;
        qtd++;
      }
    }
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

   }
}
