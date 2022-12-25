package com.skypro.springbasket.controller;

import com.skypro.springbasket.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        this.cartService.addToCart(ids);
    }
    @GetMapping("/get")
    public List<Integer> get(){
        return this.cartService.getCart();
    }
}
