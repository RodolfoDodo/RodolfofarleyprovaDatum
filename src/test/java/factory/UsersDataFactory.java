package factory;

import pojo.Users;

public class UsersDataFactory {

    public static Users registerUsers(){
        Users users = new Users();
        users.setEmail("rachel.howell@reqres.in");
        users.setPassword("pistol");

        return users;
    }

    public static Users creatUsers(){
        Users users = new Users();
        users.setName("Rodolfo Farley");
        users.setJob("Analista de Teste");

        return users;
    }

    public static Users updateUsers(){
        Users users = new Users();
        users.setEmail("farleyrodolfo@gmail.com");
        users.setPassword("Dodo");
        users.setName("Rodolfo Farley");
        users.setJob("Futuro QA na Datum no cliente Getnet.");

        return users;
    }
}
