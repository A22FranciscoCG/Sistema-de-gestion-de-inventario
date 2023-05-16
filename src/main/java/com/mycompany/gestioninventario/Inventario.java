/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.gestioninventario;

import java.util.ArrayList;
/**
 *
 * @author Fatima Martinez
 * @date 16/05/2023
 * @time 16:33:52
 */
public class Inventario {
    private String codigo;
    private int cantidad;
    private int stock;

//    public ArrayList<String> getCodigo(){
//        ArrayList<String> cod = new ArrayList<>();
//        for (String string : cod) {
//            
//        }
//    }
    
    ArrayList<Producto> listaProductos = new ArrayList<>();
    
    public void agregarProductos(Producto objProductos){
        listaProductos.add(objProductos);
    }
    
    public String listarInventario(){
        for(Producto productos : listaProductos){
            return "Nombre: " + productos.getNombre() + "; " 
                    + "Cantidad restante: " + productos.getStock();
        }
        return null;
    }
    
    public void venderProducto(Producto objProducto){
        if (objProducto.getStock() == 0){
            listaProductos.remove(objProducto);
        }
    }
    
    
    
}
