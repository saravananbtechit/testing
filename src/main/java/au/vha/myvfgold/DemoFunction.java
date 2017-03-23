package au.vha.myvfgold;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DemoFunction implements RequestHandler<String,String> {

	public String handleRequest(String arg0, Context arg1) {
		
		return "Sample lambda....Cooller..You are in a right path..just it.";
	}
// 966779 - IT for clear space
}
