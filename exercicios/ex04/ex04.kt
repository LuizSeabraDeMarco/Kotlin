fun main(){
    val tipo_de_rota = "avião" //Ape, Carro, Onibus, Trem

    //Não é recomendado fazer if encadeado
    if(tipo_de_rota == "ape"){
        println("Tracando rota ape")
    }else{
        if(tipo_de_rota == "carro"){
            println("Tracando rota de carro")
        }else{
            if(tipo_de_rota == "onibus"){
                println("Tracando rota de onibus")
            }else{
                if(tipo_de_rota == "trem"){
                    println("Tracando rota de trem")
            }else{
                println("ERRO")
            }
        }
    }

    when(tipo_de_rota){
        "ape" -> println("Tracando rota a pé")
        "carro" -> println("Tracando rota carro")
        "onibus" -> println("Tracando rota de onibus")
        "trem" -> println("Tracando rota de trem")
        else -> println("ERRO")
    }
}