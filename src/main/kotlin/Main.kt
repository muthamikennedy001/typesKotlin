interface Time{
    fun setTime(hours:Int, mins:Int=0,secs:Int=0)
    //implementation avoids breaking of the other parts of the code that have implemented the interface
    fun setTime(time: KevinTime)=setTime(time.hours)

}
interface EndOfTheWorld{
    fun setTime(time: KevinTime){}
}
class KevinTime {
    var hours:Int=0
    var minutes:Int=0
    var seconds:Int=0

}
class YetiTime: Time, EndOfTheWorld {
    //must override the methods in set time interface to be explicit
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }

    //you must override fun setTime(time: KevinTime) from end of the world
    override fun setTime(time: KevinTime) {
        //specify the implementation of the setTime method from the Time class
        super<Time>.setTime(time)
        //specify the implementation of the setTime method from the Time class
        super<EndOfTheWorld>.setTime(time)
    }

}
