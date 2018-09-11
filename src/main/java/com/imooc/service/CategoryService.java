package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 12:06
 * @Description:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
