package rest_assured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRest {
	String pathToSchemaInClasspath = "";

	@BeforeMethod
	public void before() {
		RestAssured.baseURI = "https://api.github.com";
		RestAssured.port = 443;
		RestAssured.basePath = "/users";
		pathToSchemaInClasspath = "jsonschema/githubapi_users_leson.json";
	}

	@Test
	public void TestJsonSchema() {
		System.out.println(pathToSchemaInClasspath);
		given().when().get("/leson").then().assertThat().body(matchesJsonSchemaInClasspath(pathToSchemaInClasspath));
	}

	@Test
	public void TestValue() {
		given().when().get("/leson").then().body("login", equalTo("leso"));

		Response res = RestAssured.get("/leson");
		System.out.println(res.asString());
	}

	@Test
	public void TestOther() {
		System.out.println("hello world");
	}

}
