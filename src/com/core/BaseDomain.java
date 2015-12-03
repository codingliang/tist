package com.core;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BaseDomain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038001599431276800L;

	public String toString() {//通过反射机制获得对象的每个属性名及属性值
		return ToStringBuilder.reflectionToString(this);
		//return "";
	}
}
