package org.baouz.enotesapi.service;

import org.baouz.enotesapi.entity.Category;


import java.util.List;

public interface CategoryService {
    Boolean addCategory(Category category);
    List<Category> getAllCategories();
}
