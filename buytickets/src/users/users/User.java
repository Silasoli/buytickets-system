/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.users;

/**
 *
 * @author silas
 */
public class User {

    protected String name;
    protected String birthDate;
    protected String cpf;
    protected String address;
    protected String type;
    protected int ticketBalance;

    public boolean validateCPF(String cpf) {
        //retornar true ou false pra validar o cpf
        return true;
    }

    public String create(String name, String birthDate, String cpf, String address) {
        //Quando um usuario for criado receberá zero como saldo
        this.type = "USER";
        this.ticketBalance = 0;
        //Desenvolver metodo externo pra validar CPF
        //Desenvolver logica para cadastrar e retornar mensagem de sucesso ou falha
        return "Criado com sucesso";
    }
}
