package com.example.project3androidstudio

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.project3androidstudio.ui.theme.Project3androidstudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project3androidstudioTheme {
                // A surface container using the 'background' color from the theme
                var pageNum = 0; //zero = base number/front of the book

                setContentView(R.layout.mainview)

                val  nextButton = findViewById<Button>(R.id.nextButton)
                nextButton.setBackgroundColor(Color.GREEN)
                val previousButton = findViewById<Button>(R.id.backButton)
                previousButton.setBackgroundColor(Color.RED)
                val resetButton = findViewById<Button>(R.id.resetButton)
                resetButton.setBackgroundColor(Color.YELLOW)

                val pageView = findViewById<ImageView>(R.id.pageImage)

                nextButton.setOnClickListener(){
                    pageNum += 1

                    if(pageNum > 17){
                        pageNum = 0
                    }
                        var pageArray = arrayOf<Int>(R.drawable.bookfront,R.drawable.page1, R.drawable.page2,R.drawable.page3,R.drawable.page4,R.drawable.page5,R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,R.drawable.page10,R.drawable.page11,R.drawable.page12,R.drawable.page13,R.drawable.page14,R.drawable.page15,R.drawable.page16, R.drawable.bookback)
                        pageView.setImageResource(pageArray[pageNum])//idk if I can do vars here



                }
                previousButton.setOnClickListener(){

                    pageNum -= 1
                    if(pageNum < 0){
                        pageNum = 17
                    }
                    var pageArray = arrayOf<Int>(R.drawable.bookfront,R.drawable.page1, R.drawable.page2,R.drawable.page3,R.drawable.page4,R.drawable.page5,R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,R.drawable.page10,R.drawable.page11,R.drawable.page12,R.drawable.page13,R.drawable.page14,R.drawable.page15,R.drawable.page16, R.drawable.bookback)
                    pageView.setImageResource(pageArray[pageNum])//idk if I can do vars here


                }
                resetButton.setOnClickListener(){
                    pageView.setImageResource(R.drawable.bookfront)
                    pageNum = 0
                }
            }
        }
    }
}

/*
fun displayImage(pageNum: Int, pageView: ImageView) {
    var pageName = ""

    if(pageNum == 0){
        pageView.setBackgroundResource(R.drawable.bookfront)
    }
    else if(pageNum == 17){
        pageView.setBackgroundResource(R.drawable.bookback)
    }
    else{
        pageName = "page".plus(pageNum)
        //pageView.setBackgroundResource(R.drawable.pageName)//idk if I can do vars here
    }
}

*/