package com.topica.btvn3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyAnnotation {
	public static void Annotation(Object obj) {
		Class<?> c = obj.getClass();

		Field fields[] = c.getDeclaredFields();
		for (Field field : fields) {
			int mod = field.getModifiers();
			if (field.getDeclaredAnnotation(Init.class) != null) {
				System.out.println(field.getName());
			}

			if (Modifier.isFinal(mod) && Modifier.isStatic(mod)) {
				try {
					System.out.println(field.get(c));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		Method method[] = c.getDeclaredMethods();
		for (Method meth : method) {
			if (meth.getDeclaredAnnotation(Init.class) != null) {
				System.out.println(meth.getName());
			}
		}

	}
}
