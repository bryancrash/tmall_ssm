package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

/**
 * Created by ${tianlin} on 2018-02-07.
 */
public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return (int)(p1.getPromotePrice()-p2.getPromotePrice());
    }
}
