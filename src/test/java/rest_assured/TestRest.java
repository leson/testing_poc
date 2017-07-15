package rest_assured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

import io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRest {

	@BeforeMethod
	public void before() {
		RestAssured.baseURI = "https://api.github.com";
		RestAssured.port = 443;
		RestAssured.basePath = "/users";
	}

	@Test
	public void TestJsonSchema() {
		// get("/products").then().assertThat().body(
		// matchesJsonSchemaInClasspath("products-schema.json").using(settings().with().checkedValidation(false)));
	}

	@Test
	public void TestValue() {
		given().when().get("/leson").then().body("login", Matchers.equalTo("leso"));

		Response res = RestAssured.get("/leson");
		System.out.println(res.asString());
	}

	@Test
	public void TestOther() {
		System.out.println("hello");
	}

}
