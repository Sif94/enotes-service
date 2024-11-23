package org.baouz.enotesapi.repository;

import org.baouz.enotesapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
