package Interfaz;

import static Interfaz.Agendar.dbMongo;
import static Interfaz.Agendar.dbTablaMongo;
import static Interfaz.Agendar.puertoMongo;
import static Interfaz.Agendar.urlMongo;
import static Interfaz.Hub.holaUsuario;
import static Interfaz.InterfazGrafica.mostrarHub;
import com.mongodb.DBCursor;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.*;

public class Contactos extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Contactos() {
        initComponents();
        setLocationRelativeTo(null);

        try {

            Mongo mongo = new Mongo(urlMongo, puertoMongo);
            dbMongo = mongo.getDB("Contactos");
            dbTablaMongo = dbMongo.getCollection("listaContactos");

        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion con MongoDB. Error:" + e.toString());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
        }

        actualizar(dbMongo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JPanel();
        btnVolverTxt = new javax.swing.JLabel();
        btnExportar = new javax.swing.JPanel();
        btnExportarTxt = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JPanel();
        BtnEliminarTxt = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        btnActualizarTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        txtGuardado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(0, 134, 190));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        btnVolverTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnVolverTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolverTxt.setText("VOLVER");
        btnVolverTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 130, 40));

        btnExportar.setBackground(new java.awt.Color(0, 134, 190));
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });

        btnExportarTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnExportarTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnExportarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExportarTxt.setText("EXPORTAR");
        btnExportarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExportarLayout = new javax.swing.GroupLayout(btnExportar);
        btnExportar.setLayout(btnExportarLayout);
        btnExportarLayout.setHorizontalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExportarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnExportarLayout.setVerticalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExportarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, 40));

        BtnEliminar.setBackground(new java.awt.Color(0, 134, 190));
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        BtnEliminarTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        BtnEliminarTxt.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminarTxt.setText("ELIMINAR");
        BtnEliminarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnEliminarLayout = new javax.swing.GroupLayout(BtnEliminar);
        BtnEliminar.setLayout(BtnEliminarLayout);
        BtnEliminarLayout.setHorizontalGroup(
            BtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        BtnEliminarLayout.setVerticalGroup(
            BtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(0, 134, 190));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnActualizarTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnActualizarTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarTxt.setText("ACTUALIZAR");
        btnActualizarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 40));

        DatosTabla.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        DatosTabla.setForeground(new java.awt.Color(1, 1, 1));
        DatosTabla.setFocusable(false);
        DatosTabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DatosTabla.setRowHeight(25);
        DatosTabla.setSelectionBackground(new java.awt.Color(0, 114, 189));
        DatosTabla.setShowVerticalLines(false);
        DatosTabla.getTableHeader().setReorderingAllowed(false);
        DatosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DatosTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 630, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fortachon.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        favicon.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        favicon.setText("NETCONTACTS");
        jPanel1.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 860, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        txtGuardado.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        txtGuardado.setForeground(new java.awt.Color(84, 181, 0));
        txtGuardado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 400, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatosTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosTablaMouseClicked


    }//GEN-LAST:event_DatosTablaMouseClicked

    private void btnActualizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseClicked
        actualizar(dbMongo);
    }//GEN-LAST:event_btnActualizarTxtMouseClicked

    private void btnActualizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseEntered
        btnActualizar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnActualizarTxtMouseEntered

    private void btnActualizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTxtMouseExited
        btnActualizar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnActualizarTxtMouseExited

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void BtnEliminarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarTxtMouseClicked
        eliminar(dbMongo, dbTablaMongo);
    }//GEN-LAST:event_BtnEliminarTxtMouseClicked

    private void BtnEliminarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarTxtMouseEntered
        BtnEliminar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_BtnEliminarTxtMouseEntered

    private void BtnEliminarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarTxtMouseExited
        BtnEliminar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_BtnEliminarTxtMouseExited

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked

    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void btnExportarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarTxtMouseClicked
        exportar();
    }//GEN-LAST:event_btnExportarTxtMouseClicked

    private void btnExportarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarTxtMouseEntered
        btnExportar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnExportarTxtMouseEntered

    private void btnExportarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarTxtMouseExited
        btnExportar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnExportarTxtMouseExited

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked

    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnVolverTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTxtMouseClicked
        if (mostrarHub == null) {

            mostrarHub = new Hub();
            mostrarHub.setVisible(true);
            this.setVisible(false);
            mostrarHub = null;
        }
    }//GEN-LAST:event_btnVolverTxtMouseClicked

    private void btnVolverTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTxtMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverTxtMouseEntered

    private void btnVolverTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTxtMouseExited
        btnVolver.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVolverTxtMouseExited

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked

    }//GEN-LAST:event_btnVolverMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    public void abrirArchivo(String archivo) {
        try {
            File path = new File(archivo);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void exportar() {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet hoja = wb.createSheet();

        XSSFRow fila = hoja.createRow(0);
        fila.createCell(0).setCellValue("Nombre");
        fila.createCell(1).setCellValue("Apellido");
        fila.createCell(2).setCellValue("Numero");
        fila.createCell(3).setCellValue("Empresa");
        fila.createCell(4).setCellValue("Cargo");
        fila.createCell(5).setCellValue("Correo");
        fila.createCell(6).setCellValue("Nota Extra");

        XSSFRow filas;
        for (int i = 0; i < DatosTabla.getRowCount(); i++) {

            DatosTabla.setRowSelectionInterval(i, i);

            filas = hoja.createRow((i + 2));
            filas.createCell(0).setCellValue(DatosTabla.getValueAt(i, 0).toString());
            filas.createCell(1).setCellValue(DatosTabla.getValueAt(i, 1).toString());
            filas.createCell(2).setCellValue(DatosTabla.getValueAt(i, 2).toString());
            filas.createCell(3).setCellValue(DatosTabla.getValueAt(i, 3).toString());
            filas.createCell(4).setCellValue(DatosTabla.getValueAt(i, 4).toString());
            filas.createCell(5).setCellValue(DatosTabla.getValueAt(i, 5).toString());
            filas.createCell(6).setCellValue(DatosTabla.getValueAt(i, 6).toString());
        }

        try {
            JFileChooser elegir = new JFileChooser();
            elegir.showSaveDialog(DatosTabla);
            File guardar = elegir.getSelectedFile();
            if (guardar != null) {
                guardar = new File(guardar.toString() + ".xlsx");
            }
            FileOutputStream out = new FileOutputStream(new File(guardar.toString()));
            wb.write(out);
            out.close();
            abrirArchivo(guardar.toString());
            txtGuardado.setText("Exportado con exito.");

        } catch (IOException ex) {
            Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    

    public static void actualizar(DB db) {

//        Creo la consulta por user
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("usuario", holaUsuario);

        DBCursor cursor = dbTablaMongo.find(consulta);

        String[] columnNames = {"NOMBRE", "APELLIDO", "NUMERO", "EMPRESA", "CARGO", "CORREO", "NOTA EXTRA"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String nombre = (String) obj.get("nombre");
            String apellido = (String) obj.get("apellido");
            String telefono = (String) obj.get("telefono");
            String empresa = (String) obj.get("empresa");
            String puestoTrabajo = (String) obj.get("puestoTrabajo");
            String email = (String) obj.get("email");
            String notaExtra = (String) obj.get("notaExtra");
            model.addRow(new Object[]{nombre, apellido, telefono, empresa, puestoTrabajo, email, notaExtra});
        }

        DatosTabla.setModel(model);
        DatosTabla.getTableHeader().setFont(new Font("Roboto Light", Font.BOLD, 12));

        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setBackground(new Color(210, 213, 254));
        DatosTabla.getTableHeader().setDefaultRenderer(head_render);

        DatosTabla.getTableHeader().setForeground(new Color(1, 1, 1));
        DatosTabla.getRowHeight(25);
    }

    public static void eliminar(DB dbMongo, DBCollection dbTablaMongo) {

        int fila = DatosTabla.getSelectedRow();
        String dato = (String) DatosTabla.getValueAt(fila, 2);
        String datoNombre = (String) DatosTabla.getValueAt(fila, 0);

        dbTablaMongo.remove(new BasicDBObject().append("telefono", dato));
        txtGuardado.setText("Contacto " + datoNombre + " se a eliminado correctamente");
        actualizar(dbMongo);
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Contactos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnEliminar;
    public static javax.swing.JLabel BtnEliminarTxt;
    public static javax.swing.JTable DatosTabla;
    private javax.swing.JPanel btnActualizar;
    public static javax.swing.JLabel btnActualizarTxt;
    private javax.swing.JPanel btnExportar;
    public static javax.swing.JLabel btnExportarTxt;
    private javax.swing.JPanel btnVolver;
    public static javax.swing.JLabel btnVolverTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel txtGuardado;
    // End of variables declaration//GEN-END:variables
}
