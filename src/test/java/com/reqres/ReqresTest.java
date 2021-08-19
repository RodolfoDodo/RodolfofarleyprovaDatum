package com.reqres;

import config.Settings;
import factory.UsersDataFactory;
import io.restassured.http.ContentType;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Before;
import org.junit.Test;
import pojo.Users;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ReqresTest {

    @Before
    public void setup(){
        Settings settings = ConfigFactory.create(Settings.class);

        baseURI = settings.baseURI();
    }

    @Test
    public void registerSuccessful() throws IOException {
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
    public void creat() throws IOException {
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
    //usei before
    //templates de Requisições usando DataBinding
    //Usando o Owner para segregar as propriedades
    @Test
    public void update() throws IOException {
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
