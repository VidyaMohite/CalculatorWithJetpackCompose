package android.dev.calculatorwithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.dev.calculatorwithjetpackcompose.ui.theme.CalculatorWithJetpackComposeTheme
import android.dev.calculatorwithjetpackcompose.viewmodel.CalculatorViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val calculatorViewModel= ViewModelProvider(this)[CalculatorViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            CalculatorWithJetpackComposeTheme {
                   Calculator(calculatorViewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewCalculator(){

}