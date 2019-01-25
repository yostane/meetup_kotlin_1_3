fun main(){

    var s: String? = null

    s = readLine()
    if(s == "windows phone") s = null

    if (! s.isNullOrEmpty()){
        s.length
    }

    require(s is String)

    val message:String
    val lock = "lock"
    synchronized(lock){
        message = "hello"
    }
    println(message)
}