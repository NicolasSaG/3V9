package buscaminas;

/**
 *
 * @author fnico
 */

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    //primero resuelvo la vista para que me pinte
    
    
    //una pantalla con botones
    //Cantidad de filas
    int filas = 10;
    //Cantidad de Columnas
    int columnas = 8;
    //Cantidad de minas en la partida
    int numMinas = 16;
    
    Icon iconFlag = new ImageIcon("images/flag.png");
    Icon iconMina = new ImageIcon("images/mina.png");
    //Hacemos un array bidimensional de botones, del tamaño de filas por columnas
    Boton[][] arrayBotones = new Boton[filas][columnas];
    
    //Fin del juego xd
    boolean gameOver = false;

    //Bombas aleatorias
    private void ponUnaBomba() {
        //Numero random
        Random r = new Random();
        //Se declaran 2 integers, y se les pone randoms para que las minas
        //aparezcan en diferentes lados
        int f = r.nextInt(filas);
        int c = r.nextInt(columnas);
        arrayBotones[f][c].bomba = 1;
    }

    
    //Cuanta cuantas minas hay alrededor de la celda
    private void cuentaMinas() {
        int minas = 0;
        //Empieza el la primer fila
        for (int i = 0; i < filas; i++) {
            //En la primer columna
            for (int j = 0; j < columnas; j++) {
                //for anidado para recorrer las 8 casillas que hay alrededor
                for (int k = -1; k < 2; k++) {
                    for (int m = -1; m < 2; m++) {
                        if ((i + k >= 0) && (j + m >= 0) && (i + k < filas) && (j + m < columnas)) {
                            minas += arrayBotones[i + k][j + m].bomba;
                        }
                    }
                }
                //Escribe la cantidad de minas en la posicion (i,j)
                arrayBotones[i][j].numeroMinasAlrededor = minas;
                //Minas regresa a cero, para que el contador empiece otra vez
                minas = 0;
                //Si no tiene bombas alrededor enconces
                if ((arrayBotones[i][j].numeroMinasAlrededor > 0)
                        && (arrayBotones[i][j].bomba == 0)) {
                    //No se le asigna nada al boton
                    arrayBotones[i][j].setText("");
                }
            }
        }
    }

    //Se crea la ventana
    public Main() {
        initComponents();
        setSize(320, 320);
        //El jFrame va a usar un layout de rejilla
        getContentPane().setLayout(new GridLayout(filas, columnas));
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Boton boton = new Boton(i, j);
                boton.setBorder(null);
                //Añado el evento del clic del ratón
                boton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent evt) {
                        //Metodo a llamar cuando se pulse el botón
                        botonPulsado(evt);

                    }
                });
                //Añado el botón a mi array de botones
                arrayBotones[i][j] = boton;
                //Añado el botón a la pantalla
                getContentPane().add(boton);
            }
        }
        for (int i = 0; i < numMinas; i++) {
            ponUnaBomba();
        }
        cuentaMinas();
    }
    
    //Fin de partida xd
    private void finDePartida() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //Otro for anidado para recorrer todas los botones
                Boton boton = arrayBotones[i] [j];
                
                //Si el boton tiene una bomba, se le asigna el icono mina
                if (boton.bomba == 1) {
                    boton.setIcon(iconMina);
                    boton.setEnabled(false);
                } else {
                    //
                    if(boton.numeroMinasAlrededor > 0)
                        boton.setText(boton.numeroMinasAlrededor + "");
                    boton.setEnabled(false);
                }
            }
        }

    }

    //Este metodo es llamado cada vez que hacemos clic en un botón
    private void botonPulsado(MouseEvent e) {
        if (!gameOver) {
            Boton miBoton = (Boton) e.getComponent();
            //Pone banderitas xd
            if (e.getButton() == MouseEvent.BUTTON3) {
                //miBoton.setText("?");
                miBoton.setIcon(iconFlag);
            } else {
            //si el boton tiene una bomba, explota y termina el juego
            //Se declara un arraylist para ir guardando la lista de botones
            //que tengo que verificar
                if (miBoton.bomba == 1) {
                    JOptionPane.showMessageDialog(null, "Perdiste :c");
                    miBoton.setFocusPainted(false);
                    finDePartida();
                    gameOver=true;
                } else {
                    if (miBoton.numeroMinasAlrededor>0)
                        miBoton.setText(miBoton.numeroMinasAlrededor+"");
                    ArrayList<Boton> listaDeCasillasAMirar = new ArrayList();
                    //añado el botón que ha sido pulsado
                    listaDeCasillasAMirar.add(miBoton);

                    while (listaDeCasillasAMirar.size() > 0) {
                        Boton b = listaDeCasillasAMirar.get(0);
                        for (int k = -1; k < 2; k++) {
                            for (int m = -1; m < 2; m++) {
                                if ((b.x + k >= 0) && (b.y + m >= 0) && (b.x + k < filas) && (b.y + m < columnas)) {
                                //si el boton de esa posición está habilitado 
                                    //es que no lo he chequeado todavia
                                    if (arrayBotones[b.x + k][b.y + m].isEnabled()) {
                                        if (arrayBotones[b.x + k][b.y + m].numeroMinasAlrededor == 0) {
                                            arrayBotones[b.x + k][b.y + m].setEnabled(false);
                                            listaDeCasillasAMirar.add(arrayBotones[b.x + k][b.y + m]);
                                        }
                                    }
                                }
                            }
                        }
                        listaDeCasillasAMirar.remove(b);
                    }

                }
                //si no, verificamos la casilla 
                miBoton.setFocusPainted(false);

            }
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}

