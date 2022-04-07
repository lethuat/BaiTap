import java.util.Scanner;

public class ManagePhoneBook {
	static void menu() {
		System.out.println(" ManagePhoneBook");
		System.out.println("1. Insert Phone");
		System.out.println("2. Remove Phone");
		System.out.println("3. Update Phone");
		System.out.println("4. Search Phone");
		System.out.println("5. Sort");
		System.out.println("6. Exit");
	}
	public static void main(String[] args) {
		menu();
		Phonebook pb = new PhoneBook();
		Scanner input = new Scannner(System.in);
		String name , phone;
		while (true) {
			System.out.println("mời bạn chọn 1 mục");
			switch (input.nextLine()) {
			case "1":
				System.out.println("mời nhập tên : ");
				String name = intput.nextLine();
				System.out.println("mời nhập số điện thoại");
				phone = input.nextLine();
				pb.insertPhone(name,phone);
				break;
			case "2":
				if(pb.PhoneList.isEmpty()) {
					System.out.println("Danh bạ trống");
					break;
				}
				
			case "3":
				if(pb.PhoneList.isEmpty()) {
					System.out.println("Danh bạ trống");
					break;
				}
				break;
			case"4":
				System.out.println("mời nhập tên người dùng muốn tìm : ");
				name = input.nextLine();
				String result = pb.searchPhone(name);
				if(result == null) {
					System.out.println("không tìm thấy người dùng có tên :" +name);
				}else {
					System.out.println("kết quả :" +result);
				}
				break;
			case"5";
			 if(pb.PhoneList.isEmpty()) {
			 	System.out.println("Danh bạ trống");
				break;
			}
			case "6" :return;
			}
		}
		PhoneBook pb = new PhoneBook();
		pb.insertPhone( "ABC", "0363397253");
		pb.insertPhone("Thuat", "0363533553");
		pb.insertPhone("DEF", "0363539853");
		pb.updatePhone("ABC", "4243536262");
	    for(String pl : pb.PhoneList) {
	    	System.out.println(pl);
	    }
		}
		
	}
}
