package DTO;

public class LoaiXe {
	private String maLoai;
	private String tenLoai;
	
	public LoaiXe(String maLoai, String tenLoai) {
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}
	public LoaiXe() {
		
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	@Override
	public String toString() {
		return "LoaiXe [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
}
