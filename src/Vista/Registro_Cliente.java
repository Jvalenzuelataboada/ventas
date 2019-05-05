

package Vista;

import Conexion.Ccliente;
import Modelo.Cliente;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Cliente extends javax.swing.JFrame {

    Ccliente cc = new Ccliente();
    Cliente cli = new Cliente();
    List<Cliente> ltc;
    List<Cliente> aux= null;

    public Registro_Cliente() {
        initComponents();
        llenarCombo();
        llenarTabla();
        jTextField1.setEnabled(false);

    }

    public void llenarCombo() {
        jComboBox1.addItem("F");
        jComboBox1.addItem("M");
        jComboBox4.addItem("0");
        jComboBox4.addItem("1");
    }

    public void desactivar() {
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jTextField1.setEnabled(false);
        jButton4.setEnabled(false);
        jTextField2.setVisible(false);
        jLabel3.setVisible(false);
        jComboBox4.setVisible(false);
        jLabel11.setVisible(false);
        jButton1.setEnabled(false);
        jTable1.setVisible(false);

    }

    public void activar() {
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton4.setEnabled(true);
        jTextField2.setVisible(true);
        jLabel3.setVisible(true);
        jComboBox4.setVisible(true);
        jLabel11.setVisible(true);
        jButton1.setEnabled(true);
        jTable1.setEnabled(true);
        jTable1.setVisible(true);
    }

    public void mostrar() {
        
        String[] cols = {"ID", "NOMBRE", "APELLIDO", "DIRECCION", "IDENTIFICACION", "CORREO", "TELEFONO", "FOTO", "ESTADO", "SEXO"};
        ltc = aux;
        Object[][] rows = new Object[ltc.size()][cols.length];
        for (int i = 0; i < ltc.size(); i++) {
            rows[i][0] = ltc.get(i).getCodigo_cliente();
            rows[i][1] = ltc.get(i).getNombre_cliente();
            rows[i][2] = ltc.get(i).getApellido_cliente();
            rows[i][3] = ltc.get(i).getDireccion();
            rows[i][4] = ltc.get(i).getIdentificacion();
            rows[i][5] = ltc.get(i).getCorreo();
            rows[i][6] = ltc.get(i).getTelefono();
            rows[i][7] = ltc.get(i).getFoto();
            rows[i][8] = ltc.get(i).getEstado();
            rows[i][9] = ltc.get(i).getSexo();

        }
        DefaultTableModel tb = new DefaultTableModel(rows, cols);
        jTable1.setModel(tb);
    
    }

    
    
    public void llenarTabla() {
        String[] cols = {"ID", "NOMBRE", "APELLIDO", "DIRECCION", "IDENTIFICACION", "CORREO", "TELEFONO", "FOTO", "ESTADO", "SEXO"};
        ltc = cc.ListaCliente();
        Object[][] rows = new Object[ltc.size()][cols.length];
        for (int i = 0; i < ltc.size(); i++) {
            rows[i][0] = ltc.get(i).getCodigo_cliente();
            rows[i][1] = ltc.get(i).getNombre_cliente();
            rows[i][2] = ltc.get(i).getApellido_cliente();
            rows[i][3] = ltc.get(i).getDireccion();
            rows[i][4] = ltc.get(i).getIdentificacion();
            rows[i][5] = ltc.get(i).getCorreo();
            rows[i][6] = ltc.get(i).getTelefono();
            rows[i][7] = ltc.get(i).getFoto();
            rows[i][8] = ltc.get(i).getEstado();
            rows[i][9] = ltc.get(i).getSexo();

        }
        DefaultTableModel tb = new DefaultTableModel(rows, cols);
        jTable1.setModel(tb);
    }

    public void limpiar() {
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jLabel15.setIcon(null);
        jLabel14.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO CLIENTE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Buscar Cliente:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Documento");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nombre");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Identificacion:");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel8.setText("Correo:");

        jLabel9.setText("Telefono:");

        jLabel10.setText("Sexo:");

        jLabel11.setText("Estado:");

        jButton6.setText("Subir Foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Foto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        String ruta = null;
        JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File("Imagenes/"));
        int ap = j.showOpenDialog(this);
        if (ap == JFileChooser.APPROVE_OPTION) {
            ruta = j.getSelectedFile().getAbsolutePath();
            jLabel15.setIcon(new ImageIcon(ruta));
            jLabel14.setText(ruta);

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String name = jTextField3.getText();
        String lastname = jTextField4.getText();
        String direccion = jTextField5.getText();
        String identificacion = jTextField6.getText();
        String correo = jTextField7.getText();
        String telefono = jTextField8.getText();
        String url = jLabel14.getText();
        String sexo = null;

        if (jComboBox1.getSelectedItem().equals("M")) {
            sexo = "M";
        } else {
            sexo = "F";
        }

        if (name.trim().length() > 2 && lastname.trim().length() > 2 && direccion.trim().length() > 2 && identificacion.trim().length() > 2 && correo.trim().length() > 2 && telefono.trim().length() > 2 && url.trim().length() != 0 && sexo.trim().length() != 0) {

            cli.setNombre_cliente(name);
            cli.setApellido_cliente(lastname);
            cli.setDireccion(direccion);
            cli.setIdentificacion(identificacion);
            cli.setCorreo(correo);
            cli.setTelefono(telefono);
            cli.setFoto(url);
            cli.setSexo(sexo);
            cc.AgregarPersona(cli);

            JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS SATISFACTORIAMENTE");
            limpiar();

            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField6.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
            jButton1.setEnabled(true);
            jButton2.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "LLENAR TODOS LOS CAMPOS");

        }
        
        llenarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion = jTable1.rowAtPoint(evt.getPoint());
        jTextField2.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
        jTextField3.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        jTextField4.setText(String.valueOf(jTable1.getValueAt(seleccion, 2)));
        jTextField5.setText(String.valueOf(jTable1.getValueAt(seleccion, 3)));
        jTextField6.setText(String.valueOf(jTable1.getValueAt(seleccion, 4)));
        jTextField7.setText(String.valueOf(jTable1.getValueAt(seleccion, 5)));
        jTextField8.setText(String.valueOf(jTable1.getValueAt(seleccion, 6)));
        jLabel14.setText(String.valueOf(jTable1.getValueAt(seleccion, 7)));
        jComboBox1.setSelectedItem(String.valueOf(jTable1.getValueAt(seleccion, 9)));
        jComboBox4.setSelectedItem(String.valueOf(jTable1.getValueAt(seleccion, 8)));


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:         
        if (jRadioButton1.isSelected()) {

            if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE && evt.getKeyChar() != KeyEvent.VK_BACKSPACE) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ingreso solo de numeros", "MENSAJE", JOptionPane.WARNING_MESSAGE);
                evt.consume();
            }
            String user = jTextField1.getText();
            String[] cols = {"Id", "Nombre", "Apellido", "Direccion", "Identificacion", "Correo", "Telefono", "Foto", "Estado", "Sexo"};
            List<Cliente> ltac = null;
            try {
                ltac = cc.ListaCliente();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Object[][] rows = new Object[ltac.size()][cols.length];
            for (int i = 0; i < ltac.size(); i++) {
                if (!"".equals(user)) {
                    if (ltac.get(i).getIdentificacion().toLowerCase().contains(user.toLowerCase())) {
                        rows[i][0] = ltac.get(i).getCodigo_cliente();
                        rows[i][1] = ltac.get(i).getNombre_cliente();
                        rows[i][2] = ltac.get(i).getApellido_cliente();
                        rows[i][3] = ltac.get(i).getDireccion();
                        rows[i][4] = ltac.get(i).getIdentificacion();
                        rows[i][5] = ltac.get(i).getCorreo();
                        rows[i][6] = ltac.get(i).getTelefono();
                        rows[i][7] = ltac.get(i).getFoto();
                        rows[i][8] = ltac.get(i).getEstado();
                        rows[i][9] = ltac.get(i).getSexo();
                    }
                } else {
                    rows[i][0] = ltac.get(i).getCodigo_cliente();
                    rows[i][1] = ltac.get(i).getNombre_cliente();
                    rows[i][2] = ltac.get(i).getApellido_cliente();
                    rows[i][3] = ltac.get(i).getDireccion();
                    rows[i][4] = ltac.get(i).getIdentificacion();
                    rows[i][5] = ltac.get(i).getCorreo();
                    rows[i][6] = ltac.get(i).getTelefono();
                    rows[i][7] = ltac.get(i).getFoto();
                    rows[i][8] = ltac.get(i).getEstado();
                    rows[i][9] = ltac.get(i).getSexo();
                }
            }
            DefaultTableModel tb = new DefaultTableModel(rows, cols);
            jTable1.setModel(tb);
        } else {
            if (jRadioButton2.isSelected()) {
                if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE && evt.getKeyChar() != KeyEvent.VK_BACKSPACE) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Ingreso solo de Letras", "MENSAJE", JOptionPane.WARNING_MESSAGE);
                    evt.consume();
                }
                String user = jTextField1.getText();
                String[] cols = {"Id", "Nombre", "Apellido", "Direccion", "Identificacion", "Correo", "Telefono", "Foto", "Estado", "Sexo"};
                List<Cliente> ltac = null;
                try {
                    ltac = cc.ListaCliente();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                Object[][] rows = new Object[ltac.size()][cols.length];
                for (int i = 0; i < ltac.size(); i++) {
                    if (!"".equals(user)) {
                        if (ltac.get(i).getNombre_cliente().toLowerCase().contains(user.toLowerCase())) {
                            rows[i][0] = ltac.get(i).getCodigo_cliente();
                            rows[i][1] = ltac.get(i).getNombre_cliente();
                            rows[i][2] = ltac.get(i).getApellido_cliente();
                            rows[i][3] = ltac.get(i).getDireccion();
                            rows[i][4] = ltac.get(i).getIdentificacion();
                            rows[i][5] = ltac.get(i).getCorreo();
                            rows[i][6] = ltac.get(i).getTelefono();
                            rows[i][7] = ltac.get(i).getFoto();
                            rows[i][8] = ltac.get(i).getEstado();
                            rows[i][9] = ltac.get(i).getSexo();
                        }
                    } else {
                        rows[i][0] = ltac.get(i).getCodigo_cliente();
                        rows[i][1] = ltac.get(i).getNombre_cliente();
                        rows[i][2] = ltac.get(i).getApellido_cliente();
                        rows[i][3] = ltac.get(i).getDireccion();
                        rows[i][4] = ltac.get(i).getIdentificacion();
                        rows[i][5] = ltac.get(i).getCorreo();
                        rows[i][6] = ltac.get(i).getTelefono();
                        rows[i][7] = ltac.get(i).getFoto();
                        rows[i][8] = ltac.get(i).getEstado();
                        rows[i][9] = ltac.get(i).getSexo();
                    }
                }
                DefaultTableModel tb = new DefaultTableModel(rows, cols);
                jTable1.setModel(tb);
            }

        }


    }//GEN-LAST:event_jTextField1KeyTyped

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jTextField1.getText().length() == 0) {
            llenarTabla();
        } else {

            if (jRadioButton2.isSelected()) {
                jTextField1.setEnabled(true);
                String dato = this.jTextField1.getText();
                aux = cc.ListaClienteN(dato);
                mostrar();
            } else {
                if (jRadioButton1.isSelected()) {
                    jTextField1.setEnabled(true);
                    String dato = this.jTextField1.getText();
                     aux = cc.ListaClienteD(dato);
                    mostrar();

                }
            }
        }


    }//GEN-LAST:event_jTextField1KeyReleased


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        desactivar();
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setEnabled(false);
        activar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped

//      if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE && evt.getKeyChar() != KeyEvent.VK_BACKSPACE) {
//        getToolkit().beep();
//        JOptionPane.showMessageDialog(null, "Ingreso solo de Letras", "MENSAJE", JOptionPane.WARNING_MESSAGE);
//        evt.consume();
//      }
//      if(String.valueOf(jTextField3.getText().charAt(0)).equals(" ")){
//          JOptionPane.showMessageDialog(null,"Su primer digito es un espacio en blanco");
//      }
//      if(String.valueOf(TEXTFIELD.getText().charAt(0)).equals(" ")){ JOptionPane.showMessageDialog(null,"Su primer digito es un espacio en blanco"); }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int codigo = Integer.parseInt(jTextField2.getText());
        String name = jTextField3.getText();
        String lastname = jTextField4.getText();
        String direccion = jTextField5.getText();
        String identificacion = jTextField6.getText();
        String correo = jTextField7.getText();
        String telefono = jTextField8.getText();
        String url = jLabel14.getText();
        String sexo = null;
        String estado = null;

        if (jComboBox4.getSelectedItem().equals("0")) {
            estado = "0";
        } else {
            estado = "1";
        }

        if (jComboBox1.getSelectedItem().equals("M")) {
            sexo = "M";
        } else {
            sexo = "F";
        }

        if (name.trim().length() > 2 && lastname.trim().length() > 2 && direccion.trim().length() > 2 && identificacion.trim().length() > 2 && correo.trim().length() > 2 && telefono.trim().length() > 2 && url.trim().length() != 0 && sexo.trim().length() != 0) {
            cli.setNombre_cliente(name);
            cli.setApellido_cliente(lastname);
            cli.setDireccion(direccion);
            cli.setIdentificacion(identificacion);
            cli.setCorreo(correo);
            cli.setTelefono(telefono);
            cli.setFoto(url);
            cli.setSexo(sexo);
            cli.setEstado(estado);
            cli.setCodigo_cliente(codigo);
            cc.ActualizarCliente(cli);
            JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS SATISFACTORIAMENTE");
            limpiar();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(rootPane, "LLENAR TODOS LOS CAMPOS");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
