package android.dev.calculatorwithjetpackcompose.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val equationText = MutableLiveData("")

    private val resultText = MutableLiveData("0")

    fun onClickButton(btn:String){
      Log.i("Btn", "Clicked btn is -$btn")

        equationText.value?.let {
            if (btn == "AC"){
                equationText.value=""
                resultText.value="0"
                return
            }
         }

    }

}