import org.example.AreaDeTransferencia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaDeTransferenciaTest {

    @Test
    public void testGaranteMesmaInstancia() {
        AreaDeTransferencia area1 = AreaDeTransferencia.getInstancia();
        AreaDeTransferencia area2 = AreaDeTransferencia.getInstancia();

        assertSame(area1, area2);
    }

    @Test
    public void testCompartilhamentoDeConteudo() {
        AreaDeTransferencia area1 = AreaDeTransferencia.getInstancia();
        area1.setConteudo("Texto copiado");

        AreaDeTransferencia area2 = AreaDeTransferencia.getInstancia();

        assertEquals("Texto copiado", area2.getConteudo());
    }
}