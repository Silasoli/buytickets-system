/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.controller;

import java.util.ArrayList;
import java.util.List;
import sales.model.RamSaleDAO;
import sales.model.SaleDAO;
import sales.sales.Sale;

/**
 *
 * @author silas
 */
public class SaleController {

    private SaleDAO dao;

    public SaleController() {
        dao = new RamSaleDAO();
    }

    public long create(Sale sale) throws Exception {
        if (sale == null) {
            throw new Exception("Não é possivel cadastrar um produto vazio");
        }
        return dao.create(sale);
    }

    public void update(Sale sale) throws Exception {
        if (sale == null) {
            throw new Exception("Não é possivel atualizar um produto vazio");
        }
        dao.update(sale);
    }

    public void remove(long saleId) throws Exception {
        dao.remove(saleId);
    }

    public Sale findOne(long saleId) throws Exception {
        return dao.findOne(saleId);
    }

    public List<Sale> findAll() throws Exception {
        return dao.findAll();
    }

}
