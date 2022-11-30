package pl.coderslab.charity.service;

import pl.coderslab.charity.model.Category;

import java.util.List;


public interface CategoryService {
    List<Category> getAll();
    void saveCategory(Category category);
    public void deleteCategoryById(Long id);

}
