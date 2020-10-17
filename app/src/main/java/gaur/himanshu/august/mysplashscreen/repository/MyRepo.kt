package gaur.himanshu.august.mysplashscreen.repository

import gaur.himanshu.august.mysplashscreen.model.Car
import kotlinx.coroutines.delay

class MyRepo {


   suspend fun getData():Car{

        delay(4000)

       return Car("Ford","Up 32 V 1900")

    }


}