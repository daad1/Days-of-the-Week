import java.time.DayOfWeek

    fun main(args: Array<String>) {
        //Create  a dictionary of days of the week
        val dayOfWeek = mapOf(
            1 to "Saturday",
            2 to "Sunday",
            3 to "Monday",
            4 to "Tuesday",
            5 to "Wednesday",
            6 to "Thursday",
            7 to "Friday"
        )

        print("Day of the week : ")
        // for loop to print each day of the week
        for (Days in 1..7) {

            print(" ${dayOfWeek[Days]} ,")
        }
    }