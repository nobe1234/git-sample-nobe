package jp.co.sample.form;

import java.util.List;

public class UserForm {

	private Integer id;
	private String name;
	private String mail;
	private List<Integer> hobbyList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Integer> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<Integer> hobbyList) {
		this.hobbyList = hobbyList;
	}

	@Override
	public String toString() {
		return "UserForm [id=" + id + ", name=" + name + ", mail=" + mail + ", hobbyList=" + hobbyList + "]";
	}
	
}
