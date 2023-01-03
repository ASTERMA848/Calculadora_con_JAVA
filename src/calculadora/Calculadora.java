/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

/**
 *
 * @author HP
 */
public class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = ""; //guarda el numero que se está ingresando en el momento para despues volverlo a 0 al momento de agregar el siguiente numero
    private String operacion = "nula"; //ayuda a saber que opeacion matematica se va a hacer
    private double primerNumero, panel; //va a guardar la primera parte de la operacion 
    private boolean activado = false; //sirve para saber si se puede hacer un calculo y no da error
    private boolean punto = true;
    private double resultado;
    private boolean modo = false;
    private boolean error = false; //variable que me va a dejar usar la calculadora o no en caso de que haya un error :)

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/calculadoras.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton7 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bExponente = new javax.swing.JToggleButton();
        bDividir = new javax.swing.JToggleButton();
        bBorrar = new javax.swing.JToggleButton();
        bRaiz = new javax.swing.JToggleButton();
        b8 = new javax.swing.JToggleButton();
        b7 = new javax.swing.JToggleButton();
        b9 = new javax.swing.JToggleButton();
        bMultiplicar = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        b6 = new javax.swing.JToggleButton();
        bSumar = new javax.swing.JToggleButton();
        bRestar = new javax.swing.JToggleButton();
        bIgual = new javax.swing.JToggleButton();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b0 = new javax.swing.JToggleButton();
        bPunto = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        pantallaResultado = new javax.swing.JLabel();
        pantallaOperacion = new javax.swing.JLabel();
        CambiarTema = new javax.swing.JButton();

        jToggleButton7.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        jToggleButton7.setText("C");
        jToggleButton7.setBorderPainted(false);
        jToggleButton7.setFocusPainted(false);
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        bExponente.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bExponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bExponente.setText("^");
        bExponente.setBorderPainted(false);
        bExponente.setFocusPainted(false);
        bExponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bExponente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bExponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExponenteActionPerformed(evt);
            }
        });

        bDividir.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bDividir.setText("/");
        bDividir.setBorderPainted(false);
        bDividir.setFocusPainted(false);
        bDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDividirActionPerformed(evt);
            }
        });

        bBorrar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        bBorrar.setForeground(new java.awt.Color(47, 58, 82));
        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bBorrar.setText("C");
        bBorrar.setBorderPainted(false);
        bBorrar.setFocusPainted(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bRaiz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bRaiz.setText("√");
        bRaiz.setBorderPainted(false);
        bRaiz.setFocusPainted(false);
        bRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRaiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaizActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b8.setForeground(new java.awt.Color(47, 58, 82));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b8.setText("8");
        b8.setBorderPainted(false);
        b8.setFocusPainted(false);
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b7.setForeground(new java.awt.Color(47, 58, 82));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b7.setText("7");
        b7.setBorderPainted(false);
        b7.setFocusPainted(false);
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b9.setForeground(new java.awt.Color(47, 58, 82));
        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b9.setText("9");
        b9.setBorderPainted(false);
        b9.setFocusPainted(false);
        b9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bMultiplicar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bMultiplicar.setText("X");
        bMultiplicar.setBorderPainted(false);
        bMultiplicar.setFocusPainted(false);
        bMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bMultiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicarActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b4.setForeground(new java.awt.Color(47, 58, 82));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b4.setText("4");
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b5.setForeground(new java.awt.Color(47, 58, 82));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b5.setText("5");
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b6.setForeground(new java.awt.Color(47, 58, 82));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b6.setText("6");
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bSumar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bSumar.setText("+");
        bSumar.setBorderPainted(false);
        bSumar.setFocusPainted(false);
        bSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumarActionPerformed(evt);
            }
        });

        bRestar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bRestar.setText("-");
        bRestar.setBorderPainted(false);
        bRestar.setFocusPainted(false);
        bRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRestar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarActionPerformed(evt);
            }
        });

        bIgual.setBackground(new java.awt.Color(24, 212, 163));
        bIgual.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bIgual.setText("=");
        bIgual.setBorderPainted(false);
        bIgual.setFocusPainted(false);
        bIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b1.setForeground(new java.awt.Color(47, 58, 82));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b1.setText("1");
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b2.setForeground(new java.awt.Color(47, 58, 82));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b2.setText("2");
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b3.setForeground(new java.awt.Color(47, 58, 82));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b3.setText("3");
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        b0.setText("0");
        b0.setBorderPainted(false);
        b0.setFocusPainted(false);
        b0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bPunto.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        bPunto.setText(".");
        bPunto.setBorderPainted(false);
        bPunto.setFocusPainted(false);
        bPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1pres.png"))); // NOI18N
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 340));

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));

        pantallaResultado.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        pantallaResultado.setForeground(new java.awt.Color(47, 58, 82));
        pantallaResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallaResultado.setText("0");

        pantallaOperacion.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        pantallaOperacion.setForeground(new java.awt.Color(47, 58, 82));
        pantallaOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallaOperacion.setText("0");

        CambiarTema.setBackground(new java.awt.Color(255, 102, 102));
        CambiarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        CambiarTema.setBorderPainted(false);
        CambiarTema.setContentAreaFilled(false);
        CambiarTema.setDefaultCapable(false);
        CambiarTema.setFocusPainted(false);
        CambiarTema.setFocusable(false);
        CambiarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pantallaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pantallaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(CambiarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CambiarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pantallaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantallaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExponenteActionPerformed
        try {
            if (error != true) {
                if (activado) {
                    primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                    pantallaResultado.setText(cadenaNumeros); //setea en la pantalla resultado el numero ingresado 
                    pantallaOperacion.setText(cadenaNumeros + "^"); //setea en la pantalla resultado el numero ingresado mas el signo /
                    cadenaNumeros = ""; //lo vuelve a 0 para ingresar el segundo numero de la operacion
                    operacion = "exponencial"; //cambia el nombre de la variable para el momento de apretar el boton =
                    activado = false;
                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
            activado = false;
        }

    }//GEN-LAST:event_bExponenteActionPerformed

    private void bDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDividirActionPerformed

        try {
            if (error != true) {
                if (activado) {
                    primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                    pantallaResultado.setText(cadenaNumeros); //setea en la pantalla resultado el numero ingresado 
                    pantallaOperacion.setText(cadenaNumeros + "/"); //setea en la pantalla resultado el numero ingresado mas el signo /
                    cadenaNumeros = ""; //lo vuelve a 0 para ingresar el segundo numero de la operacion
                    operacion = "dividir"; //cambia el nombre de la variable para el momento de apretar el boton =
                    activado = false;
                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }

    }//GEN-LAST:event_bDividirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        try {
            error = false;
            cadenaNumeros = "";
            pantallaOperacion.setText("");
            pantallaResultado.setText("");
        } catch (Exception e) {
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }

    }//GEN-LAST:event_bBorrarActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void bRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaizActionPerformed

        try {

            if (error != true) {
                primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                pantallaOperacion.setText("√" + primerNumero);
                resultado = Math.sqrt(primerNumero);
                pantallaResultado.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_bRaizActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed

        try {

            if (error = !true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "8";
                } else {
                    cadenaNumeros += "8";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed

        try {

            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "7";
                } else {
                    cadenaNumeros += "7";

                }
                pantallaOperacion.setText(cadenaNumeros);

                double t;

                t = Double.parseDouble(cadenaNumeros);

                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "9";
                } else {
                    cadenaNumeros += "9";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b9ActionPerformed

    private void bMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicarActionPerformed
        try {
            if (error != true) {
                if (activado) {
                    primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                    pantallaResultado.setText(cadenaNumeros); //setea en la pantalla resultado el numero ingresado 
                    pantallaOperacion.setText(cadenaNumeros + "x"); //setea en la pantalla resultado el numero ingresado mas el signo x
                    cadenaNumeros = ""; //lo vuelve a 0 para ingresar el segundo numero de la operacion
                    operacion = "multiplicar"; //cambia el nombre de la variable para el momento de apretar el boton =
                    activado = false;
                }

            }
        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }

    }//GEN-LAST:event_bMultiplicarActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "4";
                } else {
                    cadenaNumeros += "4";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "5";
                } else {
                    cadenaNumeros += "5";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "6";
                } else {
                    cadenaNumeros += "6";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            error = true;

            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b6ActionPerformed

    private void bSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumarActionPerformed
        try {
            if (error != true) {
                if (activado) {
                    primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                    pantallaResultado.setText(cadenaNumeros); //setea en la pantalla resultado el numero ingresado 
                    pantallaOperacion.setText(cadenaNumeros + "+"); //setea en la pantalla resultado el numero ingresado mas el signo +
                    cadenaNumeros = ""; //lo vuelve a 0 para ingresar el segundo numero de la operacion
                    operacion = "sumar"; //cambia el nombre de la variable para el momento de apretar el boton =
                    activado = false;
                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }

    }//GEN-LAST:event_bSumarActionPerformed

    private void bRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarActionPerformed
        try {
            if (error != true) {
                if (cadenaNumeros.equals("")) { //ESTA PARTE LA HGAO POR SI EL PRIMER NUMERO QUE SE QUIERE INGRESAR Es Negativo
                    pantallaOperacion.setText("-");
                    cadenaNumeros += ("-");
                }

                if (activado) {
                    primerNumero = Double.parseDouble(cadenaNumeros); //hace que la primer parte del numero se guarde en la variable primerNumero
                    pantallaResultado.setText(cadenaNumeros); //setea en la pantalla resultado el numero ingresado 
                    pantallaOperacion.setText(cadenaNumeros + "-"); //setea en la pantalla resultado el numero ingresado mas el signo -
                    cadenaNumeros = ""; //lo vuelve a 0 para ingresar el segundo numero de la operacion
                    operacion = "restar"; //cambia el nombre de la variable para el momento de apretar el boton =
                    activado = false;

                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_bRestarActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        try {

            if (error != true) {
                punto = true;
                double segundoNumero;
                if (operacion.equals("sumar")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros); //convierte la variable de la pantalla de la calculadora a DOUBLE
                    resultado = primerNumero + segundoNumero; //HACE LA SUMA
                    pantallaResultado.setText(String.format("% .01f", resultado)); //Setea el resultado en la pantalla y el "% .1f" hacer que tengo un decimal depues de la coma

                    cadenaNumeros = String.valueOf(resultado); //vuelve a setear la cadena de numero en caso de que se quira seguir haciendo una operacion con el resultado obtenido
                    operacion = "nula";

                }

                if (operacion.equals("multiplicar")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros); //convierte la variable de la pantalla de la calculadora a DOUBLE
                    resultado = (primerNumero * segundoNumero); //HACE LA multiplicacion
                    pantallaResultado.setText(String.format("% .0f", resultado)); //Setea el resultado en la pantalla y el "% .1f" hacer que tengo un decimal depues de la coma
                    cadenaNumeros = String.valueOf(resultado); //vuelve a setear la cadena de numero en caso de que se quira seguir haciendo una operacion con el resultado obtenido
                    operacion = "nula";

                }
                if (operacion.equals("restar")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros); //convierte la variable de la pantalla de la calculadora a DOUBLE
                    resultado = primerNumero - segundoNumero; //HACE LA resta
                    pantallaResultado.setText(String.format("% .0f", resultado)); //Setea el resultado en la pantalla y el "% .1f" hacer que tengo un decimal depues de la coma

                    cadenaNumeros = String.valueOf(resultado); //vuelve a setear la cadena de numero en caso de que se quira seguir haciendo una operacion con el resultado obtenido
                    operacion = "nula";

                }

                if (operacion.equals("dividir")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros); //convierte la variable de la pantalla de la calculadora a DOUBLE
                    if (segundoNumero == 0) {
                        pantallaResultado.setText("ERROR");
                    } else {
                        resultado = primerNumero / segundoNumero; //HACE LA fivision
                        pantallaResultado.setText(String.format("% .0f", resultado)); //Setea el resultado en la pantalla y el "% .1f" hacer que tengo un decimal depues de la coma

                        cadenaNumeros = String.valueOf(resultado); //vuelve a setear la cadena de numero en caso de que se quira seguir haciendo una operacion con el resultado obtenido
                        operacion = "nula";
                    }

                }

                if (operacion.equals("exponencial")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = Math.pow(primerNumero, segundoNumero); //metodo de la clase Math que calcula el exponente
                    pantallaResultado.setText(String.format("% .3f", resultado)); //Setea el resultado en la pantalla y el "% .1f" hacer que tengo un decimal depues de la coma
                    cadenaNumeros = String.valueOf(resultado); //vuelve a setear la cadena de numero en caso de que se quira seguir haciendo una operacion con el resultado obtenido
                    operacion = "nula";
                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_bIgualActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "1";
                } else {
                    cadenaNumeros += "1";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "2";
                } else {
                    cadenaNumeros += "2";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "3";
                } else {
                    cadenaNumeros += "3";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_b3ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed

        try {
            if (error != true) {
                if (pantallaOperacion.equals("0")) {
                    cadenaNumeros = "0";
                } else {
                    cadenaNumeros += "0";

                }
                pantallaOperacion.setText(cadenaNumeros);
                activado = true;
                punto = true;
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }

    }//GEN-LAST:event_b0ActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed

        try {

            if (error != true) {
                if (punto) {
                    if (cadenaNumeros.equals("") || cadenaNumeros.equals("0")) {
                        cadenaNumeros = "0.";
                        pantallaOperacion.setText(cadenaNumeros);
                        punto = false;
                    } else {
                        cadenaNumeros = cadenaNumeros + ".";
                        pantallaOperacion.setText(cadenaNumeros);
                        punto = false;
                    }

                }
            }

        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_bPuntoActionPerformed

    private void CambiarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarTemaActionPerformed

        try {
            if (modo == false) {
                CambiarTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/icon2.png")));//CAMBIA EL FONDO
                //---CAMBIA EL FONDO DE LA CALCULADORA
                jPanel1.setBackground(Color.decode("#212b41"));
                jPanel5.setBackground(Color.decode("#2e3951"));
                //---CAMBIA EL COLOR DE LAS DOS PANTALLAS
                pantallaOperacion.setForeground(Color.decode("#0db387"));
                pantallaResultado.setForeground(Color.decode("#0db387"));

                cambiarBotonNumeros(b0);
                cambiarBotonNumeros(b1);
                cambiarBotonNumeros(b2);
                cambiarBotonNumeros(b3);
                cambiarBotonNumeros(b4);
                cambiarBotonNumeros(b5);
                cambiarBotonNumeros(b6);
                cambiarBotonNumeros(b7);
                cambiarBotonNumeros(b8);
                cambiarBotonNumeros(b9);

                cambiarBotonSignos(bSumar);
                cambiarBotonSignos(bRestar);
                cambiarBotonSignos(bMultiplicar);
                cambiarBotonSignos(bDividir);
                cambiarBotonSignos(bBorrar);
                cambiarBotonSignos(bExponente);
                cambiarBotonSignos(bRaiz);
                cambiarBotonSignos(bPunto);

                bIgual.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton4.png")));
                bIgual.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton3.png")));
                bIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton3.png")));
                bIgual.setForeground(Color.decode("#585858"));

                modo = true;
            } else {
                Calculadora cal = new Calculadora(); //creo una instancia de la clase
                //esto hace que se reinicie y se vuelve a abrir el programa
                this.dispose();
                cal.setVisible(true);

            }
        } catch (Exception e) {
            error = true;
            pantallaOperacion.setText("Error");
            pantallaResultado.setText("Error");
        }


    }//GEN-LAST:event_CambiarTemaActionPerformed

    public void cambiarBotonNumeros(JToggleButton bot) { //METODO PARA CAMBIAR EL ESTILO AL MODO OSCURO DE LOS NUMEROS
        bot.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton5.png")));//CAMBIA EL FONDO
        bot.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton4.png")));//CAMBIA EL FONDO PRESIONADO
        bot.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton4.png")));//CAMBIA EL FONDO CUANDO HOVER
        bot.setForeground(Color.decode("#585858"));//CAMBIA EL COLOR DE LA LETRA
    }

    public void cambiarBotonSignos(JToggleButton bot) { //METODO PARA CAMBIAR EL ESTILO AL MODO OSCURO DE LOS SIGNOS
        bot.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton3.png"))); //CAMBIA EL FONDO
        bot.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton3.png"))); //CAMBIA EL FONDO PRESIONADO
        bot.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton4.png"))); //CAMBIA EL FONDO CUANDO HOVER
        bot.setForeground(Color.decode("#0db387")); //CAMBIA EL COLOR DE LA LETRA
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarTema;
    private javax.swing.JToggleButton b0;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.JToggleButton b6;
    private javax.swing.JToggleButton b7;
    private javax.swing.JToggleButton b8;
    private javax.swing.JToggleButton b9;
    private javax.swing.JToggleButton bBorrar;
    private javax.swing.JToggleButton bDividir;
    private javax.swing.JToggleButton bExponente;
    private javax.swing.JToggleButton bIgual;
    private javax.swing.JToggleButton bMultiplicar;
    private javax.swing.JToggleButton bPunto;
    private javax.swing.JToggleButton bRaiz;
    private javax.swing.JToggleButton bRestar;
    private javax.swing.JToggleButton bSumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JLabel pantallaOperacion;
    private javax.swing.JLabel pantallaResultado;
    // End of variables declaration//GEN-END:variables

}
