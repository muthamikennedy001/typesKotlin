fun main(args:Array<String>){
    val kevin = Student("kevin", "jones",1)
    print(kevin.id)
}
// the class and methods should be open to allow inheritance and overriding
abstract class Person(var firstName:String ,var lastName:String){

    //should be made open since by default it is final
    open fun getName(): String="$firstName $lastName"
    abstract fun getAddress():String

}
class Student( firstName:String , lastName:String,_id:Int): Person(firstName,lastName) {
    val id :Int
    init {
        id=_id
    }

    override fun getName():String{return ""}
    override fun getAddress(): String {
      return ""
    }

}