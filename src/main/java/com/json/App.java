package com.json;

import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.Person;
import com.json.model.User;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	ObjectMapper map= new ObjectMapper();
    	
    	Person p = map.readValue(new File("info/person.json"), Person.class);
    	System.out.println(p.getId() + " " + p.getName());
    	System.out.println(p.getAge() + " " + p.getPhones().getPh1() + " " + p.getPhones().getCode());
    }
}
