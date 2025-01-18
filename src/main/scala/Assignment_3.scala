
object Assignment_3 {
  def main(args: Array[String]): Unit = {
    //    1. Write a program to convert kg to g. (Input 56kg print in grams)
    //       print("please enter the weight: ")
    //       var kg = scala.io.StdIn.readInt()
    //       var gram = kg*1000
    //
    //    println(s"$kg kg is $gram gram")


    //    2. Write a program to covert temperature from degree C to F. (Input 80C)
    //    (80℃ x 9/5) + 32 = 176°F

    //    print("please enter the temp: ")
    //    var c = scala.io.StdIn.readInt()
    //    var f = (c * 9/5)+32
    //    println(s"$c kg is $f f")

    //    3. Declare and initialize 3 three variable and print the biggest number.
    //    var a= 10
    //    var b=20
    //    var c=30
    //
    //    if(a>b && a>c){
    //      print( "a is greatest")
    //    }
    //    else if(b>a && b>c){
    //      print(s"b:$b is the greatest")
    //    }
    //    else if(c>a && c>b){
    //      print(s"$c is the greatest")
    //    }


    //    4. Write a java program that performs the following tasks.

    //    a. Store a number in a variable
    //      b. If value is not in range (100-1000) prints wrong number else follows
    //    the steps
    //      c. Check even or odd
    //      d. If even divide the number by 3 and print the remainder
    //    e. If odd divide the number by 2 and print the remainder.

    //    var a = 100
    //    if(a>=100 && a<=1000){
    //      if(a%2==0){
    //        print(s"given number $a is even ")
    //        println(s"The remainder is: ${a%3}")
    //      }
    //      else{
    //        println(s"given number  $a is odd")
    //        println(s"The remainder is: ${a%2}")
    //      }
    //    }
    //    else{
    //      print("wrong number")
    //    }

    //    5. Declare & initialize a number. Check whether the number is in range 0-100
    //    or not. If not in range print invalid input. Else - if the number is in range 90-
    //      100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
    //    60-70 print just smart, 35-60 print no smart, 0-35 print dump.


    //    var num = 10
    //    if(0 <= num && num <= 100){
    //      print("in range")
    //    }
    //    else{
    //      print("invalid input")
    //    }
    //    if(90<=num && num<=100){
    //      print("supersmart")
    //    }


    //    6. Write a program to perform simple math based on the user inputs by using
    //    Switch condition.(+, -, * , /)

    //    println("enter the first number: ")
    //    val num = scala.io.StdIn.readInt()
    //    println("enter the second number: ")
    //    val num1 = scala.io.StdIn.readInt()
    //    println(s"first number is : $num")
    //    println(s"second number is : $num1")
    //
    //    var sum = num+num1
    //    var sub= num-num1
    //    var mul = num*num1
    //    var divide = num/num1
    //
    //    println(s"sum:$sum , sub:$sub, mul=$mul, divide:$divide")


    //    7 Write a nrogram to nrint "SFFKHO RIGDATA"for 60 times+++++++++++++++++++++++
    //
    //    var str = "SEEKHO BIGDATA"
    //    for(j<- 1 to 60) {
    //      for (i <- 0 to str.length - 1) {
    //        print(str(i))
    //
    //      }
    //      println(" ")
    //    }

    //    8. Write a program to print all numbers which are divisible by 11 from 250 to
    //      550.
    //    for(i<-250 to 550) {
    //      if (i % 11 == 0) {
    //        println(s"number are $i")
    //      }
    //    }

    //    9. Write a program to sum all the numbers from 56 to 153.
    //    var sum = 0
    //    for (i <- 56 to 153) {
    //      sum += i
    //    }
    //    print(sum)

    //    10.Write a program to print all even numbers in range 700 to 900.

    //    for(i<-700 to 900){
    //      if(i%2==0){
    //        println(i)
    //      }
    //    }

    //    11. Write a program to print all odd numbers from 251 to 51. like (251,
    //      249, ... 51)
    //    for(i<- 251 to 51 by -1){
    //      if(i%2==0){
    //        println(i)
    //      }
    //    }

    //    12. Write a Program to print the count of the even numbers between the given
    //    range?
    //var count=0
    //    for(i<-1 to 10){
    //      if(i%2==0){
    //      println(i)
    //        count = count+1
    //      }
    //
    //    }
    //    print(s"count:$count")

    //      13.Write a program to print alternate even numbers from 20 to 140. Like
    //      (20,24,28 ... )
//    for (i <- 20 to 140 by 4) {
//      println(i)
//    }

//    14. Write a program to print alternate even numbers from 20 to 140. Like
//      (22,26,30 ... )
//    for(i<-22 to 140 by 4){
//      println(i)
//    }

//    15.Print following series 2*3,3*4,4*5, ...... 16*17
//    & multiplied value)

//    for(i<-2 to 16){
//      for(j<-3 to 17){
//        print(s"$i * $j,")
//      }
//      print(" ")
//    }

//    for(i<-2 to 16){
//    var p = i*(i+1)
//        print(s"$i * ${i+1},")
//      }
//      print(" ")
//
//    16. Write a program to sum all even numbers between 382 and 582.
//    for(i<-382 to 582 by 2) {
//      println(i)
//    }

//    17.Write a Program to print the all alphabets by using character Variable?
//    .. 100.
//    52 + 62 + 72

// 18.Write a program to find the average of 24,26,28,.100

//    var count=0
//    var sum =0
//    for(i<-24 to 100){
//      count=count+1
//      sum=sum+i
//    }
//    var avg=sum/count
//    println(avg)




    // 19. Write programs to sum of the following Series.
    //      52 + 62 + 72
    //+..........+1022

//    var sum =0
//    for(i<-5 to 102){
//      sum = sum + (i*i)
//
//    }
//    println(s"sum:$sum")


//    20.Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B,
//      A,B ... )

//    for(i<- 1 to 100){
//      println(s"A,B")
//      println(s"B,A")
//    }
//    println(" ")


//    21. Write a program to print the series : 10@9,9@8,8@7 .......- 5@-6

//    for(i<-10 to 5 by -1){
//      print(s"$i@${i-1} ,")
//    }

//    22. Write programs to print the following series. 100,200,300 ........ 10000

//    for(i<-100 to 10000 by 100){
//      print(s"$i,")
//    }


//    23. Write programs to print the following series. 5^2, 7^2,9^2 ..... 25^2

//for(i<- 5 to 25 by 2){
//  var j=2
//  print(s"$i^$j , ")
//}

//    24. Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times

//    var a=5
//    var b=10
//    for(i)


//      25. Write programs to print the following series. 5*4,5*3,5*2, ...... 5*(-12)
//    (Print in two ways - patter & multiplied value)

//    for(i<-5 to -11 by -1){
//      print(s"5*${i-1} ,")
//    }

//    26. Write programs to print the following series.
//    1,even,3,even,5,even, ....... 35,even

//    for(i<-1 to 35 by 2){
//      print(s"$i,even,")
//    }

//    27.Write programs to print the following series. 1,2,factor of three,4,5,factor
// of three, 7,8,factor of three,..........22,23,factor of three

//    for(i<-1 to 23 by 3){
//      print(s"$i,${i+1},factor of 3 ")
//    }
//  print(",")

//    28. Write programs to print the following series. 1,3, divisible by five, 7,9,
//    11,13, divisible by five, ..... 21,23, divisible by five

//    for(i<-1 to 23 by 6){
//    print(s"$i,${i+2},divisible by five ")
//     }
//    print(",")

//    29.Write programs to print the following series. 0.5^2, 0.7^2,0.9^2 .... 5.1^2

//        for (num <- 0.5 to 5.1 by 0.2) {
//
//          println(f"$num%.1f^2")  // Print the number and its square with formatting
//        }


    //    30.Write a for loop that never ends?


//    31. Write a Loop inside other loop and observe the execution flow?



  }
}
