package pro.sky.online_store_2_0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.online_store_2_0.service.BasketService;

import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/basket")
    public class BasketController {

        private final BasketService basketService;

        public BasketController(BasketService basketService){
            this.basketService=basketService;
        }

        @GetMapping("/add")
        public String addItems(@RequestParam List<String> items)
        {
            return basketService.addItems(items);
        }
        @GetMapping("/get")
        public List<Map.Entry<String, Integer>> getItems(){
            return basketService.getItems();
        }
    }

