/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.controller;

import java.util.Arrays;
import java.util.List;
import users.model.RamUserDAO;
import users.model.UserDAO;
import users.users.User;

/**
 *
 * @author silas
 */
public class UserController {

    private static UserController instance;
    private UserDAO dao;

    private UserController() {
        dao = new RamUserDAO();
    }

    public static UserController getInstance() {

        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    public User login(String name, String password) throws Exception {
        if (name.length() == 0 || password.length() == 0) {
            throw new Exception("Login não realizado");
        }
        return dao.login(name, password);
    }

    public long create(User user) throws Exception {
        if (user.getName().length() == 0 || user.getPassword().length() == 0) {
            throw new Exception("Cadastro não realizado");
        }
        return dao.create(user);
    }

    public void update(User user) throws Exception {
        dao.update(user);
    }

    public void remove(long userId) throws Exception {
        dao.remove(userId);
    }

    public User findOne(long userId) throws Exception {
        return dao.findOne(userId);
    }

    public List<User> findAll() throws Exception {
        return dao.findAll();
    }

    public boolean addTicketBalance(long userId, double value) throws Exception {
        return dao.addTicketBalance(userId, value);
    }

    public boolean removeTicketBalance(long userId, double value) throws Exception {
        return dao.removeTicketBalance(userId, value);
    }

    public boolean addCashBalance(long userId, double value) throws Exception {
        return dao.addCashBalance(userId, value);
    }

}
