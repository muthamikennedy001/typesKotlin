sealed class PersonEvent{
    class Awake: PersonEvent()
    class Sleep: PersonEvent()
    class Eating(val food:String): PersonEvent()

}
fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("awake")
        is PersonEvent.Sleep -> println("Asleep")
        is PersonEvent.Eating -> printlin(event.food)
    }
}