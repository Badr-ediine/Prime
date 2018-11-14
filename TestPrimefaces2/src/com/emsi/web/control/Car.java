package com.emsi.web.control;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7025486226371866939L;
	private String ref;
	private String name;

	public Car(String ref, String name) {
		super();
		this.ref = ref;
		this.name = name;
	}

	public String getRef() {
		return ref;
	}

	public String getName() {
		return name;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public void setName(String name) {
		this.name = name;
	}

}
