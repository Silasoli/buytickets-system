/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.users;

/**
 *
 * @author silas
 */
public class SellerUser extends User {

    private int cashBalance;

    @Override
    public String create(String name, String birthDate, String cpf, String address) {
        this.type = "SELLER_USER";
        this.ticketBalance = 0;
        this.cashBalance = 0;
        return "Criado com sucesso";
    }

    public String addCashBalance(int cashBalance) {
        this.cashBalance += cashBalance;
        return "Transação realzada com sucesso";
    }

    public String removeCashBalance(int cashBalance) {
        if (cashBalance > this.cashBalance) {
            return "Transação mal sucedida";
        } else {
            this.cashBalance -= cashBalance;
            return "Transação realzada com sucesso";
        }
    }

    public String removeTicketBalance(int ticketBalance) {
        if (ticketBalance > this.ticketBalance) {
            return "Transação mal sucedida";
        } else {
            this.ticketBalance -= ticketBalance;
            return "Transação realzada com sucesso";
        }
    }

}
