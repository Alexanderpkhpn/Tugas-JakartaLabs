package TugasPertemuan5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tugas5{
	
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();
		@Test
		public void Register() {
			Faker faker = new Faker();
			String nama = faker.name().firstName();
			String nohp = faker.phoneNumber().phoneNumber();
			String gmail = (nama + "@gmail.com");
			String password = "password123";
			
			 String payload = "{\"username\":\""+nama+"\",\"password\":\""+password+"\",\"email\":\""+gmail+"\",\"phonenumber\":\""+nohp+"\"}";
			 
			 Response responseDashboard = given().spec(commonJsonSpec).body(payload).when().post("/register");

				assertEquals(responseDashboard.statusCode(), 201);
			}
		

	}
