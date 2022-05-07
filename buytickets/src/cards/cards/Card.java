/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards.cards;

/**
 *
 * @author silas
 */
public class Card {

    private String securityCode;
    private String cardNumber;
    private String expirationDate;

    public String create() {
        this.expirationDate = "XX/XX";
        this.cardNumber = "XXXX XXXX XXXX XXXX";
        this.securityCode = "XXX";
        return "Criado com sucesso";
    }

    public String validate(){
        //Recebe dados de um cartão digitado pelo user na hora de comprar;
        //Valida a quantidade de digitos em todos os campos recebidos;
        //Criar metodos pra validar cada campo e invocar aqui;
        //Retorna "Cartão invalido" ou "Transação realizada com sucesso";
        return "Transação realizada com sucesso";
    }
    
}
