package com.jackson.parsing;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;

public class StreamingAPIApproach {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		//Using Streaming api approach	
		JsonFactory jFactory = new JsonFactory();
		JsonParser jParser = jFactory.createParser(new File("D:\\eclipseqaworkspace\\jackson-parsing\\src\\test\\resources\\user.json"));
		while(jParser.nextToken()!=JsonToken.END_OBJECT){
			String fieldName = jParser.getCurrentName();
			//if(fieldName.equals("name")){ ==> Not working cz looping time fieldName might be null and trying to perform equal on null
			if("first".equals(fieldName)){
				jParser.nextToken();
				System.out.println(jParser.getText());
			}
		}

	}

}
