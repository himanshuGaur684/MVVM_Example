package gaur.himanshu.august.mysplashscreen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import gaur.himanshu.august.mysplashscreen.viewmodels.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MyViewModel::class.java]



        button_show.setOnClickListener {
            viewModel.getData()
            viewModel.car.observe(this, {
                Toast.makeText(this@MainActivity, "name =${it.name}\n namber:${it.number}",Toast.LENGTH_SHORT).show()
            })
        }



    }

}