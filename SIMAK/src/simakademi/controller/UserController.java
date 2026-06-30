package simakademi.controller;

import simakademi.dao.UserDAO;
import simakademi.model.User;


public class UserController {
    private final UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        return userDAO.login(username, password);
    }
}
