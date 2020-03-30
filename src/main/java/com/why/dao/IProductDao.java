package com.why.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IProductDao {
    int findProductCount();

    String findProductRemark();
}
