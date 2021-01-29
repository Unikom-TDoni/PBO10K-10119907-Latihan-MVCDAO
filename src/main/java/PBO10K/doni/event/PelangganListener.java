/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.doni.event;

import PBO10K.doni.entity.Pelanggan;
import PBO10K.doni.model.PelangganModel;

/**
 * @author 
 * 
 * Nama : T DONI
 * NIM : 10119907
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public interface PelangganListener {
     public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
}
