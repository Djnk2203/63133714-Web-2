package Model;

public class Diem {
	 private String ma;
	 private String ten;
	 private int diemTichLuy;
	  // Constructor
	    public Diem(String ma, String ten, int diemTichLuy) {
	        this.ma = ma;
	        this.ten = ten;
	        this.diemTichLuy = diemTichLuy;
	    }

	    
	    public String getMa() {
	        return ma;
	    }

	    public void setMa(String ma) {
	        this.ma = ma;
	    }

	   
	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	  
	    public int getDiemTichLuy() {
	        return diemTichLuy;
	    }

	    public void setDiemTichLuy(int diemTichLuy) {
	        this.diemTichLuy = diemTichLuy;
	    }   
}
