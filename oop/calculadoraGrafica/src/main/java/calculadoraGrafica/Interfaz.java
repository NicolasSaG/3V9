package calculadoraGrafica;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author fnico
 */
public class Interfaz extends JFrame implements ActionListener {
    JLabel lblnum1, lblnum2, lblresultado;   
    JTextField txtnum1, txtnum2, txtresultado;
    JButton bsuma, bresta, blimpiar;
    
    Datos dt = new Datos();
    
    //Constructor para incializar todo
    public Interfaz(){
        inicio();  
    }

    private void inicio() {
        Container contenedor = getContentPane();
        setBounds(0, 0, 300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Calculadora Shida");
        setResizable(false);
        
        //Cambiar icono de java
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        setIconImage(icon);
        
        lblnum1 = new JLabel("Numero 1:");
        lblnum1.setBounds(10, 30, 100, 30);
        contenedor.add(lblnum1);
        
        lblnum2 = new JLabel("Numero 2:");
        lblnum2.setBounds(10, 70, 100, 30);
        contenedor.add(lblnum2);
        
        lblresultado = new JLabel("Resultado:");
        lblresultado.setBounds(10, 110, 100, 30);
        contenedor.add(lblresultado);
        
        txtnum1 = new JTextField();
        txtnum1.setBounds(120, 30, 80, 30);
        contenedor.add(txtnum1);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(120, 70, 80, 30);
        contenedor.add(txtnum2);
        
        txtresultado = new JTextField();
        txtresultado.setBounds(120, 110, 80, 30);
        contenedor.add(txtresultado);
        
        bsuma = new JButton("+");
        bsuma.setBounds(10, 150, 50, 50);
        contenedor.add(bsuma);
        bsuma.addActionListener(this);
        
        bresta = new JButton("-");
        bresta.setBounds(70, 150, 50, 50);
        contenedor.add(bresta);
        bresta.addActionListener(this);
        
        blimpiar = new JButton("Limpiar");
        blimpiar.setBounds(10, 210, 100, 50);
        contenedor.add(blimpiar);
        blimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == bsuma) {
            obtenerDatos();
            
            txtresultado.setText(String.valueOf(dt.suma()));

        }
        else if (event.getSource() == bresta) {
            obtenerDatos();

            txtresultado.setText(String.valueOf(dt.resta())); 
        }
        else if (event.getSource() == blimpiar) {
            txtnum1.setText(null);
            txtnum2.setText(null);
            txtresultado.setText(null);
        }
    }
    
    public void obtenerDatos(){
        try {
            double num1 = Double.parseDouble(txtnum1.getText());
            double num2 = Double.parseDouble(txtnum2.getText());
            
            dt = new Datos(num1,num2);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor invalido");
            txtnum1.setText(null);
            txtnum2.setText(null);
            txtresultado.setText(null);
        }
    }
}
