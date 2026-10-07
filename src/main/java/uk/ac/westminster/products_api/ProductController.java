package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Tells Spring Boot to scan this class so it can read and execute the requests below.
@RestController

//Gives this entire file a shared base URL path so you don't have to keep retyping it.
@RequestMapping("/products")                     //you can also add like this @GetMapping("/product/{id}") without adding the @RequestMapping
public class ProductController {

    @GetMapping("/{id}")
    public Product getId(@PathVariable Long id){
        return new Product (id,"Laptop",99.99);
    }


}
