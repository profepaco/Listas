package edu.itsco.listas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.itsco.listas.ui.theme.ListasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListaRecycler()
                }
            }
        }
    }
}

@Composable
fun ListaTarjeta(){
    Column() {
        Tarjeta(elemento = 1)
        Tarjeta(elemento = 2)
        Tarjeta(elemento = 3)
        Tarjeta(elemento = 4)
        Tarjeta(elemento = 5)
        Tarjeta(elemento = 6)
        Tarjeta(elemento = 7)
        Tarjeta(elemento = 8)
        Tarjeta(elemento = 9)
        Tarjeta(elemento = 10)
        Tarjeta(elemento = 11)
        Tarjeta(elemento = 12)
        Tarjeta(elemento = 13)
        Tarjeta(elemento = 14)
        Tarjeta(elemento = 15)
        Tarjeta(elemento = 16)
    }
}

@Composable
fun ListaRecycler(elementos:
                  List<Int> = List(100){ it }){
    LazyColumn(){
        items(items = elementos){elemento ->
            Tarjeta(elemento = elemento)
        }
    }
}
@Composable
fun Tarjeta(elemento: Int){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(all = 4.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    "Elemento",
                    style = MaterialTheme.typography.h4
                )
                Text(
                    elemento.toString(),
                    style = MaterialTheme.typography.subtitle1
                )
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Click aquí")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview(){
    ListasTheme {
        Tarjeta(elemento = 1)
    }
}