//Data Karyawan
//Perusahaan : string
//Departemen : string
//Difisi : string
//Nama Lengkap : string
//Nomor Pokok Karyawan : int
//Tempat Tanggal Lahir : string
//Alamat Rumah saat ini : string
//Alamat Rumah (sesuai KTP) : string
//Nomor NPWP : int
//Nomor Rekening Bank : int
//Nama Bank : string
//Email : string
//Telepon Rumah : int
//Telepon Seluler : int
//Agama : string
//Jenis Kelamin : string
//Umur :int
//Status Perkawinan : string
//Nomor. KTP : int
//Golongan Darah : string

public class datakaryawan {
	private int noPK, noNPWP, noRB, tlpRumah, tlpSeluler, umur, noKTP;
	private String perusahaan, departemen, difisi, namaLengkap, ttl, alamatRumah, alamatRumahKTP, namaBank, email, agama, jenisKelamin, statusPerkawinan, golDarah;	
	public datakaryawan (String perusahaan, String departemen, String difisi, String namaLengkap, int noPK, String ttl, String alamatRumah, String alamatRumahKTP, int noNPWP, int noRB, String namaBank, String email, int tlpRumah, int tlpSeluler, String agama, String jenisKelamin, int umur, String statusPerkawinan, int noKTP, String golDarah){
		this.perusahaan = perusahaan;
		this.departemen = departemen;
		this.difisi = difisi;
		this.namaLengkap = namaLengkap;
		this.noPK = noPK;
		this.ttl = ttl;
		this.alamatRumah = alamatRumah;
		this.alamatRumahKTP = alamatRumahKTP;
		this.noNPWP = noNPWP;
		this.noRB = noRB;
		this.namaBank = namaBank;
		this.email = email;
		this.tlpRumah = tlpRumah;
		this.tlpSeluler = tlpSeluler;
		this.agama = agama;
		this.jenisKelamin = jenisKelamin;
		this.umur = umur;
		this.statusPerkawinan = statusPerkawinan;
		this.noKTP = noKTP;
		this.golDarah = golDarah;
	}
		public String Perusahaan(){
			return perusahaan;
		}
		public String Departemen(){
			return departemen;
		}
		public String Difisi(){
			return difisi;
		}
		public String NamaLengkap(){
			return namaLengkap;
		}
		public int NoPK(){
			return noPK;
		}
		public String TTL(){
			return ttl;
		}
		public String AlamatRumah(){
			return alamatRumah;
		}
		public String AlamatRumahKTP(){
			return alamatRumahKTP;
		}
		public int NoNPWP(){
			return noNPWP;
		}
		public int NoRB(){
			return noRB;
		}
		public String NamaBank(){
			return namaBank;
		}
		public String Email(){
			return email;
		}
		public int TlpRumah(){
			return tlpRumah;
		}
		public int TlpSeluler(){
			return tlpSeluler;
		}
		public String Agama(){
			return agama;
		}
		public String JenisKelamin(){
			return jenisKelamin;
		}
		public int Umur(){
			return umur;
		}
		public String StatusPerkawinan(){
			return statusPerkawinan;
		}
		public int NoKTP(){
			return noKTP;
		}
		public String golDarah(){
			return golDarah;
		}
}