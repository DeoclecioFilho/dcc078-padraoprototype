import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CarroTest {


    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro("G03tZ9S8", "MOBI", new Opcionais("CROSSCONTACT", true, "265/50R20", true), "1.3");

        Carro CarroClone = carro.clone();
        CarroClone.setChassi("T5R84U8R");
        CarroClone.setModelo("CRONUS");
        CarroClone.getOpacionais().setTetoSolar(false);

        assertEquals("Carro{chassi='G03tZ9S8', modelo='MOBI', opcionais=Opcionais{roda='CROSSCONTACT', tetoSolar='true', pneu='265/50R20', arCondicionado='true'}, versao='1.3'}", carro.toString());
        assertEquals("Carro{chassi='T5R84U8R', modelo='CRONUS', opcionais=Opcionais{roda='CROSSCONTACT', tetoSolar='false', pneu='265/50R20', arCondicionado='true'}, versao='1.3'}", CarroClone.toString());
    }
}

