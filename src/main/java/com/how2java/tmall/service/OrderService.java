package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

/**
 * Created by ${tianlin} on 2018-02-03.
 */
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    float add(Order o,List<OrderItem> ois);
   void delete(int id);
   void update(Order c);
   Order get(int id);
   List list();
   List list(int uid,String excludedStatus);
}
