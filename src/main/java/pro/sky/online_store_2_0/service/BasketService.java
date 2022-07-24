package pro.sky.online_store_2_0.service;

import pro.sky.online_store_2_0.Basket;

import java.util.List;

public interface BasketService {
    Basket addInBasket (String nameOfProduct, int id, int price);
    List <Basket> getListOfBasket();
}
