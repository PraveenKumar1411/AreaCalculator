package com.wipro.springboot.assignments.Controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot.assignments.Shape.Circle;
import com.wipro.springboot.assignments.Shape.Rectangle;
import com.wipro.springboot.assignments.Shape.Shape;
import com.wipro.springboot.assignments.Shape.Square;



@RestController
public class ShapeController {
	
	Shape s;

	@RequestMapping("/calculate")
	@ResponseBody
	public List<Object> calculateAreaAndPerimeter(@RequestBody  Map<String, String> requestObject){
		String shape = requestObject.get("shape");
		
		List<Object> l = new ArrayList<>();

		
		switch(shape) {
		
		case "Circle":
			 s = new Circle(Double.valueOf(requestObject.get("radius")));
			 break;
			 
		case "Rectangle":
			 s = new Rectangle(Double.valueOf(requestObject.get("length")), Double.valueOf(requestObject.get("width")));
			 break;
		
		case "Square":
		 s = new Square(Double.valueOf(requestObject.get("length")));
		 break;
		}
		
		 l.add(s.calculateArea());
		 l.add(s.calculatePerimeter());
		 
		 
		 return l;
		
	}
}
