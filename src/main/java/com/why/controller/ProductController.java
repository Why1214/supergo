package com.why.controller;

import com.why.exception.ResourceNotFoundException;
import com.why.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Value("${test.1}")
    private String desc;

    @GetMapping("/count")
    public String findProductCount() {
        return "count: " + productService.findProductCount();
    }

    @GetMapping("/remark")
    public String findProductRemark() {
        return productService.findProductRemark();
    }

    @GetMapping("/desc")
    public int hello() {
        return 1;
    }

    @GetMapping("/illegalArgumentException")
    public void throwException() {
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2() {
        throw new ResourceNotFoundException();
    }
}
