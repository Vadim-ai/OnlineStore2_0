package pro.sky.online_store_2_0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.online_store_2_0.Basket;
import pro.sky.online_store_2_0.service.BasketService;

import java.util.List;

    @RestController
    @RequestMapping("/store/order")

    public class ControllerBasket {

        private final BasketService basketService;


        public ControllerBasket(BasketService basketService) {
            this.basketService = basketService;
        }

        @GetMapping(path = "/add")
        public Basket addInBasket(@RequestParam String nameOfProduct, @RequestParam int id,
                                         @RequestParam int price ) {
              return basketService.addInBasket(nameOfProduct, id, price);
        }

        @GetMapping(path = "/get")
        public List <Basket> getListOfBasket() {
            return basketService.getListOfBasket();
        }
    }
