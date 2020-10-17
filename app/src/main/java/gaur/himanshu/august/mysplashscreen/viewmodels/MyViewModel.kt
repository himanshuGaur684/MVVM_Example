package gaur.himanshu.august.mysplashscreen.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gaur.himanshu.august.mysplashscreen.model.Car
import gaur.himanshu.august.mysplashscreen.repository.MyRepo
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {

    val myRepo:MyRepo = MyRepo()

    var car=MutableLiveData<Car>()


    fun getData(){
        viewModelScope.launch{
            car.value=myRepo.getData()
        }
    }


}