package jwd.wafepa.model;

public class Activity {
	
	private Long id;
	private String name;
	
	public Activity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Activity() {
		super();
	}

	
	//111111111111
	//blalalalalala
	
	public Activity(String name) {
		super();
		this.name = name;
		this.name = name + "1";
		//4444
		//5555
		//6666
		//8888
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
