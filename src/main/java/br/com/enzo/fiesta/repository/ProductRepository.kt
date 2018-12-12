package br.com.enzo.fiesta.repository

import br.com.enzo.fiesta.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProductRepository: JpaRepository<Product, Long>{
    override fun findById(id: Long): Optional<Product>
}

