package herenciaDoble;

/**
 *
 * @author fnico
 */
import javax.swing.JOptionPane;

public class PerroDomesticado extends Perro implements Domesticado {
    public PerroDomesticado(String especie) {
        super(especie);
    }

    @Override
    public void truco() {
        JOptionPane.showMessageDialog(null, "Se dar la pata *le da la pata");
    }
}