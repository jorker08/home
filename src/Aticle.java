

public class Aticle {
	private int id;
	private String title;
	private String body;
	private String nickName;
	private String regDay;
	private int hit;
	
	public Aticle() {
		
	}
	
	public Aticle(int id, String title, String body, String nickName, String regDay){
		this.id = id;
		this.title = title;
		this.body = body;
		this.nickName = nickName;
		this.regDay = regDay;
	}
	
	
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegDay() {
		return regDay;
	}

	public void setRegDay(String regDay) {
		this.regDay = regDay;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
	
	
}
