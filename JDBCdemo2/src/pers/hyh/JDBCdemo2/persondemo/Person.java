package pers.hyh.JDBCdemo2.persondemo;

class Person {
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	private int Id;
	private String name;
	private int Age;
	public Person(int id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		Age = age;
	}
}
