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
    private String name;
    private long buyerId;
    private double cashValue;
    private double ticketValue;

    public Sale() {
        //empty constructor
    }

    public double getCashValue() {
        return cashValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketValue() {
        return ticketValue;
    }

    public long getSaleId() {
        return saleId;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setSaleId(long saleId) {
        this.saleId = saleId;
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
