package com.topica.btvn3;

import java.lang.reflect.Field;

public class NeedChange {
	private static final String CONSTANT = "You can not change me!";

	private static final Integer NOT_SO_CONSTANT = 10;

	public static String getConstant() {
		return CONSTANT;
	}


	public static String getConstantReflection() {
		try {
			final Field fld = NeedChange.class.getDeclaredField("CONSTANT");
			return (String) fld.get(null);
		} catch (NoSuchFieldException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}
	}

	public static int getNotSoConstant() {
		return NOT_SO_CONSTANT;
	}

}
