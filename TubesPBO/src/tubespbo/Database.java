/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Adzan
 */
public class Database {
    KoneksiDB db;
    
    public Database(){
        db = new KoneksiDB();
        db.koneksi();
    }
    
    public void insertDokter(String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis) {
        String sql = "INSERT INTO `dokter`(`NAMA`, `UMUR`, `JENISKELAMIN`, `ALAMAT`, `NOSIP`, `SPESIALIS`) VALUES ('"+nama+"','"+umur+"','"+jenisKelamin+"','"+alamat+"','"+noSip+"','"+spesialis+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }

    public void insertPasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah) {
        String sql = "INSERT INTO PASIEN VALUES ('" + nama + "','" + umur + "','" + jenisKelamin + "','" + alamat
                + "','" + idPasien + "','" + tglDaftar + "','" + golDarah + "')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }

    public void insertKelas(String nmkls, int noKelas) {
        String sql = "INSERT INTO `kelas`(`NAMA`, `NOKELAS`) VALUES ('"+nmkls+"','"+noKelas+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }

    public void insertRuangan(int nokam, String nmkel, int jmlpasien) {
        String sql = "INSERT INTO `ruangan`(`NAMAKELAS`, `NOKAMAR`, `JUMLAHPASIEN`) VALUES ('"+nmkel+"','"+nokam+"','"+jmlpasien+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void insertPasienInap(int idpasien, int nosip, int idpasieninap, int jumlahdiagnosa) {
        String sql = "INSERT INTO `pasieninap`(`IDPASIEN`, `NOSIP`, `IDPASIENINAP`, `JUMLAHDIAGNOSA`) VALUES ('"+idpasien+"','"+nosip+"','"+idpasieninap+"','"+jumlahdiagnosa+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }

    public void editDokter(String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis) {
        String sql = "UPDATE DOKTER SET "
                + "NAMA='" + nama
                + "',UMUR=" + umur
                + ",JENISKELAMIN='" + jenisKelamin
                + "',ALAMAT='" + alamat
                + "',NOSIP=" + noSip
                + ",SPESIALIS='" + spesialis
                + "' WHERE NOSIP =" +  noSip;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void editPasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah) {
        String sql = "UPDATE PASIEN SET "
                + "NAMA='" + nama
                + "',UMUR=" + umur
                + ",JENISKELAMIN='" + jenisKelamin
                + "',ALAMAT='" + alamat
                + "',IDPASIEN=" + idPasien
                + ",TGLDAFTAR='" + tglDaftar
                + "',GOLDARAH='" + golDarah
                + "' WHERE IDPASIEN =" + idPasien;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void editKelas(String nmkls, int noKelas) {
        String sql = "UPDATE KELAS SET "
                + "NAMA='" + nmkls
                + "',NOKELAS=" + noKelas
                + " WHERE NOKELAS =" + noKelas;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void editRuangan(String nmkel, int nokam, int idpasieninap1, int idpasieninap2,int idpasieninap3,int idpasieninap4) {
        String sql = "UPDATE RUANGAN SET "
                + "NAMAKELAS='" + nmkel
                + "',NOKAMAR=" + nokam
                + ",IDPASIENINAP1=" + idpasieninap1
                + ",IDPASIENINAP2=" + idpasieninap2
                + ",IDPASIENINAP3=" + idpasieninap3
                + ",IDPASIENINAP4=" + idpasieninap4
                + " WHERE NOKAMAR =" + nokam;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void editPasienInap(int idpasien, int nosip, int idpasieninap, int jumlahdiagnosa, String diagnosa1, String diagnosa2, String diagnosa3, String diagnosa4, String diagnosa5) {
        String sql = "UPDATE PASIENINAP SET "
                + "IDPASIEN='" + idpasien
                + "',NOSIP='" + nosip
                + "',IDPASIENINAP=" + idpasieninap
                + ",DIAGNOSA1='" + diagnosa1
                + "',DIAGNOSA2='" + diagnosa2
                + "',DIAGNOSA3='" + diagnosa3
                + "',DIAGNOSA4='" + diagnosa4
                + "',DIAGNOSA5='" + diagnosa5
                + "' WHERE IDPASIENINAP =" + idpasieninap;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void DeleteDokter(int noSip){
        String sql = "DELETE FROM `dokter` WHERE NOSIP ="+noSip;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void DeletePasien(int idpasien){
        String sql = "DELETE FROM `pasien` WHERE IDPASIEN ="+idpasien;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void DeleteKelas(int nokelas){
        String sql = "DELETE FROM `kelas` WHERE NOKELAS ="+nokelas;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void DeleteRuangan(int nokamar){
        String sql = "DELETE FROM `ruangan` WHERE NOKAMAR ="+nokamar;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
     
    public void DeletePasienInap(int noidpasieninap){
        String sql = "DELETE FROM `pasieninap` WHERE IDPASIENINAP="+noidpasieninap;
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public ArrayList<Pasien> SelectPasien(int idpasien) throws SQLException{
        ArrayList<Pasien> pasien = new ArrayList<>();
        String sql = "SELECT * FROM PASIEN WHERE IDPASIEN = "+idpasien;
        ResultSet rs = db.ambilData(sql);
        System.out.println(rs.toString());
        while(rs.next()){
            System.out.println(rs.getString(1));
            pasien.add(new Pasien(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
        }
        return pasien;
    }
    
    public ArrayList<Dokter> SelectDokter(int nosip) throws SQLException{
        ArrayList<Dokter> dokter = new ArrayList<>();
        String sql = "SELECT * FROM DOKTER WHERE NOSIP = "+nosip;
        ResultSet rs = db.ambilData(sql);
        System.out.println(rs.toString());
        while(rs.next()){
            System.out.println(rs.getString(1));
            dokter.add(new Dokter(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
        }
        return dokter;
    }
}
