/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Adzan
 */
public class Application {

    private ArrayList<Dokter> listDokter;
    private ArrayList<Pasien> listPasien;
    private ArrayList<Kelas> listKelas;
    private ArrayList<Ruangan> listRuangan;
    private Database db;

    public Application() {
        this.db = new Database();
        this.listDokter = new ArrayList<>();
        this.listPasien = new ArrayList<>();
        this.listKelas = new ArrayList<>();
        this.listRuangan = new ArrayList<>();
    }
    
    public int createDokter(String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis){
        Dokter dok = new Dokter(nama, umur, jenisKelamin, alamat, noSip, spesialis);
        listDokter.add(dok);
        db.insertDokter(nama, umur, jenisKelamin, alamat, noSip, spesialis);
        return dok.getNoSip();
    }
    
    public void editDokter(String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis){
        db.editDokter(nama, umur, jenisKelamin, alamat, noSip, spesialis);
    }
    
    public void deleteDokter(int noSip){
        db.DeleteDokter(noSip);
    }
    
    public int createPasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah){
        Pasien pas = new Pasien(nama, umur, jenisKelamin, alamat, idPasien, tglDaftar, golDarah);
        listPasien.add(pas);
        db.insertPasien(nama, umur, jenisKelamin, alamat, idPasien, tglDaftar, golDarah);
        return pas.getIdPasien();
    }
    
    public void editPasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah){
        db.editPasien(nama, umur, jenisKelamin, alamat, idPasien, tglDaftar, golDarah);
    }
    
    public void deletePasien(int idPasien){
        db.DeletePasien(idPasien);
    }
    
    public int createKelas(String nmkls,int noKelas){
        Kelas kel = new Kelas(nmkls,noKelas);
        listKelas.add(kel);
        db.insertKelas(nmkls,noKelas);
        return kel.getNoKelas();
    }
    
    public void editKelas(String nmkls,int noKelas){
        db.editKelas(nmkls,noKelas);
    }
    
    public void deleteKelas(int noKelas){
        db.DeleteKelas(noKelas);
    }
    
    public int createRuangan(int nokam, Kelas nmkel, int jmlpasien){
        Ruangan rua = new Ruangan(nokam, nmkel, jmlpasien);
        String namakel = rua.getNamaKelas().getNamaKelas();
        listRuangan.add(rua);
        db.insertRuangan(nokam, namakel, jmlpasien);
        return rua.getNoKamar();
    }
    
    public void editRuang(String nmkls,int noKelas){
        db.editKelas(nmkls,noKelas);
    }
    
    public void deleteRuang(int noKelas){
        db.DeleteKelas(noKelas);
    }

    public Dokter getDokter(int i) {
        return listDokter.get(i);
    }
    
    
    public Pasien getPasien(int k) {
        return listPasien.get(k);
    }
    
    public Kelas getKelas(int m){
        return listKelas.get(m);
    }
    
    public Ruangan getRuangan(int n){
        return listRuangan.get(n);
    }
    
    public void deleteRuangan(int r){
        listRuangan.remove(r);
    }
    
    public int banyakdokter(){
        return listDokter.size();
    }
    
    public int banyakpasien(){
        return listPasien.size();
    }
    
    public int banyakkelas(){
        return listKelas.size();
    }
    
    public int banyakruangan(){
        return listRuangan.size();
    }
}
