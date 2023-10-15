package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CountingPostsForUserTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testCountPostsForUser5() {
        given()
                .queryParam("userId", 5)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("userId", everyItem(equalTo(5)))
                .body("id", hasSize(10));
    }

    @Test
    public void testCountPostsForUser7() {
        given()
                .queryParam("userId", 7)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("userId", everyItem(equalTo(7)))
                .body("id", hasSize(10));
    }

    @Test
    public void testCountPostsForUser9() {
        given()
                .queryParam("userId", 9)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("userId", everyItem(equalTo(9)))
                .body("id", hasSize(10));


    }
}