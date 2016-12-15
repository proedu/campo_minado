package br.edu.ifrn.dojo.CampoMinado;

import java.util.Random;

public class CampoMinado {

   private Random r1;	

    private void atribui(int linha, int coluna, int valor) {

    }

    private int pegue(int linha, int coluna) {
        return -1;
    }
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

   }
