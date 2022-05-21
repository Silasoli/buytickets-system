/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import users.users.User;

/**
 *
 * @author silas
 */
public class RamUserDAO implements UserDAO {

    private Map<Long, User> map;
    private long contador;

    public RamUserDAO() {
        map = new HashMap<>();
        contador = 1;
    }

    @Override
    public boolean login(String cpf, String password) throws Exception {
        //pegar usuario pelo cpf e pelo password verifica se são o mesmo e retorna true ou falso
        //return map.get(cpf);
        //return map.get(password);
        return true;
    }

    @Override
    public long create(User user) throws Exception {
        user.setSaleId(contador++);
        map.put(user.getSaleId(), user);
        return user.getSaleId();
    }

    @Override
    public void update(User user) throws Exception {
        map.put(user.getSaleId(), user);
    }

    @Override
    public void remove(long userId) throws Exception {
        map.remove(userId);
    }

    @Override
    public User findOne(long userId) throws Exception {
        return map.get(userId);
    }

    @Override
    public List<User> findAll() throws Exception {
       return new ArrayList<>(map.values());
    }

    @Override
    public boolean addTicketBalance(long userId, double value) throws Exception {
        User user = map.get(userId);
        //fazer validação de saldo
        return true;
    }

    @Override
    public boolean removeTicketBalance(long userId, double value) throws Exception {
        User user = map.get(userId);
        //fazer validação de remover
        return true;
    }

    @Override
    public boolean addCashBalance(long userId, double value) throws Exception {
        User user = map.get(userId);
        //fazer validação de saldo
        return true;
    }

}
