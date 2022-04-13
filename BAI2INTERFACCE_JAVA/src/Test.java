import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static void menu() {
		System.out.println("1. Insert news");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
	}
	static void inputNews(News news) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập title  :");
		news.title = scanner.nextLine();
		System.out.println("Nhập publish date   :");
		news.publicsDate = scanner.nextLine();
		System.out.println("Nhập author  :");
		news.author = scanner.nextLine();
		System.out.println("Nhập content  :");
		news.content = scanner.nextLine();
		System.out.println(" Nhập các đánh giá :");
		for (int i = 0; i <news.ReteList.length;  i++) {
			do {
				System.out.format("Đánh giá %d", i +1);
				news.ReteList[i] = scanner.nextInt();
			}while(!(1 <= news.ReteList[i]) && news.ReteList[i] <=5);
		}
		
	}
	public static void main(String[] args) {
	  int option;
		Scanner scanner = new Scanner(System.in);
		ArrayList<News> NewsList = new ArrayList<>();
		menu();
		while (true) {
			while(true) {
				try {
					System.out.println("mời bạn nhập một lựa chọn : ");
					option = scanner.nextInt();
					break;
				} catch (Exception ex) {
					System.out.println("lựa chọn của bạn phải là số nguyên ");
				}
			}
			switch (option){
			case 1:
				News news = new News();
				inputNews(news);
				news.id =NewsList.size() +1;
				NewsList.add(news);
				System.out.println("có thêm thông tin mã là " +news.id + "vào danh sách");
				break;
			case 2:
				System.out.println("Danh sacsg tin :");
				for (News news1 : NewsList) {
					news1.Display();
				}
				break;
			case 3:
				System.out.println("Danh sách tin sau khi tính trung bình là : ");
				for (News news1 : NewsList) {
					news1.calculate();
					news1.Display();
				}
				break;
			case 4:
				return;
				}
		}
	}
}
