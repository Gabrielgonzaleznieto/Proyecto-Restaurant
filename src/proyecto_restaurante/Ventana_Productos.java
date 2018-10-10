
package proyecto_restaurante;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gabriel gonzalez
 */
public class Ventana_Productos extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultComboBoxModel modeloCodigo, modeloNombre;
    
   Correo c=new Correo();
    
    public Ventana_Productos() {
        initComponents(); // Debajo de initComponets van a correr los procedimientos declarados cuando inicie mi Sistema.
        
        this.setLocationRelativeTo(null); // CON ESTA SENTENCIA EL FRAME APARECE CENTRADO.
        
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.
      
        modelo.addColumn("MESERO/A");
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        
        TablaPedidos.setModel(modelo);
        
        cargarCodigo();
      //  cursores();
       
    } 
    
    /* public void cursores() {
        Cursor cursor;
        ImageIcon imagen = new ImageIcon("src\\Imagenes\\Cursor.png");
        Toolkit t = Toolkit.getDefaultToolkit();
        cursor =t.createCustomCursor(imagen.getImage(), new Point(1,1),"Cursor");
        setCursor(cursor);
     } */
     
    public void enviarCorreo(){
        c.setContrasenia("vdgvygfhnuielehh");
        c.setUsuarioCorreo("restaurantsansrats@gmail.com");
        c.setAsunto(txtasunto.getText());
        c.setMensaje(txtmensaje.getText());
        c.setDestino(txtdestino.getText().trim());
        
        ControladorCorreo co = new ControladorCorreo();
        if(co.enviarCorreo(c)){
            JOptionPane.showMessageDialog(null, "MENSAJE ENVIADO");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR DE ENVIO");
        }
        
        txtdestino.setText("");
        txtasunto.setText("");
        txtmensaje.setText("");
    }
    
    
    public final void cargarCodigo(){
        
        String [] cod={"SELECCIONAR","BEBIDAS","ENSALADAS","COMIDAS","POSTRES"};
        modeloCodigo = new DefaultComboBoxModel(cod);
        Boxcodigo.setModel(modeloCodigo);
    }
    
    public void cargarNombre(){
        
        String [] bebidas={" ","Agua Mineral 1L","Gaseosa Coca Cola 2.25L","Gaseosa Fanta 2L", "Gaseosa Tónica 1.5L", "Cerveza Quilmes 1L","Cerveza Stella Artois 1L","Cavernet Sauvignon 750cc","Chardonnay 750cc"};
        String [] ensaladas={" ","Ensalada Mixta","Ensalada César","Ensada c/Atún", "Ensalada Rúcula y Parmesano"};
        String [] comidas={" ","Pizza Muzzarela","Pizza Especial c/Anchoas","Lomito de Carne","Lomito de Pollo","Hamburguesa Completa","Tacos c/Salsa Picante"};      
        String [] postres={" ","Tiramisu","Flan c/Crema","Copa Helada","Mousse de Chocolate"};
        
        String codigosvarios=Boxcodigo.getSelectedItem().toString();
        if(codigosvarios.equals("BEBIDAS")){
            modeloNombre=new DefaultComboBoxModel(bebidas);
            Boxnombre.setModel(modeloNombre);
        } else if(codigosvarios.equals("ENSALADAS")){
            modeloNombre=new DefaultComboBoxModel(ensaladas);
            Boxnombre.setModel(modeloNombre);
        } else if(codigosvarios.equals("COMIDAS")){
            modeloNombre=new DefaultComboBoxModel(comidas);
            Boxnombre.setModel(modeloNombre);
        } else if(codigosvarios.equals("POSTRES")){
            modeloNombre=new DefaultComboBoxModel(postres);
            Boxnombre.setModel(modeloNombre);
        }
    }
    

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MESAS_RESTAURANTE = new javax.swing.ButtonGroup();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Boxmesero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        radio4 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        reserva1 = new javax.swing.JCheckBox();
        reserva2 = new javax.swing.JCheckBox();
        reserva3 = new javax.swing.JCheckBox();
        reserva4 = new javax.swing.JCheckBox();
        asignarmesa1 = new javax.swing.JButton();
        asignarmesa2 = new javax.swing.JButton();
        asignarmesa3 = new javax.swing.JButton();
        asignarmesa4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Boxcodigo = new javax.swing.JComboBox<>();
        Boxnombre = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtasunto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnenviocorreo = new javax.swing.JButton();
        txtdestino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmensaje = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1104, 630));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(970, 1100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 200, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel1.setText(" Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel2.setText(" Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 80, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel5.setText(" Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel6.setText(" Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 80, 30));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 180, 30));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 180, 30));

        TablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio"
            }
        ));
        TablaPedidos.setRowHeight(25);
        jScrollPane2.setViewportView(TablaPedidos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 780, 180));

        btnModificar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 200, 30));

        btnEliminarTodo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnEliminarTodo.setText("ELIMINAR ");
        btnEliminarTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 200, 30));

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 160, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel4.setText(" Mesero/a:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, 30));

        Boxmesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Andrea Gonzalez", "Nabila Guevara", "Hector Gutierrez", "Gabriel Gonzalez", " " }));
        getContentPane().add(Boxmesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 180, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        jLabel7.setText("MESA 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 70, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("MESA 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("MESA 3");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, 30));

        MESAS_RESTAURANTE.add(radio1);
        getContentPane().add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        MESAS_RESTAURANTE.add(radio2);
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });
        getContentPane().add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        MESAS_RESTAURANTE.add(radio3);
        getContentPane().add(radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 0));
        jLabel10.setText("MESA 4");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, -1, 30));

        MESAS_RESTAURANTE.add(radio4);
        getContentPane().add(radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel11.setText("SUB-TOTAL:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, 30));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 120, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel12.setText("MONTO-TOTAL:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, 30));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 130, 30));

        reserva1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        reserva1.setForeground(new java.awt.Color(204, 0, 0));
        reserva1.setText(" RESERVADA");
        reserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserva1ActionPerformed(evt);
            }
        });
        getContentPane().add(reserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, 20));

        reserva2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        reserva2.setForeground(new java.awt.Color(204, 0, 0));
        reserva2.setText(" RESERVADA");
        reserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserva2ActionPerformed(evt);
            }
        });
        getContentPane().add(reserva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, 20));

        reserva3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        reserva3.setForeground(new java.awt.Color(204, 0, 0));
        reserva3.setText(" RESERVADA");
        reserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserva3ActionPerformed(evt);
            }
        });
        getContentPane().add(reserva3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 100, 20));

        reserva4.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        reserva4.setForeground(new java.awt.Color(204, 0, 0));
        reserva4.setText(" RESERVADA");
        reserva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserva4ActionPerformed(evt);
            }
        });
        getContentPane().add(reserva4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, 20));

        asignarmesa1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        asignarmesa1.setForeground(new java.awt.Color(102, 51, 0));
        asignarmesa1.setText("ASIGNAR ");
        asignarmesa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        asignarmesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarmesa1ActionPerformed(evt);
            }
        });
        getContentPane().add(asignarmesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 70, 60));

        asignarmesa2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        asignarmesa2.setForeground(new java.awt.Color(102, 51, 0));
        asignarmesa2.setText("ASIGNAR ");
        asignarmesa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        asignarmesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarmesa2ActionPerformed(evt);
            }
        });
        getContentPane().add(asignarmesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 70, 60));

        asignarmesa3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        asignarmesa3.setForeground(new java.awt.Color(102, 51, 0));
        asignarmesa3.setText("ASIGNAR ");
        asignarmesa3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        asignarmesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarmesa3ActionPerformed(evt);
            }
        });
        getContentPane().add(asignarmesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 70, 60));

        asignarmesa4.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        asignarmesa4.setForeground(new java.awt.Color(102, 51, 0));
        asignarmesa4.setText("ASIGNAR ");
        asignarmesa4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        asignarmesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarmesa4ActionPerformed(evt);
            }
        });
        getContentPane().add(asignarmesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 70, 60));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARGAR PEDIDO", "MESA 1", "MESA 2", "MESA 3", "MESA 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 180, 30));

        Boxcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(Boxcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, 30));

        getContentPane().add(Boxnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ASUNTO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 50, 40));
        getContentPane().add(txtasunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 180, 20));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DESTINO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 40));

        btnenviocorreo.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnenviocorreo.setText("ENVIAR");
        btnenviocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviocorreoActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, 20));
        getContentPane().add(txtdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 180, 20));

        txtmensaje.setColumns(20);
        txtmensaje.setRows(5);
        jScrollPane1.setViewportView(txtmensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 240, 50));

        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    public void Limpiar(){
    Boxmesero.setSelectedIndex(0);
    Boxcodigo.setSelectedIndex(0);
    Boxnombre.setSelectedIndex(0);
    txtCantidad.setText("");
    txtPrecio.setText(""); 

    }
    

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          
        String Dato[] = new String[5];
        Dato[0] = Boxmesero.getSelectedItem().toString();
        Dato[1] = Boxcodigo.getSelectedItem().toString();
        Dato[2] = Boxnombre.getSelectedItem().toString();
        Dato[3] = txtCantidad.getText();
        Dato[4] = txtPrecio.getText(); 
        modelo.addRow(Dato);
        
        Limpiar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
              
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      
        int FilaSele = TablaPedidos.getSelectedRow();
        
        if(FilaSele >= 0){ 
            Boxmesero.setSelectedItem(TablaPedidos.getValueAt(FilaSele, 0).toString()); 
            Boxcodigo.setSelectedItem(TablaPedidos.getValueAt(FilaSele, 1).toString()); 
            Boxnombre.setSelectedItem(TablaPedidos.getValueAt(FilaSele, 2).toString()); 
            txtCantidad.setText(TablaPedidos.getValueAt(FilaSele, 3).toString());
            txtPrecio.setText(TablaPedidos.getValueAt(FilaSele, 4).toString());
            modelo.removeRow(FilaSele);
            
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione la Fila a Modificar ");
        }
      
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        
       int FilaSele= TablaPedidos.getSelectedRow();
      
       if(FilaSele >= 0){ 
            
            modelo.removeRow(FilaSele);
            
       }else{
       
            JOptionPane.showMessageDialog(this, "Los Datos han sido Eliminados ");
         }
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ActionPerformed

    public void asignarMesa(){
        
        if(radio1.isSelected()){
            JOptionPane.showMessageDialog(null, "Se asignó la Mesa 1, para 2 PERSONAS ");
        }else if(radio2.isSelected()){
            JOptionPane.showMessageDialog(null, "Se asignó la Mesa 2, para 4 PERSONAS ");
        }else if(radio3.isSelected()){
            JOptionPane.showMessageDialog(null, "Se asignó la Mesa 3, para 6 PERSONAS ");
        }else if(radio4.isSelected()){
            JOptionPane.showMessageDialog(null, "Se asignó la Mesa 4, para 8 PERSONAS ");
        }
    }
    
    private void asignarmesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarmesa1ActionPerformed
        asignarMesa();
    }//GEN-LAST:event_asignarmesa1ActionPerformed

    private void asignarmesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarmesa2ActionPerformed
        asignarMesa();
    }//GEN-LAST:event_asignarmesa2ActionPerformed

    private void asignarmesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarmesa3ActionPerformed
        asignarMesa();
    }//GEN-LAST:event_asignarmesa3ActionPerformed

    private void asignarmesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarmesa4ActionPerformed
        asignarMesa();
    }//GEN-LAST:event_asignarmesa4ActionPerformed

    
    private void reserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserva1ActionPerformed
       
        if(reserva1.isSelected()){
            asignarmesa1.setEnabled(false); 
            JOptionPane.showMessageDialog(null, "MESA 1 RESERVADA");
            
        } else {
            asignarmesa1.setEnabled(true);
           JOptionPane.showMessageDialog(null, "RESERVA CANCELADA");
        }
    }//GEN-LAST:event_reserva1ActionPerformed

    private void reserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserva2ActionPerformed
          
        if(reserva2.isSelected()){
            asignarmesa2.setEnabled(false); 
            JOptionPane.showMessageDialog(null, "MESA 2 RESERVADA");
            
        } else {
             asignarmesa2.setEnabled(true);
             JOptionPane.showMessageDialog(null, "RESERVA CANCELADA");    
        }
    }//GEN-LAST:event_reserva2ActionPerformed

    private void reserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserva3ActionPerformed
       
        if(reserva3.isSelected()){
            asignarmesa3.setEnabled(false); 
            JOptionPane.showMessageDialog(null, "MESA 3 RESERVADA");
            
        }else {
             asignarmesa3.setEnabled(true);
             JOptionPane.showMessageDialog(null, "RESERVA CANCELADA");    
        } 
    }//GEN-LAST:event_reserva3ActionPerformed

    private void reserva4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserva4ActionPerformed
        
         if(reserva4.isSelected()){
            asignarmesa4.setEnabled(false); 
            JOptionPane.showMessageDialog(null, "MESA 4 RESERVADA");
            
        }else {
             asignarmesa4.setEnabled(true);
             JOptionPane.showMessageDialog(null, "RESERVA CANCELADA");
        }         
    }//GEN-LAST:event_reserva4ActionPerformed

    private void BoxcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxcodigoActionPerformed
        cargarNombre();
    }//GEN-LAST:event_BoxcodigoActionPerformed

    private void btnenviocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviocorreoActionPerformed
        enviarCorreo(); 
    }//GEN-LAST:event_btnenviocorreoActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

    }//GEN-LAST:event_txtCantidadKeyTyped

    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana_Productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Boxcodigo;
    private javax.swing.JComboBox<String> Boxmesero;
    private javax.swing.JComboBox<String> Boxnombre;
    private javax.swing.ButtonGroup MESAS_RESTAURANTE;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JButton asignarmesa1;
    private javax.swing.JButton asignarmesa2;
    private javax.swing.JButton asignarmesa3;
    private javax.swing.JButton asignarmesa4;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnenviocorreo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JCheckBox reserva1;
    private javax.swing.JCheckBox reserva2;
    private javax.swing.JCheckBox reserva3;
    private javax.swing.JCheckBox reserva4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtasunto;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextArea txtmensaje;
    // End of variables declaration//GEN-END:variables

    private void reservaMesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
}
