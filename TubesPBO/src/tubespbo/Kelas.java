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
public class Kelas {
    	private String namaKelas;
        private int noKelas;
	
	public Kelas (String nmkls,int noKelas)
	{
		this.namaKelas = nmkls;
                this.noKelas = noKelas;
	}
	
	public void setNamaKelas(String namaKelas) {
		this.namaKelas=namaKelas;
	}
	
	public String getNamaKelas() {
		return namaKelas;
	}

        public int getNoKelas() {
            return noKelas;
        }

        public void setNoKelas(int noKelas) {
            this.noKelas = noKelas;
        }
        
        
}
