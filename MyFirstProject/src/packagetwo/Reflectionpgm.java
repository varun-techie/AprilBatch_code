package packagetwo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflectionpgm {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		
		String operation="add";
		int x=70;
		int y=20;
		
		
		
		Operation op = new Operation();
		
		Method m=op.getClass().getMethod(operation, int.class, int.class);
		m.invoke(op, x,y);
		
		
		
		
		
		if(op.equals("add")) {
			
			//op.add(x, y);
		}else if(op.equals("add")) {
			
			op.add(x, y);
		}
		
		
	}

}
