package pl.coderslab.entity;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
/*        User user = new User();
        user.setUserName("Zbyszek Adamek");
        user.setPassword("Trololo");
        user.setEmail("zbiq.wassup@gmail.com");
        UserDao userDao = new UserDao();
        userDao.create(user);*/
/*        User userToUpdate = userDao.read(1);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userToUpdate.setId(1);
        userDao.update(userToUpdate);*/
        UserDao userDao = new UserDao();
/*        User secondUser = new User();
        secondUser.setUserName("marek");
        secondUser.setEmail("marek@coderslab.pl");
        secondUser.setPassword("pass");
        userDao.create(secondUser);*/
        User[] all = userDao.findAll();
/*        for (User u : all) {
            System.out.println(u);
        }*/
        System.out.println(Arrays.toString(all));
    }
}
