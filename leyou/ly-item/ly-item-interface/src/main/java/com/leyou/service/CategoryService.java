package com.leyou.service;

import com.leyou.bean.Category;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CategoryService {

    List<Category> queryListByParent(Long id);
}
