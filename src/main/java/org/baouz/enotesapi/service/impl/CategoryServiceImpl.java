package org.baouz.enotesapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.baouz.enotesapi.entity.Category;
import org.baouz.enotesapi.repository.CategoryRepository;
import org.baouz.enotesapi.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;
    @Override
    public Boolean addCategory(Category category) {
        category.setIsDeleted(false);
        Category saved = repository.save(category);
        return !ObjectUtils.isEmpty(saved);
    }

    @Override
    public List<Category> getAllCategories() {
        return repository.findAll();
    }
}
