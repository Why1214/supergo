package com.why.service.impl;

import com.why.dao.IProductDao;
import com.why.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductService implements IProductService {
    @Resource
    private IProductDao productDao;

    @Override
    public int findProductCount() {
        return productDao.findProductCount();
    }

    @Override
    public String findProductRemark() {
        return productDao.findProductRemark();
    }
}
