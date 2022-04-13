
public  class News implements INews{
	String publicsDate, author, content;
	String title;
	int id;
	float avergeRate;
	private int[] RateList;
	public News() {
		id = 1;
		title = "News";
		publicsDate = "2022-04-10";
		author = "Lê Văn Thuật ";
		content ="Làm Bài Tập";
		avergeRate = 4.5f;
	}
	public News (String publicsDate,String author , String content,String title,float avergeRate, int[] rateList) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.avergeRate = avergeRate;
		RateList = rateList;
		
	}
	public String getPublicsDate() {
		return publicsDate;
	}
	public void setPublicsDate(String publicsDate) {
		this.publicsDate = publicsDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAvergeRate() {
		return avergeRate;
	}
	public void setAvergeRate(float avergeRate) {
		this.avergeRate = avergeRate;
	}
	public int[] getRateList() {
		return RateList;
	}
	public void setRateList(int[] rateList) {
		RateList = rateList;
	}
	@Override
	public void Display() {
		System.out.println("Title :" + title);
		System.out.println("Publish date :" + publicsDate);
		System.out.println("Author :" + author);
		System.out.println("COntent:" + content);
		System.out.println("Average rate: " + avergeRate);
		
	}
	int[] ReteList = new int [3];
	void calculate() {
		 avergeRate = (float) (RateList[0] + ReteList[1] + ReteList[2] / ReteList.length);
	}
}
