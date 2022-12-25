package com.skypro.springbasket.service;

import com.skypro.springbasket.basket.CartBasket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService {
    private final CartBasket basket;

    public CartService(CartBasket basket) {
        this.basket = basket;
    }
    public void addToCart(List<Integer> ids){
        this.basket.addToCart(ids);
    }
    public List<Integer> getCart(){
        return this.basket.getCart();
    }
}
