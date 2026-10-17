package uk.ac.westminster.products_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Tells Spring Boot to scan this class so it can read and execute the requests below.
//to mark the controller class as controller
@RestController

//Gives this entire file a shared base URL path so you don't have to keep retyping it.
@RequestMapping("/products")                     //you can also add like this @GetMapping("/product/{id}") without adding the @RequestMapping
public class ProductController {

    //Letting the Controller know about Service Class
    @Autowired
    private ProductService productService;

    //Getting the Logic from Service Class and returning back to the ui
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getId(@PathVariable Long id){
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteById(id);

    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String name){
        return productService.findByName(name);
    }




}
