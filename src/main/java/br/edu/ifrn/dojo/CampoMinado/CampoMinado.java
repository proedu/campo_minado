package br.edu.ifrn.dojo.CampoMinado;

public class CampoMinado {

    private void atribui(int linha, int coluna, int valor) {

    }

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
}
