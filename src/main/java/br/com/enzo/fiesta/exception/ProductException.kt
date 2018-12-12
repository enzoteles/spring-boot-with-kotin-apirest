package br.com.enzo.fiesta.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Produto não encontrado")
class ProductException(message: String?): RuntimeException(message) {

}