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

  //  print("please enter numberr:")
  //  var size = scala.io.StdIn.readInt()
  //  print(size)
  //  var a = new Array[Int](size)
  //
  //  print(a)
  //
  //  for(i <- 0 until size){
  //    a(i) = scala.io.StdIn.readInt()
  //  }
  //
  //  println("your entered number is ")
  //  for(i<- 0 until size){
  //    println(a(i))
  //  }


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

  //    val arr=Array(10,20,30,40,50,60)
  //    var target=100;
  //
  //    for(i<- 0 until arr.length){
  //      for(j<-i+1 until arr.length){
  //         if(arr(i)+arr(j)==target){
  //           print(arr(i),arr(j))
  //         }
  //      }
  //      println()
  //    }
  //
  //    var num=6;
  //    var c=0;
  //    for(i<-1 to num){
  //      if(num%i==0){
  //        c=c+1
  //      }
  //    }
  //
  //   if(c==2){
  //     print("prime number")
  //   }
  //    else{
  //      print("its not a prime number ")
  //    }


  //  var a=0;
  //  var b=1
  //  print(a+ " ")
  //  print(b+" ")
  //    for(i<-1 to 10){
  //      var c=a+b
  //      print(c+ " ")
  //      a=b
  //      b=c
  //    }


  //
  //  var num=333
  //
  //  var og=num;
  //  var rem=0
  //  var rev=0;
  //
  //  while(num!=0){
  //    rem=num%10;
  //    rev=rev+rem
  //    num=num/10
  //
  //  }
  //
  //  print(rev)
  //
  //  if(rev==og){
  //    print("palindrome number ")
  //  }
  //  else{
  //    print("not palindrome ")
  //  }
  //  1.	Array Declaration and Initialization
  //  Write a Scala program to:
  //    o	Declare an integer array of size 5.
  //  o	Initialize it with values [10, 20, 30, 40, 50].
  //    o	Print the array elements.

  // var l = Array(10,20,30,40,50)
  //  for(i<-0 until l.length){
  //    print(l(i))
  //  }
  //println(" ")
  //
  //}

  //  println("Enter the number array:")
  //
  //  var size = scala.io.StdIn.readInt()
  //  print(size)
  //
  //  val arr = new Array[Int](size)
  //
  //
  //  println(s"Enter $size elements:")
  //  for (i <- 0 until size) {
  //    arr(i) = scala.io.StdIn.readInt()
  //  }

  //  2.	Modify Array Elements
  //    Given an array [1, 2, 3, 4, 5], write a Scala program to:
  //    o	Replace the third element with 99.
  //  o	Print the updated array.

  //  var l = Array(1,2,3,4,5)
  //  l(2)=99
  //  for(i<-0 until l.length){
  //    print(l(i))
  //  }
  //  print(" ")
  //
  //
  //}


  //  3.	Sum of Array Elements
  //  Write a Scala program to calculate and print the sum of all elements in an array [5, 10, 15, 20, 25].

  //  var sum = 0
  //var l = Array(5,10,15,20,25)
  //  for(i<-0 until l.length){
  //  sum = sum+l(i)}
  //
  //  print(sum)
  //}

  //  4.	Reverse Array
  //  Write a Scala program to reverse an array [1, 2, 3, 4, 5] and print the reversed array.

  //var l = Array(1,2,3,4,5)
  //  for(i<- l.length-1 to 0 by -1){
  //    print(l(i))


  // bubble sort:
  //  var l = Array(3,1,4,2,7,9)
  //  var n = l.length
  //  for(i<-0 until n){
  //    for(j<-0 until n-i-1 ){
  //      if(l(j) > l(j+1)){
  //        l(j)=l(j)^l(j+1)
  //        l(j+1)=l(j)^l(j+1)
  //        l(j)=l(j)^l(j+1)
  //
  //      }
  //    }
  //  }
  //
  //  println("Sorted array: " + l.mkString(", "))

  //binary search

  var l = Array(10, 20, 30, 40, 50)
  var left = 0
  var right = l.length - 1
  var target = 40
  var indexfound = -1
  while (left <= right) {
    var mid = left + (right - left) / 2
    if (l(mid) == target) {
      indexfound = mid
      scala.util.control.Break
    }
    else if (l(mid) < target) {
      left = mid + 1
    }
    else {
      right = mid - 1
    }
  }
  if (indexfound != -1) {
    println(s"Target found at index: $indexfound")
  } else {
    println("Target not found")
  }


}