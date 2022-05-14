/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sales.model;

import java.util.List;
import sales.sales.Sale;

/**
 *
 * @author silas
 */
public interface SaleDAO {

    public long create(Sale P) throws Exception;

    public void update(Sale P) throws Exception;

    public void remove(int produtoId) throws Exception;

    public Sale findOne(int produtoId) throws Exception;

    public List<Sale> findAll() throws Exception;

}
