package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class UniqueIDPerPostTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @Test
    public void testUniqueIds() {
        // Send a GET request to the API endpoint
        Response response = given()
                .when()
                .get("/posts")
                .then()
                .extract()
                .response();

        // Verify that the response is 200 OK
        assertEquals(response.getStatusCode(), 200);

        // Parse the JSON response using JsonPath
        JsonPath jsonPath = response.jsonPath();

        // Extract the list of post IDs
        List<Integer> postIds = jsonPath.getList("id");

        // Verify that each blog post has a unique id
        for (int i = 0; i < postIds.size(); i++) {
            for (int j = i + 1; j < postIds.size(); j++) {
                assertNotEquals(postIds.get(i), postIds.get(j), "Duplicate IDs found");
            }
        }
    }
}
