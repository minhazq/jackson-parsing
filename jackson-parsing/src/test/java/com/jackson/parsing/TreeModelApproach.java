package com.jackson.parsing;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelApproach {

	public static void main(String[] args) throws JsonProcessingException, IOException {

		//Using Tree Model approach
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(new File("D:\\eclipseqaworkspace\\jackson-parsing02\\src\\test\\resources\\productsearch.json"));
		//String firstName = rootNode.path("name").path("first").asText();
		//System.out.println(firstName);

		/*
		//giving me the first object/element
		Iterator<JsonNode> it = rootNode.elements();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/


		//Giving me only tag or field name of the first element. It will not give me the child or descendent element.
		//In this case it is returning one field which is response. If you want all desired nodes then use findparents.
		/*Iterator<String> fieldsit = rootNode.fieldNames();
		while(fieldsit.hasNext()){
			System.out.println(fieldsit.next());
		}*/

		//giving me the all the nodes which has imageId. 
		List<JsonNode> listOfNodes = rootNode.findParents("imageId");
		System.out.println(listOfNodes.size());
		for(JsonNode n : listOfNodes){
				System.out.println(n.findValue("imageId").asText());
			}
			
		}



		




		// Third approach is data-binding , meaning convert the json object to a Class 
		// Not worth it that much in Testing world.
	}

}
