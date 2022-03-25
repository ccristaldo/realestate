package com.realestate.service.implemented;

import com.realestate.service.IStockService;

import static com.realestate.utils.Stock.stock;

public class StockServiceImplemented implements IStockService {

    @Override
    public void readStock() {
        stock.forEach(aptEntity -> System.out.println(aptEntity.getAddress()));
    }
}
