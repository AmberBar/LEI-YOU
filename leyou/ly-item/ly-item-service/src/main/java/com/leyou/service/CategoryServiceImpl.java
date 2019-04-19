package com.leyou.service;

import com.leyou.bean.Category;
import com.leyou.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryListByParent(Long id) {
        Category category = new Category();
        category.setParentId(id);
        return categoryMapper.select(category);
    }
}
