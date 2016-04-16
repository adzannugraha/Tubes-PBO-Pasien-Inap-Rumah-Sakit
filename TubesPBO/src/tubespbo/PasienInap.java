/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Adzan
 */
public class PasienInap {
        private static int idpasieninap = 0;
	private Pasien pasien;
	private Dokter dokter;
	private String[] diagnosa = new String[5];
	private int jumlahdiagnosa;
	
	public PasienInap (Pasien pasien, Dokter dokter)
	{
		this.pasien = pasien;
		this.dokter = dokter;
                this.idpasieninap++;
	}
	
	public void addDiagnosa(String gejala)
	{
		diagnosa[jumlahdiagnosa] = gejala;
		jumlahdiagnosa++;
	}
	
	public String getDiagnosa(int n)
	{
		return diagnosa[n];
	}
	
	public void deleteDiagnosa(int n)
	{
		diagnosa[n] = null;
		jumlahdiagnosa--;
	}
	
	public void setPasien(Pasien pasien)
	{
		this.pasien = pasien;
	}
	
	public Pasien getPasien()
	{
		return pasien;
	}
	
	public void setDokter(Dokter dokter)
	{
		this.dokter = dokter;
	}
	
	public Dokter getDokter()
	{
		return dokter;
	}
	
	public int getJumlahDiagnosa()
	{
		return jumlahdiagnosa;
	}

        public int getIdpasieninap() {
            return idpasieninap;
        }

        public void setIdpasieninap(int idpasieninap) {
            this.idpasieninap = idpasieninap;
        }
        
        
}
