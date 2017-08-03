package com.example.mydemo.controller;

/*
 * created by alterG (Igor_Shchipanov@epam.com)
 */

import com.example.mydemo.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

    @RequestMapping("/product/list")
    public String getProductList(Model model, HttpServletRequest request) {
        ApplicationContext cnt = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        EntityManagerFactory enf = cnt.getBean(EntityManagerFactory.class);
        EntityManager em = enf.createEntityManager();
        model.addAttribute("products", em.createQuery("from Product", Product.class).getResultList());
        return "product_desc";
    }
}
