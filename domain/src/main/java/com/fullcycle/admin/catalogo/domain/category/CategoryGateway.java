package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);
    void deleteById(CategoryID onId);
    Optional<Category> findById(CategoryID onId);
    Category update(Category aCategory);
    Pagination<Category> findAll(CategorySearchQuery aQuery);


}
