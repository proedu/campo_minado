/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.dojo.CampoMinado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pekos
 */
public class CampoMinadoTest {

    // TODO add test  here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeConstrutor() {
        CampoMinado campo = new CampoMinado();
        assertNotNull(campo);
    }

    @Test
    public void testeCriarCampoPassandoParametros() {
        CampoMinado campo = CampoMinado.criar(4, 6);
        assertNotNull(campo);
    }
}
