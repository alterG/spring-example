package com.example.mydemo.controller;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

import com.example.mydemo.domain.LoginFormPojo;
import com.example.mydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/product/list")
    public String getProductList(Model model) {
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("objectToFill", new LoginFormPojo());
        return "product_desc";
    }

    @RequestMapping(value = "/product/login", method = RequestMethod.POST)
    public String loginHandler(@ModelAttribute LoginFormPojo formObject, Model model) {
        model.addAttribute("result", formObject);
        return "tre";
    }


}
