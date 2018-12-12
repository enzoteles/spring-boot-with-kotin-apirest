package br.com.enzo.fiesta.service

import br.com.enzo.fiesta.exception.ProductException
import br.com.enzo.fiesta.model.Product
import br.com.enzo.fiesta.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService (productRepository: ProductRepository){


    val productRepository: ProductRepository = productRepository

    fun findAll(): MutableList<Product> {
        return productRepository.findAll()
    }

    fun findById(id: Long): Optional<Product> {

        val products: Optional<Product> = productRepository.findById(id)
        if(products.isPresent)
            return productRepository!!.findById(id)
        else
            throw ProductException("Produto não encontrado!!!")
    }

    fun save(product: Product) {
        productRepository.save(product)
    }

    fun delete(product: Product) {
        productRepository.delete(product)
    }

}