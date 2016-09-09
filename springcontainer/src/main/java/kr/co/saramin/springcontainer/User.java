package kr.co.saramin.springcontainer;

import org.springframework.stereotype.Component;


@Component
public class User {

	
	private Long no;
	private String name;
	
	public User(){
		// 생성자를 기본 생성자를 따로 또 만들어줘야된다. 기본 생성자 외의 다른 생성자를 만들거면.아니면 빈이 생성이 안댐..
	}
	
	public User(Long no , String name){
		
		this.name= name;
		
	}
	
	
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

 
	
	
}
