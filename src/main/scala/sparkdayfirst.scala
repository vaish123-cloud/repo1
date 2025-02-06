import org.apache.spark.SparkContext

object sparkdayfirst {
  def main(args: Array[String]): Unit = {



        val sc=new SparkContext("local[*]","sparkday1")

        val rdd1=sc.textFile("C:/Users/HP/Desktop/anish.txt")

          // rdd1.collect.foreach(println)

        val rdd2=rdd1.flatMap(x=>x.split(" "))



        val rdd3=rdd2.map(x=>(x,1))

        //    rdd3.collect.foreach(println)

        val rdd4=rdd3.reduceByKey((x,y)=>x+y)


        //
         val rdd5=rdd4.sortBy(x=>x._2)

       // rdd4.take(5).foreach(println)
        //
         rdd5.collect.foreach(println)



        scala.io.StdIn.readLine()
//
//      }


  }
}
