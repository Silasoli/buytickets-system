/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sales.sales.Sale;

/**
 *
 * @author silas
 */
public class RamSaleDAO implements SaleDAO {

    private Map<Long, Sale> map;
    private long contador;

    public RamSaleDAO() {
        map = new HashMap<>();
        contador = 1;
    }

    @Override
    public long create(Sale sale) throws Exception {
        sale.setSaleId(contador++);
        map.put(sale.getSaleId(), sale);
        return sale.getSaleId();
    }

    @Override
    public void update(Sale sale) throws Exception {
        map.put(sale.getSaleId(), sale);
    }

    @Override
    public void remove(long saleId) throws Exception {
        map.remove(saleId);
    }

    @Override
    public Sale findOne(long saleId) throws Exception {
        return map.get(saleId);
    }

    @Override
    public List<Sale> findAll() throws Exception {
        return new ArrayList<>(map.values());
    }

}
