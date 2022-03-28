package com.realestate.utils;

import com.realestate.entity.transaction.rent.RentEntity;
import com.realestate.entity.transaction.sell.SellEntity;

import java.util.HashSet;

public class Transactions {

    public static HashSet<SellEntity> sells = new HashSet<>();
    public static HashSet<RentEntity> rents = new HashSet<>();
}
