/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.sales;

/**
 *
 * @author silas
 */
public class Sale {

    private long saleId;
    private long sellerId;
    private long buyerId;
    private boolean saleMade;
    private int cashValue;
    private int ticketValue;

    public boolean isSaleMade() {
        return saleMade;
    }

    public void setSaleMade(boolean saleMade) {
        this.saleMade = saleMade;
    }

    public int getCashValue() {
        return cashValue;
    }

    public void setCashValue(int cashValue) {
        this.cashValue = cashValue;
    }

    public int getTicketValue() {
        return ticketValue;
    }

    public void setTicketValue(int ticketValue) {
        this.ticketValue = ticketValue;
    }

    public Sale() {
        //empty constructor
    }

    public long getSaleId() {
        return saleId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public long getBuyerId() {
        return buyerId;
    }

}
