/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.doni.main;

import PBO10K.doni.database.BarbershopDatabase;
import PBO10K.doni.entity.Pelanggan;
import PBO10K.doni.error.PelangganException;
import PBO10K.doni.service.PelangganDao;
import PBO10K.doni.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;


/**
 * @author 
 * 
 * Nama : T DONI
 * NIM : 10119907
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                //pelanggan.loadDatabase();
                pelanggan.setVisible(true);
            }        
        });
    }
}
