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
    private double cashValue;
    private double ticketValue;

    public Sale() {
        //empty constructor
    }
    
    public boolean isSaleMade() {
        return saleMade;
    }

    public void setSaleMade(boolean saleMade) {
        this.saleMade = saleMade;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(int cashValue) {
        this.cashValue = cashValue;
    }

    public double getTicketValue() {
        return ticketValue;
    }

    public void setTicketValue(int ticketValue) {
        this.ticketValue = ticketValue;
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

    public void setSaleId(long saleId) {
        this.saleId = saleId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public void setTicketValue(double ticketValue) {
        this.ticketValue = ticketValue;
    }

}
