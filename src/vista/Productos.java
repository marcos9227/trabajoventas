package vista;
import BaseDatos.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Productos extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    public Productos() throws Exception {
        initComponents();
        buscarProducto("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel8.setText("Buscar:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        try {
            buscarProducto(txtbuscar.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Puede Buscar "+e.getMessage());
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void tbproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductosMouseClicked
        try {
            DefaultTableModel tabla= (DefaultTableModel)VBoleta.tblBoleta.getModel();
            String campo[] = new String[6];
            int fila=tbproductos.getSelectedRow();
            int c=0,j=0;
            if(fila==-1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ningun producto");
            }else{
                String id=tbproductos.getValueAt(fila, 0).toString();
                String nombre=tbproductos.getValueAt(fila,1).toString();
                String precio=tbproductos.getValueAt(fila,2).toString();
                String stock=tbproductos.getValueAt(fila,3).toString();
                String contenido=tbproductos.getValueAt(fila,4).toString();
                String medida=tbproductos.getValueAt(fila,5).toString();
                String cantidad=JOptionPane.showInputDialog("Ingrese la cantidad");
                int ped= Integer.parseInt(cantidad);
               if(ped<=0 || cantidad.equals("")){
                   JOptionPane.showMessageDialog(null,"La cantidad tiene que ser mayor a 0");
               }else{
                   int alm=Integer.parseInt(stock);
                   if(ped>alm){
                       JOptionPane.showMessageDialog(null,"No hay en stock la cantidad que desea");
                   }else{
                       for (int i = 0; i <VBoleta.tblBoleta.getRowCount(); i++) {
                           Object com=VBoleta.tblBoleta.getValueAt(i, 0);
                           if(stock.equals(com)){
                               j=i;
                               VBoleta.tblBoleta.setValueAt(cantidad, i, 4);
                               c=c+1;
                           }
                       }
                       if(c==0){
                           campo[0]=id;
                           campo[1]=nombre;
                           campo[2]=contenido+" "+medida;
                           campo[3]=precio;
                           campo[4]=cantidad;                         
                           tabla.addRow(campo);
                           VBoleta.tblBoleta.setModel(tabla);
                       }
                   }
               }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al enviar mensaje");
        }
    }//GEN-LAST:event_tbproductosMouseClicked
public void buscarProducto(String pro)throws Exception{
            Conexion.Conectar();
            String [] titulos={"ID","NOMBRE","PRECIO","STOCK","CONTENIDO","MEDIDA","TIPO"};
            String [] datos= new String[7];
            modelo=new DefaultTableModel(null,titulos);
            String sql="select p.idProducto,p.nombreProd,p.precio,p.stock,p.Contenido,m.medida,t.tipoProd from producto p join unidadmedida m on p.idTipoProd=m.idMedida join tipoproducto t on p.idTipoProd=t.idTipoProd where CONCAT (p.nombreProd,'',p.precio) like '%"+pro+"%'";
            ResultSet rs=Conexion.Consultar(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);               
                datos[5]=rs.getString(6);                         
                datos[6]=rs.getString(7);                         
                modelo.addRow(datos);      
            }
            tbproductos.setModel(modelo);
            Conexion.Desconectar();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}