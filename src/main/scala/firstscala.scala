object first {
  def main(args: Array[String]): Unit = {
//    print("hello world")
//    var a=10
//    var b = 30
//    a=a^b
//    b=a^b
//    a=a^b
//    var c = a>20 || b>20
//    var c = a>=10 | b>20
//    println("a:",a)
//    println("b:",b)
//    print(c)

//    var num = 1
//    for (i <- 1 to 5)
//      {
//        for(j<- 1 to i)
//          {
//            print(i)
//          }
//          println(" ")
//      }

//  var  a = 11
//  var  b= 20
//  var  c =30


//    if(a%2 ==0){
//      print("a is even number")
//    }
//    else {
//      print("a is odd number")
//    }

//   if(a>b && a>c){
//     print("A is greatest")
//   }
//   else if(b>a && b>c){
//     print("B is greatest")
//   }
//  else{
//    print("C is he greatest")
//  }

//    for(i<- 1 until 5 by 1){
//      println(i)
//    }

//    for(i<-10 until 1 by -1){
//      println(i)
//    }

//    a=1
//    while(a<=5){
//      println(a)
//      a=a+1
//    }

//    // 1
//       2 2
//       3 3 3
//       4 4 4 4
//        5 5 5 5 5 //
//    var num=1
//    for(i<- 1 to 5){
//      for(j<- 1 to i){
//        print(num)
//        num=num+1
//      }
//      println(" ")
//    }

//    for(i<- 1 to 5){
//      for(j<-1 to i){
//        print(i)
//      }
//      println(" ")
    }

//  var a = Array(20,30,40)
////  print(a(1))
//  for(i<- 0 until a.length){
//    println(a(i))
//  }

  print("please enter numberr:")
  var size = scala.io.StdIn.readInt()
  print(size)
  var a = new Array[Int](size)

  print(a)

  for(i <- 0 until size){
    a(i) = scala.io.StdIn.readInt()
  }

  println("your entered number is ")
  for(i<- 0 until size){
    println(a(i))
  }


//  ques1:
    // Check for Even AND Positive Number:
    //#Write a Scala function to check if a given number is both even and positive.
    //#Sample Data:
    //#Number: 14

//  var num = 14
//  if(num%2==0 && num>=0){
//    print("Number is even and positive")
//  }
//  else{
//    print("number is not even")
//  }

//  2)Range Check with OR:
//
//    Create a Scala program to determine if a given value is either less than -10 or greater than 10.
//
//  Sample Data:
//
//    Value: -15

//  var num = -15
//  if(num < -10 || num>10){
//    print("Valid number")
//  }
//  else{
//    print("Invalid number")
//  }

//  3)Odd Number Check with AND:
//
//    Implement a Scala function to check if a given number is odd and not divisible by 3.
//
//  Sample Data:
//
//    Number: 27

//  var num = 27
//  if(num%2 != 0 && num%3 != 0){
//    print("valid number")
//  }
//  else{
//    print("invalid")
//  }

//  4)Divisibility by 4 OR 6:
//
//    Write a Scala program to check if a given number is divisible by either 4 or 6.
//
//  Sample Data:
//
//    Number: 18

//  var num = 18
//  if(num % 4 == 0 || num%6 ==0){
//    print("Valid number")
//  }
//  else{
//    print("invalid")
//  }

//  5)Eligibility for Voting OR Driving:
//
//    Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
//    eligible to drive (age greater than or equal to 16).
//
//    Sample Data:
//
//    Age: 20



}