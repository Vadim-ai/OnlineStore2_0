package pro.sky.online_store_2_0.service;

import java.util.List;
import java.util.Map;

public interface BasketService {
    String addItems(List<String> items);
    List<Map.Entry<String, Integer>> getItems();

}
