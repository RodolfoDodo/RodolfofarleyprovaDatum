package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsersDataFactory {

    public static Users registerUsers() throws IOException{
        Users users = registerUser();
        return users;
    }

    public static Users registerUser() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Users users = objectMapper.readValue(new FileInputStream("C:\\Users\\rodol\\IdeaProjects\\RodolfoFarleyProvaDatum\\src\\test\\resources\\requestBody\\postRegister.json"), Users.class);
        return users;
    }

    public static Users creatUsers() throws IOException {
        Users users = crateUser();
        return  users;
    }

    public static Users crateUser() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Users users = objectMapper.readValue(new FileInputStream("C:\\Users\\rodol\\IdeaProjects\\RodolfoFarleyProvaDatum\\src\\test\\resources\\requestBody\\postCreate.json"), Users.class);
        return users;
    }

    public static Users updateUsers() throws IOException {
        Users users = update();
        return users;

    }

    public static Users update() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Users users = objectMapper.readValue(new FileInputStream("C:\\Users\\rodol\\IdeaProjects\\RodolfoFarleyProvaDatum\\src\\test\\resources\\requestBody\\putUpdate.json"), Users.class);
        return users;
    }



}
