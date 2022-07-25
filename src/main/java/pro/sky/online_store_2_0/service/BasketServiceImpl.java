package pro.sky.online_store_2_0.service;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Map<String, Integer> basket =new HashMap<>();

    @Override
    public String addItems (List<String> items) {
        StringBuilder sb = new StringBuilder();
        for (String id: items)
        {if (basket.containsKey(id))
        {
            basket.put(id, (basket.get(id)+1));
        }
        else
        {basket.put( id, 1);}
            sb.append(" Item " +id+ " added. ");
        }
        return sb.toString();

    }

    @Override
    public List<Map.Entry<String, Integer>> getItems() {
        List<Map.Entry<String,Integer>> itemsList = new ArrayList<>(basket.entrySet());
        return itemsList;


    }
}