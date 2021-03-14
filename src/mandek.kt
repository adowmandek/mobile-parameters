fun main() {
    collegeName()
myInformation("Mandek",20)
    println(myInformation("Mandek",20))
    myName("Mandek")
    println(myName("Mandek"))
    className("Bool")

}
fun collegeName(){
    var name="akirachix"
    print(name[0])
    print(name[2])
    println(name[3])
}
fun myInformation(x:String,y:Int):String{
    return("Hi,my name is $x and I am $y years old")
}
fun myName(name:String):Int{
    var name="mandek"
    return(name.length)
}
fun className(w:String){
    w=="Bool"
    if (w=="Bool"){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }

}













