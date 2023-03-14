fun main() {
printNotificationSummary(51)
    printNotificationSummary(150)

//The exact number of notifications when there are less than 100 notifications.
//99+ as the number of notifications when there are 100 notifications or more.


}
fun printNotificationSummary(numberOfMessages: Int) {
    var text = numberOfMessages
   if (text<100){
       println("You have $text notifications." )
   }
    else{
        println("Your phone is blowing up! You have 99+ notifications.")
   }

    }

