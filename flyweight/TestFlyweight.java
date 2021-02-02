package flyweight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestFlyweight {

	public static void main(String[] args) throws IOException {
		
		Map<String, Shape> shapeMap = new HashMap<String,Shape>();
		
		System.out.println("Enter Shape among Rectange, Circle, Square");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String shapeType = reader.readLine().toLowerCase();
		String next = "y";
		
		while(next.equalsIgnoreCase("y")) {
			
			if(shapeMap.containsKey(shapeType)) {
				Shape shape = shapeMap.get(shapeType);
				System.out.println(shapeType+" "+ shape);
				shape.draw();
			}else {
				if(shapeType.contains("rectangle")) {
					Shape shape = new Rectangle();
					shapeMap.put(shapeType, shape);
					System.out.println(shapeType+" "+ shape);
					shape.draw();
					
				}else if(shapeType.contains("circle")) {
					Shape shape = new Circle();
					shapeMap.put(shapeType, shape);
					System.out.println(shapeType+" "+ shape);
					shape.draw();
					
				}else if(shapeType.contains("square")) {
					Shape shape = new Square();
					shapeMap.put(shapeType, shape);
					System.out.println(shapeType+" "+ shape);
					shape.draw();
					
				}else {
					System.out.println("Invalid shape Entered");
				}
			}
			
			System.out.println("Enter y to continue");
			next = reader.readLine();
			System.out.println("Enter Shape among Rectange, Circle, Square");
			shapeType = reader.readLine().toLowerCase();
		}
		

	}

}
