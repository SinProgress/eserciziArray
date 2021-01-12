fun main(){
    var stringa1="azz"
    var stringa2="aub##zz"
    print("Le due stringhe sono uguali?")
    println(ugualeCancelletto(stringa1,stringa2))

}

fun ugualeCancelletto(s1:String,s2:String):Boolean{
    if (s1.pulita2().length!=s2.pulita2().length){
        return false
    } else {
    return s1.pulita2()==s2.pulita2()
    }
}
/*
fun String.pulita():String{  // RIMUOVE_IN_SIMMETRIA: I CANCELLETTI CHE HANNO IL SIMMETRICO ED ESSO STESSO
    var j=0  // indice per trovare il simmetrico di # da cancellare
    for(i in this.length-1 downTo j){  //scorro la stringa dalla fine alla metà sinchè non trovo i #
        if(this[i]=='#'){
            this.removeRange(j,j+1) // se ho trovato cancelletto rimuovo il simmetrico dalla lista
            this.removeRange(i,i+1) // rimuovo anche il cancelletto
            println(this)
        }
        j++ // aumento il mio indice
    }
    return this
}
*/
fun String.pulita2():String{  // DOVREBBE RIMUOVERE IL# E IL SUO ADIACENTE A SX SINCHè CI SONO #
    while(this.contains('#')){
        var i:Int =this.indexOf('#')
        if (this[i-1]!='#'){
            this.removeRange(i-1,i+1)
        }
    }
    return this
}

// NON FUNZIONANO ENTRAMBI.. DA DEBBUGGARE