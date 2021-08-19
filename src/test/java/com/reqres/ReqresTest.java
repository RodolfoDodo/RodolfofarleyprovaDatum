package com.reqres;

import factory.UsersDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.Users;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ReqresTest {

    @Test
    public void registerSuccessful(){
        baseURI = "https://reqres.in";

        Users usersRegister = UsersDataFactory.registerUsers();

        given()
            .contentType(ContentType.JSON)
            .body(usersRegister)
        .when()
            .post("/api/register")
        .then()
            .log()
            .all();
    }

    @Test
    public void creat(){
        baseURI = "https://reqres.in";

        Users usersCreat = UsersDataFactory.creatUsers();

        given()
            .contentType(ContentType.JSON)
            .body(usersCreat)
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

        Users updateUsers = UsersDataFactory.updateUsers();

        given()
            .contentType(ContentType.JSON)
            .body(updateUsers)
        .when()
            .post("/api/users/2")
        .then()
            .log()
            .all()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo("Rodolfo Farley"))
                .body("job",  equalToIgnoringCase("futuro qa na datum no cliente Getnet."));
    }
}
