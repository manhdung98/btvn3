package com.topica.btvn3;

import java.lang.reflect.Field;

enum Change{
	
}

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Human human = new Human();
		MyAnnotation.Annotation(human);
		
		Field field = NeedChange.class.getDeclaredField( "CONSTANT" );
		ChangeValue.changeString(field,  "You was changed" );
		
		Field field1 = NeedChange.class.getDeclaredField( "NOT_SO_CONSTANT" );
		ChangeValue.changeInteger(field1, -20);
		
		
	}

}
