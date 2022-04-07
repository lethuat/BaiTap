import java.util.Scanner;
public class Student {
    private String masinhvien;
    private String lop;
    private float diem;
    private int tuoi;
    private int diemtrungbinh;
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin học sinh : ");
        masinhvien = scanner.next();
        diem = scanner.nextFloat();
        tuoi = scanner.nextInt();
        lop = scanner.next();
    }
    public int getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(int diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	public Student(String masinhvien,
    		float diem, int age1,String lop) {
        if(masinhvien.length()<=8) {
        	this.masinhvien = masinhvien;
        	} else  this.masinhvien = "";
        if(diem<=10.0 &&diem>=0.0)
        {  this.diem = diem;
        } else  this.diem = 0;
        if(tuoi>=18) {
        	this.tuoi = tuoi;
        } else  this.tuoi= 0;
           this.lop = lop;
    }
    public String getMasinhvien() {
		return this.masinhvien;
	}
	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
		if(masinhvien.length()<=8) {
            this.masinhvien = masinhvien;
        }
	}
	public String getLop() {
		return this.lop;
		
	}
	public void setLop(String lop) {
		if (int lop) {
     	   this.lop.charAt(0)= "A || C"
        }
	}
	public float getDiem() {
		return this.diem;
	}
	public void setDiem(float diem) {
		if(diem<=10.0 &&diem>=0.0) {
            this.diem = diem;
        }
	}
	public int getTuoi() {
		return this.tuoi;
	}
	public void setTuoi(int tuoi) {
		if(tuoi>=18) {
            this.tuoi = tuoi;
        }
	}
	public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Nhập vào lớp : ");
            lop =  input.nextLine();
        }while(diemtrungbinhCheck()==0);
        do{
            System.out.print("Nhap vao Diem trung binh: ");
            diemtrungbinh =  Float.parseFloat(input.nextLine());
        }while(diemtrungbinhCheck()==0);
        do{
            System.out.print("Nhập vào lớp : ");
            lop =  input.nextLine();
        }while(lop.charAt(0)== ("A || C");
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("nhập vào lớp: "+lop);
        System.out.println("Diem trung binh la: "+diem);
        System.out.println("nhập tuổi : "+tuoi);
        System.out.println("mã sinh viên " +masinhvien);
    }
}