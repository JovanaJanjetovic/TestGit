package jwd.wafepa.model;

public class Activity {
	
	private Long id;
	private String name;
	private String something;
	private boolean active;

	// 12
	public Activity(Long id, String name, String something, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.something = something;
		this.active = active;
	}

	// 13
	public Activity(String name, String something, boolean active) {
		super();
		this.name = name;
		this.something = something;
		this.active = active;
	}

	//14
	public Activity(Long id) {
		super();
		this.id = id;
		
	}


	//17
	public Activity(boolean active, Long id) {
		this.active = active;
		this.id = id;

	}

	//16
	public Activity(String something, String name) {
		super();
		this.something = something;
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
		//3333
		//4444
		//5555
		//66666
		//7777
		//8888
		//9999
		//10
		//11

	}
	
	public Activity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}
	
	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	

}
