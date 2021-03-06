

package interfaces;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileFilter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Clases.Exporter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *Interfaz de la agenda
 * @author Jean Mosquera
 */
public class ListTareas extends javax.swing.JFrame {
    private int pos;

    
    public ListTareas() {
        initComponents();
        Hilo hiloHora = new Hilo();// Creacion de Hilo para reloj
        hiloHora.start(); //Inicializacionde Hilo
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        tabla.setRowSorter(new TableRowSorter(modelo));    
    }
    private TableRowSorter trsFiltro;
    
        public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Fecha") {
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "Materia") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "Prioridad") {
            columnaABuscar = 2;
        }
        if(comboFiltro.getSelectedItem()=="Tarea"){
            columnaABuscar=3;
        }
        if(comboFiltro.getSelectedItem()=="Completa"){
            columnaABuscar=4;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }
        
        // Fecha FORMATO 03 de Julio de 2016
        SimpleDateFormat formato1 = new SimpleDateFormat(
            "dd 'de' MMMM 'de' yyyy", Locale.getDefault());
        Date fechaDate = new Date();
        String fecha = formato1.format(fechaDate);
        
        
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Fecha1 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblFiltro = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textTarea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        textMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPrioridad = new javax.swing.JTextField();
        jcbPrioridad = new javax.swing.JComboBox<>();
        btnExportar = new javax.swing.JButton();

        jLabel13.setText("jLabel13");

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 2, 2, new java.awt.Color(0, 0, 204)));

        Fecha1.setText("Fecha ");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(Fecha1)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(Fecha1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jMenu1.setText("jMenu1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Estudiantil");
        setBackground(new java.awt.Color(13, 67, 113));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 67, 113));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA Y HORA ACTUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Britannic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Fecha.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("Fecha :  " +fecha);

        Hora.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setText("Hora");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(Fecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 72, Short.MAX_VALUE)
                .add(Hora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Fecha)
                    .add(Hora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 480, 60));

        jPanel2.setBackground(new java.awt.Color(13, 67, 113));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAREAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Britannic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Materia", "Prioridad", "Tarea", "Completa"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(4).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox1));
        }

        lblFiltro.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltro.setText("Buscar Por:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Materia", "Prioridad", "Tarea", "Completa" }));

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .add(jPanel2Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(lblFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(comboFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(81, 81, 81)
                .add(txtFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblFiltro)
                    .add(comboFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 347, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 59, 480, 420));

        btnAñadir.setText("Añadir Tarea");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, 30));

        btnEliminar.setText("Eliminar Tarea");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 140, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        btnModificar.setText("Modificar Tarea");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, 30));

        jPanel5.setBackground(new java.awt.Color(253, 190, 17));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCIÓN DE LA TAREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Britannic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        textTarea.setColumns(20);
        textTarea.setRows(5);
        textTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(textTarea);

        jLabel11.setText("Asignatura");

        jLabel12.setText("Descripcion ");

        jLabel3.setText("Fecha");

        jLabel4.setText("Prioridad");

        textPrioridad.setBackground(new java.awt.Color(253, 190, 17));
        textPrioridad.setForeground(new java.awt.Color(253, 190, 17));
        textPrioridad.setCaretColor(new java.awt.Color(253, 190, 17));
        textPrioridad.setDisabledTextColor(new java.awt.Color(253, 190, 17));
        textPrioridad.setEnabled(false);
        textPrioridad.setOpaque(false);
        textPrioridad.setSelectedTextColor(new java.awt.Color(253, 190, 17));
        textPrioridad.setSelectionColor(new java.awt.Color(253, 190, 17));
        textPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrioridadActionPerformed(evt);
            }
        });

        jcbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));
        jcbPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPrioridadActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel5Layout.createSequentialGroup()
                                .add(jLabel11)
                                .add(52, 52, 52)
                                .add(textMateria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5Layout.createSequentialGroup()
                                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel12)
                                    .add(jPanel5Layout.createSequentialGroup()
                                        .add(4, 4, 4)
                                        .add(jLabel3)))
                                .add(47, 47, 47)
                                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(dateFecha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                        .add(29, 29, 29))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5Layout.createSequentialGroup()
                        .add(jLabel4)
                        .add(62, 62, 62)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jcbPrioridad, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(textPrioridad, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(dateFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(98, 98, 98)
                        .add(jLabel12))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(44, 44, 44)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textMateria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .add(69, 69, 69)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textPrioridad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4)
                    .add(jcbPrioridad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(51, 51, 51))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        btnExportar.setText("Exportar tareas a Excel");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean esExtensionAgenda(File f){
        if (f.length()>3){
            String sNombre=f.getAbsolutePath().toLowerCase();
            if (sNombre.substring(sNombre.length()-4,sNombre.length()).equals(".txt")){
                return true;
            }
        }
        return false;
    }
    //Hilo para reloj
    class Hilo extends Thread {

        @Override
        public void run() {
            while (true) {
                Date date = new Date();
                int horas = date.getHours();
                int minutos = date.getMinutes();
                int segundos = date.getSeconds();
               // System.out.println(horas + ":" + minutos + ":" + segundos);
                Hora.setText("Hora : "+horas + ":" + minutos + ":" + segundos);

                try {
                    //Necesario para que no haya interrupcion
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private FileFilter getFileFilter(){
        return new FileFilter() {
            public boolean accept(File f) {
                if (f.isDirectory())
                    return true;
                return esExtensionAgenda(f);
            }
            public String getDescription() {
                return "Ficheros ";
            }
        };
    }
     
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        if (pos>=0) {
            modelo.removeRow(pos);
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione una fila");   
        }   
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void limpiarCampos(){
        textMateria.setText("");
        textPrioridad.setText("");
        textTarea.setText("");

    }
    
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
// TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        String fecha= new SimpleDateFormat("dd/MM/yyyy").format(dateFecha.getDate());
        //Arreglo
        String[] datos = {fecha,textMateria.getText(),jcbPrioridad.getSelectedItem().toString(),textTarea.getText()};
        modelo.addRow(datos);

        limpiarCampos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        pos=tabla.getSelectedRow();
        if (pos>=0) {
            textMateria.setText(modelo.getValueAt(pos,1).toString());
            textPrioridad.setText(modelo.getValueAt(pos,2).toString());
            textTarea.setText(modelo.getValueAt(pos,3).toString());
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        if (pos>=0) {
            String fecha= new SimpleDateFormat("dd/MM/yyyy").format(dateFecha.getDate());
            modelo.setValueAt(fecha,pos,0);
            modelo.setValueAt(textMateria.getText(),pos,1);
            modelo.setValueAt(textPrioridad.getText(),pos,2);
            modelo.setValueAt(textTarea.getText(), pos, 3);
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione una fila");
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseReleased

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // TODO add your handling code here:
     txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        
         if (tabla.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<JTable>();
                List<String> nom = new ArrayList<String>();
                tb.add(tabla);
                nom.add("Tareas");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exporter e = new Exporter(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados correctamente a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos para exportar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnExportarActionPerformed

    private void textPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrioridadActionPerformed

    private void jcbPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPrioridadActionPerformed
        // TODO add your handling code here:
        textPrioridad.setText (jcbPrioridad.getSelectedItem().toString());
    }//GEN-LAST:event_jcbPrioridadActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListTareas().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel Hora;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> comboFiltro;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbPrioridad;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textMateria;
    private javax.swing.JTextField textPrioridad;
    private javax.swing.JTextArea textTarea;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

}
