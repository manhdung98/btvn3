package com.topica.btvn3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChangeValue {
	public static void changeString(Field field, Object newValue)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		field.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(null, newValue);

		System.out.println(NeedChange.getConstantReflection());
	}

	public static void changeInteger(Field field, Object newValue)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		field.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(null, newValue);

		System.out.println(NeedChange.getNotSoConstant());
	}
}
