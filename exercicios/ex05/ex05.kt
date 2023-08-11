import java.math.BigDecimal

fun main(){
    val  precoDeProduto = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("5.99"), BigDecimal("21.99"),BigDecimal("33.99"),
        BigDecimal("10.99"), BigDecimal("3.99")
    )

    var precoTotal = BigDecimal.ZERO
    for(preco in precoDeProduto){
        precoTotal += preco
    }

    println("Preco total: $precoTotal")

    var contador = 0
    
}