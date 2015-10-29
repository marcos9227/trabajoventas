/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import BaseDatos.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author FAMILIA RIVAS MAZA
 */
public class Eliminar {
    public void eliminarProdcuto(String cod) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM producto WHERE idProducto = '"+cod+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Borrado");
        Conexion.Desconectar();
    }
    
}
