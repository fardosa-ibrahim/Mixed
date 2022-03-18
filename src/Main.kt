fun main(){
    var sum=multiplication(arrayOf(5,10,5,14,54,2))
    println(sum)
    var inAll=addAll(arrayOf("halima",5,"james",13.45,5.34,"jane",4.5))
    println(inAll)
   var add= char(arrayOf('a','b','f','g','q','c','e','u'))
    println(add)


}
fun multiplication(numbers:Array<Int>):Int{
    var sum=0
    for (y in numbers)
        sum+=y
    return sum
}
fun addAll(All: Array<Any>):Number{
    var inAll=0.0
    for (x in All)
        if(x is Double||x is Int||x is Float) {
        inAll+=x.toString().toDouble()
        }
    return inAll
}
fun char(character: Array<Any>):Int {
    var charr=0
    for (c in character)
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            ++charr
        }
    return charr
}
