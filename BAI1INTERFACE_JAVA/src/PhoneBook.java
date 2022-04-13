import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
	ArrayList<String> PhoneList  = new ArrayList<>();
	@Override
	void insertPhone(String name, String phone) {
		if(PhoneList.isEmpty()) {
			PhoneList.add(name+ ", "+phone);
		}else {
			String pb = searchPhone(name);
			if(pb!=null) {
				if(!pb.contains(phone)) {
					PhoneList.set(PhoneList.indexOf(pb),pb + " : " + phone);
				}
			}else {
				PhoneList.add(name+ ", "+phone); 
			}
			
			
				
		}
		
	}

	@Override
	void removePhone(String name) {
		if(PhoneList.isEmpty()) {
			System.out.println("Danh bạn Trống");
		}else {
			String pb = searchPhone(name);
				if(pb!=null) {
					PhoneList.remove(pb);
					System.out.println("Đã xóa người dùng " + name  + " kèm các số điện thoại khỏi danh bạ ");
				}else {
					System.out.println("không tìm thấy người dùng " +name + "trong danh bạn ");
				}
				
				
			
		}
		
	}

	@Override
	void updatePhone(String name, String newphone) {
		if(PhoneList.isEmpty()) {
			System.out.println("Danh bạ trống ");
		}else {
			String pb = searchPhone(name);
			if(pb!=null) {
				if(!pb.contains(newphone)) {
					PhoneList.set(PhoneList.indexOf(pb), pb.split(",")[0]+","+newphone);
				}
			}else {
				System.out.println("không tìm thấy người dùng " +name + "trong danh bạ để update ");
			}
		}
		
	}

	@Override
	String searchPhone(String name) {
		for(String pb : PhoneList) {
			if(pb.split( ", ")[0].equals(name)) {
				return pb;
			}
		}
		return null;
		
	}

	@Override
	void sort() {
		if(PhoneList.isEmpty()) {
			System.out.println("Danh bạ trống ");
		}else {
			 System.out.println("Sắp xếp tăng dần");
			Collections.sort(PhoneList, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			System.out.println(PhoneList);
			System.out.println("sắp xếp giảm dần :");
			Collections.sort(PhoneList, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}
			});
			System.out.println(PhoneList);
			}
			
		}
		
	}


