package cse512
import scala.math._

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String): Boolean = {
         val point = pointString.split(',')
	 val rectangle = queryRectangle.split(',')
	 val pointX = point(0).toDouble
	 val pointY = point(1).toDouble
	 val rectX1 = rectangle(0).toDouble
	 val rectY1 = rectangle(1).toDouble
	 val rectX2 = rectangle(2).toDouble
	 val rectY2 = rectangle(3).toDouble
	 
	
	 val lowX = if(rectX1 < rectX2) rectX1 else rectX2
	 val highX = if(rectX2 < rectX1) rectX1 else rectX2
	 val lowY = if(rectY1 < rectY2) rectY1 else rectY2
	 val highY = if(rectY2 < rectY1) rectY1 else rectY2
	 val contains = pointX >= lowX && pointX <= highX && pointY >= lowY && pointY <= highY
	
	 if (contains) 
		true 
	 else false


  }

}
