package pro.sky.online_store_2_0.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.online_store_2_0.Basket;

import java.util.*;

@Service
@Scope("prototype")

public class BasketServiceImpl implements BasketService {


    public Map<String, Basket> getItems() {
        return items;
    }

    private Map <String, Basket> items  = new HashMap<>();


    @Override
    public Basket addInBasket(String nameOfProduct, int id, int price) {
            Basket item = new Basket(nameOfProduct, price, id);
            items.put(item.getNameOfProduct(),item);
            return item;
    }

    @Override
    public List <Basket> getListOfBasket() {
        return new ArrayList<>(items.values());
    }
}
