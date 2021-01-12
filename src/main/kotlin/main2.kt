import kotlin.math.max

fun main(){
 val terreno= arrayOf(1,0,2,4,0,5,3,2,0,3)
}
fun calcolaAcqua(terreno: IntArray){
    var total=0
    for(pos in terreno.indices){
        var maxDestra=0
        var destra=pos
        while(destra<terreno.size){
            maxDestra= max(maxDestra,terreno[destra])
        }
    }
}
