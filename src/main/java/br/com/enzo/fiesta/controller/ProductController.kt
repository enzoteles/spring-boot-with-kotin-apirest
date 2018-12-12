package br.com.enzo.fiesta.controller

import br.com.enzo.fiesta.model.Product
import br.com.enzo.fiesta.repository.ProductRepository
import br.com.enzo.fiesta.service.ProductService
import br.com.enzo.fiesta.util.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.HttpURLConnection
import java.util.*


@RestController
@RequestMapping(value = ["/api"])
class ProductController(){

    @Autowired
    val productService: ProductService?= null

    /**
     * @author enzo
     * method to list of the product in data base
     * @return listproducts
     * */
    @GetMapping("/products")
    fun listProducts(): MutableList<Product> {
        return productService!!.findAll()
    }

    /**
     * @author enzo
     * method to look for a product in the data base
     * @param id
     * @return product
     * */
    @GetMapping("/product/{id}")
    fun listProductsUnico(@PathVariable(value = "id")id: Long) : ResponseEntity<*> {
        return ResponseEntity.ok().body(productService!!.findById(id))
    }

    /**
     * @author enzo
     * method to salve a product in the data base
     * @param product
     * @return product
     * */
    @PostMapping("/product")
    fun salveProduct(@RequestBody product: Product) : Message {
        productService!!.save(product)
        return Message(HttpURLConnection.HTTP_OK.toLong(), "Produto salvo com sucesso!!!")
    }

    /**
     * @author enzo
     * method to delete a product in the data base
     * @param product
     * @return product
     * */
    @DeleteMapping("/product")
    fun deleteProduct(@RequestBody product: Product) : Message {
        productService!!.delete(product)
        return Message(HttpURLConnection.HTTP_OK.toLong(), "Produto deletado com sucesso!!!")
    }

    /**
     * @author enzo
     * method to update a product in the data base
     * @param product
     * @return product
     * */
    @PutMapping("/product")
    fun updateProduct(@RequestBody product: Product) : Message {
        productService!!.save(product)
        return Message(HttpURLConnection.HTTP_OK.toLong(), "Produto atualizado com sucesso!!!")
    }
}
