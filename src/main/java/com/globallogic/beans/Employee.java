package com.globallogic.beans;

import java.util.List;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<Integer> list;
	private Set<Integer> set;
	public Employee() {
	}
	public Employee(int id, String name, List<Integer> list, Set<Integer> set) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.set = set;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public Set<Integer> getSet() {
		return set;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + "]";
	}
	
}
