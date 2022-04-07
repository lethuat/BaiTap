import java.util.Scanner;
public class NhanVien {
	private String ten;
	private String tuoi;
	private String diachi;
	private double luong;
	private int tongsogiolam;
	private int tinhThuong;
	public int getTinhThuong() {
		return tinhThuong;
	}
	public void setTinhThuong(int tinhThuong) {
		this.tinhThuong = tinhThuong;
	}
	NhanVien(){
		ten= "Lê Văn Thuật ";
		tuoi = "25";
		diachi = " Hà Nội ";
		luong = 1000000;
		tongsogiolam = 200;
		
	}
	public NhanVien(String ten, String tuoi, String diachi,double luong,int tongsogiolam ) {
		 this.ten = ten;
		 this.tuoi = tuoi;
		 this.diachi = diachi;
		 this.tongsogiolam =tongsogiolam;
		
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public int getTongsogiolam() {
		return tongsogiolam;
	}
	public void setTongsogiolam(int tongsogiolam) {
		this.tongsogiolam = tongsogiolam;
	}
	void inputInfo () {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Tên Nhân Viên : ");
		ten = sc.nextLine();
		System.out.println("Tuổi Nhân Viên : ");
		tuoi = sc.nextLine();
		System.out.println("Địa Chỉ Nhân Viên : ");
		diachi= sc.nextLine();
		System.out.println("Lương Nhân Viên : ");
		luong = sc.nextDouble();
		System.out.println("Tổng Giờ Làm của Nhân Viên : ");
		tongsogiolam = sc.nextInt();
	}
	void printInfo () {
		System.out.println("Thông tin chi tiết nhân viên :");
		System.out.println("Tên nhân viên : "+ten);
		System.out.println("Tuổi nhân viên : "+tuoi);
		System.out.println("Địa chỉ nhân viên : "+diachi);
		System.out.println("Lương nhân nhân viên : "+luong);
		System.out.println("Tổng giờ làm nhân viên : "+tongsogiolam);
		System.out.println("Thưởng nhân viên  : "+tinhThuong);
		System.out.println("Tông Lương: " +(luong+tinhThuong));
	}
	double tinhThuong() {
		double thuong;
		if(tongsogiolam >= 200)
			thuong = luong*0.2;
		else if (tongsogiolam>=100 && tongsogiolam <200)
			thuong = luong *0.1;
		else
			thuong = 0;
		return thuong;
	}
}