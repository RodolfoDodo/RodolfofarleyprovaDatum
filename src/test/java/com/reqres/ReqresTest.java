package com.reqres;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ReqresTest {

    @Test
    public void registerSuccessful(){
        baseURI = "https://reqres.in";

        given()
            .contentType(ContentType.JSON)
            .body("{\n" +
                    "    \"email\": \"rachel.howell@reqres.in\",\n" +
                    "    \"password\": \"pistol\"\n" +
                    "}")
        .when()
            .post("/api/register")
        .then()
            .log()
                .all();
    }

    @Test
    public void creat(){
        baseURI = "https://reqres.in";

        given()
            .contentType(ContentType.JSON)
            .body("{\n" +
                        "    \"name\": \"Rodolfo Farley\",\n" +
                        "    \"job\": \"Analista de Teste\"\n" +
                        "}")
        .when()
            .post("/api/users")
        .then()
            .log()
            .all();
    }

    //validando o body e o statuscode
    // validando os nomes ignoreCase
    @Test
    public void update(){
        baseURI = "https://reqres.in";

        given()
            .contentType(ContentType.JSON)
            .body("{\n" +
                    "    \"name\": \"Rodolfo Farley\",\n" +
                    "    \"job\": \"Analista de Teste Automatizados\"\n" +
                    "}")
        .when()
            .post("/api/users/2")
        .then()
            .log()
            .all()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo("Rodolfo Farley"))
                .body("job",  equalToIgnoringCase("analista de teste automatizados"));
    }

}
