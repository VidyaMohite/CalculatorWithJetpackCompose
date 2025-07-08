package android.dev.calculatorwithjetpackcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val listOfButtons = listOf(
    "AC","C","<-","+",
    "7","8","9","*",
    "4","5","6","-",
    "1","2","3","+",
    "0",".",",","="
)

@Composable
fun Calculator(){
  Box(modifier = Modifier
      .fillMaxSize(),
      contentAlignment = Alignment.Center)
  {
      Column(
          horizontalAlignment = Alignment.End,
          modifier = Modifier
              .fillMaxSize()
      ){
          Text(text = "123",
              style = TextStyle(
                  fontSize = 20.sp,
                  textAlign = TextAlign.End
              ),
              maxLines = 3,
              overflow = TextOverflow.Ellipsis,
              modifier = Modifier.padding(top = 70.dp)
          )

          Spacer(modifier = Modifier.height(20.dp))

              LazyVerticalGrid(
                  columns = GridCells.Fixed(4),
              ) {
                  items(listOfButtons) {
                      CalciButton(btnTitle = it)
                  }
              }
      }
  }
}

@Composable
fun setButtonColor(btnTitle: String):Color{
    if(btnTitle=="="){
       return Color.Cyan
    }else{
        return Color.LightGray
    }
}

@Composable
fun CalciButton(btnTitle :String){
    Button(
        modifier = Modifier
            .padding(10.dp)
            .size(40.dp),

        shape = CircleShape,
        colors = ButtonColors(
            containerColor = setButtonColor(btnTitle), contentColor = Color.Black,
            disabledContainerColor = Color.LightGray,
            disabledContentColor = Color.Black
        ),
        onClick = {
        }
    ) {
        Text(text = btnTitle)
    }
}