package org.worldline.perfectnumber.integrationtest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PerfectNumberTest {

    @Test
    public void passSevenAndCheckTheResponseIsPerfectTrue() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://localhost:8080/api/v1/perfectnumber";
        // Get the RequestSpecification of the request to be sent to the server.
        String username = "username";
        String password = "password";
        RequestSpecification httpRequest = RestAssured.given().auth()
                .preemptive()
                .basic(username, password)
                .pathParam("number", 6).basePath("/{number}");

        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }

    @Test
    public void passSevenAndCheckTheResponseIsPerfectNumberValueFalse() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://localhost:8080/api/v1/perfectnumber";
        // Get the RequestSpecification of the request to be sent to the server.
        String username = "username";
        String password = "password";
        RequestSpecification httpRequest = RestAssured.given().auth()
                .preemptive()
                .basic(username, password)
                .pathParam("number", 7).basePath("/{number}");

        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    @Test
    public void passRangeOneToThousandAndCheckTheNumberSeries() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://localhost:8080/api/v1/perfectnumber";
        // Get the RequestSpecification of the request to be sent to the server.
        String username = "username";
        String password = "password";
        RequestSpecification httpRequest = RestAssured.given().auth()
                .preemptive()
                .basic(username, password)
                .pathParams("number1", 1,"number2", 1000)
    //            .pathParam("number2", 1000)
                .basePath("/{number1}/{number2}");

        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }
}
