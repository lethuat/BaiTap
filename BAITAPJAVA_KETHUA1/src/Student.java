import java.util.Scanner;
public class Student extends Person{
    String ID;
    float Avr;
    String Email;

    public Student() {
        
    }

    public Student(String ID, float Avr, String Email) {
        this.ID = ID;
        this.Avr = Avr;
        this.Email = Email;
    }

    public Student(String ID, float Avr, String Email, String Name, String Gender, String dob, String add) {
        super(Name, Gender, dob, add);
        this.ID = ID;
        this.Avr = Avr;
        this.Email = Email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getAvr() {
        return Avr;
    }

    public void setAvr(float Avr) {
        this.Avr = Avr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public int LengthCheck(){
        if(ID.length()!=8){
            System.err.println("ID phai chua 8 ky tu");
            return 0;
        }
        return 1;
    }
    
    public int DtbCheck(){
        if(Avr<0 || Avr>10){
            System.err.println("Điểm trung bình: từ 0.0 – 10.0");
            return 0;
        }
        return 1;
    }
    
    public int EmailCheck(){
        String reg = "^[a-zA-z0-9+]+@[a-z]+.[a-z]+$";
        if(Pattern.matches(reg, Email) == false){
            System.err.println("phải chứa kí tự @ và không tồn tại khoảng trắng");
            return 0;
        }
        return 1;
    }
    
    public void Scholar(){
        if(Avr>8){
            System.out.println("Hoc sinh duoc nhan hoc bong");
        }else{
            System.out.println("Hoc sinh khong duoc nhan hoc bong");
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Nhap vao ID: ");
            ID =  input.nextLine();
        }while(LengthCheck()==0);
        do{
            System.out.print("Nhap vao Diem trung binh: ");
            Avr =  Float.parseFloat(input.nextLine());
        }while(DtbCheck()==0);
        do{
            System.out.print("Nhap vao Email: ");
            Email =  input.nextLine();
        }while(EmailCheck()==0);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ID la: "+ID);
        System.out.println("Diem trung binh la: "+Avr);
        System.out.println("Email la: "+Email);
        Scholar();
    }
}