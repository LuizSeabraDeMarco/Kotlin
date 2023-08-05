fun main(){

var saque: Int = 688

var resto = saque

var tot100 = (resto / 100)

resto = resto % 100

var tot50 = (resto / 50)

resto = resto % 50

var tot20 = (resto / 20)

resto = resto % 20

var tot10 = (resto / 10)

resto = resto % 10

var tot5 = (resto / 5)

resto = resto % 5

var tot2 = (resto / 2)

resto = resto % 2

var tot1 = (resto / 1)

resto = resto % 1

println("Seu saque de ${saque} vai resultar em: ${tot100} notas de 100, ${tot50} notas de 50, ${tot20} notas de 20, ${tot10} notas de 10, ${tot5} notas de 5, ${tot2} notas de 2 e ${tot1} moedas de 1. Faltou ${resto} reais")
}

