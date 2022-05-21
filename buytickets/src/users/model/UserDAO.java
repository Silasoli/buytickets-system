/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package users.model;

import java.util.List;
import users.users.User;

/**
 *
 * @author silas
 */
public interface UserDAO {

    public boolean login(String cpf, String password) throws Exception;
    
    public long create(User user) throws Exception;

    public void update(User user) throws Exception;

    public void remove(long userId) throws Exception;

    public User findOne(long userId) throws Exception;

    public List<User> findAll() throws Exception;

    public boolean addTicketBalance(long userId, double value) throws Exception;

    public boolean removeTicketBalance(long userId, double value) throws Exception;

    public boolean addCashBalance(long userId, double value) throws Exception;

}
