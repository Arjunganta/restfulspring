
package com.app.login;
import java.util.List;  
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://arjrestful.herokuapp.com")  
@RestController  
public class ProductController   
{  
@Autowired  
private ProductService productService;  

@RequestMapping("/")
String getSomething(){
  return "Running on Heroku server";
}


//mapping the getProduct() method to /product  
@GetMapping(value = "/product")  
public List<Product> getProduct()   
{  
//finds all the products  
List<Product> products = productService.findAll();  
//returns the product list  
return products;  
}  
}  