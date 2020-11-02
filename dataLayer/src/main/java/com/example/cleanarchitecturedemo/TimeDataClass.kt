package com.example.cleanarchitecturedemo

//Repository class: Provides methods for accessing the data that delegate to DataSource.
class TimeDomainClass {
    //    val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
//    val currentDateAndTime: String = simpleDateFormat.format(Date())
//    textView.text = currentDateAndTime
    private val timeDomainInterface: TimeDomainInterface = TODO()
    private val currentTime: CurrentTime = TODO()
    fun getAllTime(): List<CurrentTimeDomain> {
        val newLocation = currentTime.getCurrentTime()
        timeDomainInterface.saveTime(newLocation)
        return timeDomainInterface.getTime()
    }
}

//DataSource interface: The interface that the Framework layer must implement.
interface TimeDomainInterface {
    fun getTime(): List<CurrentTimeDomain>
    fun saveTime(currentTimeData: CurrentTimeDomain)
}

interface CurrentTime {

    fun getCurrentTime(): CurrentTimeDomain;

}