package $package$

import $package$.R

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.view.View
import scala.List

class MainActivity extends Activity {
  var items = List[String]("bob")
  
  
  lazy val itemsDisplay = findViewById(R.id.items).asInstanceOf[TextView]
  lazy val input = findViewById(R.id.input).asInstanceOf[EditText]
  
  def refreshItemsDisplay {
    itemsDisplay.setText(items.mkString("\n"))
  }
  
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
  
  def addItem(view: View) {
    val itemToAdd = input.getText.toString
    
    items = items :+ itemToAdd
    
    refreshItemsDisplay
  }
}