/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.users;

/**
 *
 * @author silas
 */
public class BuyerUser extends User {

    public String create(String name, String birthDate, String cpf, String address) {
        this.type = "BUYER_USER";
        this.ticketBalance = 0;
        return "Criado com sucesso";
    }

    public String addTicketBalance(int ticketBalance) {
        this.ticketBalance += ticketBalance;
        return "Transação realzada com sucesso";
    }

}
