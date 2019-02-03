package rest;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class services {
	
	
	String url="http://services.groupkt.com/country/search?text=un";
@Test
	public void teststatuscode()//to show all the output in console
	{
		given().get(url).then().
	 statusCode(200).log().all();
		
		
	}

@Test
public void validatethefiel()//to show all the output in console
{
   RestAssured.baseURI="http://services.groupkt.com/country/search?text=un";
   RequestSpecification requests=RestAssured.given();
   
	
}




}
