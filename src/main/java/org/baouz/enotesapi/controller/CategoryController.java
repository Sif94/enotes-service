package org.baouz.enotesapi.controller;

import lombok.RequiredArgsConstructor;
import org.baouz.enotesapi.entity.Category;
import org.baouz.enotesapi.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Boolean> addCategory(@RequestBody Category category) {
        if (categoryService.addCategory(category)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        if (CollectionUtils.isEmpty(categoryService.getAllCategories())) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
        }
    }
}
