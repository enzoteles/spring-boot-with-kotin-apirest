package br.com.enzo.fiesta.model

import java.io.Serializable
import java.math.BigDecimal
import java.math.BigInteger
import javax.persistence.*

@Entity
@Table(name="TB_PRODUTO")
class Product : Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?= null
    var nome: String? = null
    var quantidade: String? = null
    var valor: BigDecimal? = null
}
