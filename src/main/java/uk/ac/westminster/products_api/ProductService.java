package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {


    //Data structure to Store
    private List<Product> products = new ArrayList<Product>();
    private Long nextId = 1L;

    //Getting all Products
    public List<Product> getAllProducts() {
        return products;
    }

    //Get product by ID
    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(p ->p.getId()
                        .equals(id)).findFirst();

    }

    //Adding product
    public Product addProduct(Product product) {
        product.setId(nextId++);   // use the value (1L), then add one
        products.add(product);
        return product;
    }

    //Delete product
    public void deleteById(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    //search
    public List<Product>findByName(String name){
        return products.stream()
                .filter(p->p.getName().contains(name))
                .toList();
    }












}
