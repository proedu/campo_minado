package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {

<<<<<<< HEAD
<<<<<<< HEAD

  private Random r1;
  private int[][] campo;
  private Boolean valor = true;
=======
  private Random r1;
  private int[][] valores;
  private int[][] estados;
  private int[][] campo;
  private Boolean valor = true;


    private int pegue(int linha, int coluna) {
        return -1;
    }

    private void preencherNum(int M[][]){
        int varI, varJ, valor;

        CampoMinado m = new CampoMinado();

        for (int i=0; i<=m; i++){
          for (int j=0; j<=n; i++){
            if (M[i][j] != -1){
              varI = i;
              varJ = j;
              for (int k=varI-1; k<=varI+1; k++){
                for (int z=varJ-1; z<=varJ+1; z++){
                  if (M[var-1][j]==-1)
                    valor++;
                }
              }
            }
            m.atribui(i,j,valor);
          }
        }
    }
>>>>>>> 68c9853cda1b75374a74e8fd826847a5d9926f17


  public CampoMinado(int linhaEColuna, int qtdBombas) {
    this.valores = new int[linhaEColuna][linhaEColuna]();
    this.estados = new int[linhaEColuna][linhaEColuna]();
  }


  private void atribui(int linha, int coluna, int valor) {
    this.valores[linha][coluna] = valor;
<<<<<<< HEAD
  }

  private int pegue(int linha, int coluna) {
    return this.valores[linha][coluna];
  }


  private void posicionarMinas( ){

    r1 = new Random();
    qtd =0;
    int linha, coluna, qtd=0;
<<<<<<< HEAD

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


=======
  private void atribui(int linha, int coluna, int valor) {

=======
>>>>>>> 68c9853cda1b75374a74e8fd826847a5d9926f17
  }

  private int pegue(int linha, int coluna) {
    return this.valores[linha][coluna];
  }

<<<<<<< HEAD
  public String imprimeCampoRevelado (int[][] matriz, int quantidadeDeLinhas, int quantidadeDeColunas) {
    String stringToPrint = "";
    int larguraImpressaoColunas = (quantidadeDeColunas*4)+1;//Integer.parseInt(String.valueOf(quantidadeDeColunas * 1.68).charAt(0)+"");
    int i;
    for (i = 0; i < larguraImpressaoColunas; i++) {
      stringToPrint += "-";
    }
    stringToPrint += "\n";
    for (i = 0; i < quantidadeDeLinhas; i++) {
      stringToPrint+="|";
      for (int j = 0; j < quantidadeDeLinhas; j++) {
        if (matriz[i][j] == -1) {
          stringToPrint += " * |";
        } else {
          stringToPrint += "   |";
        }
      }
      stringToPrint+="\n";
    }
    for (i = 0; i < larguraImpressaoColunas; i++) {
      stringToPrint += "-";
    }
    stringToPrint += "\n";
    return stringToPrint;
  }

  public String imprimeCampoMinasOcultas(int[][] matriz, int quantidadeDeLinhas, int quantidadeDeColunas) {
    String stringToPrint = "";
    int larguraImpressaoColunas = quantidadeDeColunas*4;//Integer.parseInt(String.valueOf(quantidadeDeColunas * 1.68).charAt(0)+"");
    int i;
    for (i = 0; i < larguraImpressaoColunas; i++) {
      stringToPrint += "-";
    }
    stringToPrint += "\n";
    for (i = 0; i < quantidadeDeLinhas; i++) {
      stringToPrint+="|";
      for (int j = 0; j < quantidadeDeLinhas; j++) {
        if (matriz[i][j] <= 0) {
          stringToPrint += "  |";
        } else {
          stringToPrint += String.valueOf(matriz[i][j]) + " |";
        }
      }
      stringToPrint+="\n";
    }
    for (i = 0; i < larguraImpressaoColunas; i++) {
      stringToPrint += "-";
    }
    stringToPrint += "\n";
    return stringToPrint;
  }
<<<<<<< HEAD
>>>>>>> issue06
=======

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


>>>>>>> 58bfd4354b42b4d86dbead9e7e5c37412d6b6e45
=======

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


>>>>>>> 68c9853cda1b75374a74e8fd826847a5d9926f17
}
