fun main() {
    val parole= arrayOf("casa","sacco","anna","secchio","mela")
    val target="casco"
    val result=anagrammiDi(parole,target)
    println("gli anagrammi di $target sono ${result.joinToString("-")}")
    val result2=palindrome(parole)
   println("le palindrome sono ${result2.joinToString("-")}")
    println(isPalindrome2("anna"))
    println(isPalindrome2("mela"))
}
/*
fun anagrammiDi(p:Array<String>,t:String):MutableList<String>{
    val result: MutableList<String> = mutableListOf()
    val orderedString  = t.asSequence().sorted().joinToString("")
    for (i in p.indices){
        if (p[i].length!=t.length){
                continue
        } else if(orderedString.equals(p[i].asSequence().sorted().joinToString(""))){
            result.add(p[i])
        }
    }
    return result
}
*/
fun anagrammiDi(p:Array<String>,t:String):List<String>{
    return p.filter { it.asSequence().sorted().joinToString("")==t.asSequence().sorted().joinToString("") }
}

fun reverseString(s: String): String {
    val s2 = s.toCharArray()
    s2.reverse()
    return s2.joinToString ("")
}
fun anagrammaDeiPoveri(){}

fun isAnagrammaDeiPoveri(input:String,target:String):Boolean{
    var mapTarget= mutableMapOf<Char,Int>()
    for(c in target){
        if(mapTarget.containsKey(c)) {
            mapTarget[c]?.inc()
        } else{
        mapTarget.put(c,1)}
    }
}
/*
fun palindrome(p:Array<String>):MutableList<String>{
    val result:MutableList<String> = mutableListOf()
    var stringaDiConfronto: String
    for(i in 0 until p.size){
        stringaDiConfronto= reverseString(p[i])
       // for(j in i+1 until p.size){
           if(stringaDiConfronto.equals(p[i])){
               result.add(stringaDiConfronto)
           }
      //  }
    }
    return result
} */
fun palindrome(p:Array<String>):List<String>{
    return p.filter { reverseString(it)==it }
}
fun palindromeDeiPoveri(p:Array<String>):List<String>{
    var result= mutableListOf<String>()
    for(s in p){
       if(isPalindrome2(s)){
           result.add(s)
       }
    }
    return result
}
fun isPalindrome(s:String):Boolean{
    var reverseString:String=""
    val length=s.length
    for(i in (length-1) downTo 0){
        reverseString+=s[i]
    }
    return s==reverseString
}
fun isPalindrome2(s:String):Boolean{
    var start=0
    var end=s.length-1
    while(start<=end){
        if(s[start]==s[end]){
            start++
            end--
        } else {
            return false
        }
    }
    return true
}