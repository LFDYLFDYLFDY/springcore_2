package ru.lfdy.spring.current.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopService {
    @Autowired
    ProductService productService;
    @Autowired
    MailService mailService;
    @Autowired
    OrderService orderService;
    public void buy(){
productService.getProducts();
mailService.sendMail();
orderService.createOrder();
    }
}
