/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.doni.service;

import PBO10K.doni.entity.Pelanggan;
import PBO10K.doni.error.PelangganException;
import java.util.List;

/**
 * @author 
 * 
 * Nama : T DONI
 * NIM : 10119907
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public interface PelangganDao {
    public void insertPelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
