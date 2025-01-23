object assignment_1 {
  def main(args: Array[String]): Unit = {
//      ques1:
//     Check for Even AND Positive Number:
//    #Write a Scala function to check if a given number is both even and positive.
//    #Sample Data:
//    #Number: 14
//
//      var num = 14
//      if(num%2==0 && num>=0){
//        print("Number is even and positive")
//      }
//      else{
//        print("number is not even")
//      }
//
//      2)Range Check with OR:
//
//        Create a Scala program to determine if a given value is either less than -10 or greater than 10.
//
//      Sample Data:
//
//        Value: -15
//
//      var num = -15
//      if(num < -10 || num>10){
//        print("Valid number")
//      }
//      else{
//        print("Invalid number")
//      }
//
//      3)Odd Number Check with AND:
//
//        Implement a Scala function to check if a given number is odd and not divisible by 3.
//
//      Sample Data:
//
//        Number: 27
//
//      var num = 27
//      if(num%2 != 0 && num%3 != 0){
//        print("valid number")
//      }
//      else{
//        print("invalid")
//      }
//
//      4)Divisibility by 4 OR 6:
//
//        Write a Scala program to check if a given number is divisible by either 4 or 6.
//
//      Sample Data:
//
//        Number: 18
//
//      var num = 18
//      if(num % 4 == 0 || num%6 ==0){
//        print("Valid number")
//      }
//      else{
//        print("invalid")
//      }
//
//      5)Eligibility for Voting OR Driving:
//
//        Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
//        eligible to drive (age greater than or equal to 16).
//
//        Sample Data:
//
//        Age: 20
//
//
//    val num= 20
//    if(num>=18){
//      print("Eligible to vote") }
//
//    else if(num >=16){
//      print("elibile to drive")
//    }
//
//    6)Multiple Range Check:
//
//      Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
//
//    Sample Data:
//
//      Number: 25
//
//    val num = 25
//    if(num>=1 && num<=10){
//      print("number within range[1,10]")}
//    else if(num>=20 && num<=30) {
//      print("number within range[20,30]")}
//    else{
//        print("number out of range")
//      }
//
//
//    7)Check for Negative AND Odd Number:
//
//      Implement a Scala program to check if a given number is both negative and odd.
//
//    Sample Data:
//
//      Number: -7
//
//val num = -7
//if(num%2 !=0 && num<0){
//  print("Number is negative and odd number")
//}
//
//
//    8)Eligibility for Senior Discount OR Student Discount:
//
//      Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
//    60) or a student discount (age less than 25).
//
//
//val num = 63
//if(num>60){
//  print("eligible for citizen discount")
//}
//else if(num<25){
//  print("eligible for student discount")
//}
//
//    9)Divisibility by 5 AND 7:
//      Write a Scala function to check if a given number is divisible by both 5 and 7.
//
//    Sample Data:
//
//      Number: 35
//
//   val num=35
//    if(num%5==0 && num%7==0){
//      print("divisible by 5 and 7")}
//    else{
//      print("not divisible")
//    }
//
//
//    10)Check for Non-Negative OR Even Number:
//
//      Create a Scala program to check if a given number is either non-negative or even.
//
//      Sample Data:
//
//      Number: -8
//
//  val num = -8
//  if(num>0 || num%2==0){
//    print("number is non negative or even")
//  }
//
//
//
//    11)Check for Prime AND Odd Number:
//
//      Write a Scala function to check if a given number is both a prime number and an odd number.
//
//    Sample Data:
//
//      Number: 17
//
//    var count=0
//    var num = 17
//    for(i<-1 to 17){
//      if(num%i==0){
//        count=count+1
//      }
//    }
//
//    if(count==2){
//      print("prime number")
//    }
//    else{
//      print("not a prime number")
//    }
////
//    12)Eligibility for Discount OR Free Shipping:
//
//      Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//      than 150) or qualifies for free shipping (purchase amount greater than 100).
//      Sample Data:
//      Purchase Amount: 120
//
//    val num= 120
//    if(num>150){
//      print("eligible for discount")
//    }
//   else if(num>100){
//     print("qulaifies for free shipping")
//   }
//
//    13)Divisibility by 3 OR 8:
//
//      Write a Scala function to check if a given number is divisible by either 3 or 8.
//    Sample Data:
//      Number: 24
//
//    val num = 24
//    if(num%3==0 || num%8==0){
//      print("divisible by 3 0r 8")
//    }
//
//    14)Check for Non-Positive AND Even Number:
//
//      Implement a Scala program to check if a given number is both non-positive and even.
//
//      Sample Data:
//
//      Number: -6
//
//    val num = -6
//    if(num<0 && num%2==0){
//      print("number is non-positive and even")
//    }
//
//    15)Age Group Classification with AND:
//
//      Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
//    teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
//
//      Sample Data:
//
//      Age: 15
//
//    var age=15
//    if(age<13){
//      print("child")
//    }
//    else if (age>= 13 && age<=19){
//      print("teenager")
//    }
//    else if (age== 20 || age>20){
//      print("adult")
//    }
//
//    16)Check for Divisibility by 2 OR 5:
//
//      Write a Scala function to check if a given number is divisible by either 2 or 5.
//
//    Sample Data:
//
//      Number: 25
//
//    var num = 25
//    if(num%2==0 || num%5==0){
//      print("divisible by 2 and 5")
//    }
//
//    17)Eligibility for Senior Discount AND Student Discount:
//
//      Create a Scala program to check if a person is eligible for both a senior citizen discount (age greater
//      than 60) and a student discount (age less than 25).
//
//    Sample Data:
//
//      Age: 70
//
//    val age = 70
//    if(age>60){
//      print("eligible for both discount")
//    }
//    else if(age<25){
//      print("eligibe for studemt discount")
//    }
//
//    19)Check for Multiple of 3 AND 7:
//
//      Implement a Scala function to check if a given number is both a multiple of 3 and 7.
//
//    Sample Data:
//
//      Number: 21
//
//    val num = 21
//    if(num%3==0 && num%7 ==0){
//      print("given number is multiple of 3 and 7")
//    }
//
//    20)Divisibility by 5 OR 9:
//
//      Write a Scala program to check if a given number is divisible by either 5 or 9.
//
//    Sample Data:
//
//      Number: 45
//
//    val num = 45
//    if(num%5 == 0 || num%9 == 0){
//      print("divisible by 5 or 9")
//    }
//
//
//    21)Check for Odd AND Not Divisible by 4:
//
//      Create a Scala program to check if a given number is both odd and not divisible by 4.
//
//    Sample Data:
//
//      Number: 15
//
//    val num = 15
//    if(num%2!=0 && num%4!=0){
//      print("odd and not dicvisible by 4")
//    }
//
//    22)Check for Divisibility by 3 AND 5:
//
//      Write a Scala function to check if a given number is divisible by both 3 and 5.
//
//    Sample Data:
//
//      Number: 15
//
//    var num = 15
//    if(num%3==0 && num%5==0){
//      print("divisible by 3 and 5")
//    }
//
//    23)Eligibility for Discount OR Membership Benefits:
//
//      Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//      than 200) or qualifies for membership benefits (loyalty card available).
//
//    Purchase Amount: 180
//
//    Loyalty Card: true
//
//    val num=180
//    val LoyaltyCard = true
//    if(num>200 || LoyaltyCard==true){
//      print("eligible for discount or qualifies membershilp")
//    }
//
//
//    24)Divisibility by 2 OR 3:
//      Write a Scala function to check if a given number is divisible by either 2 or 3.
//
//    Sample Data:
//
//      Number: 9
//
//    val num=9
//    if(num%2==0 || num%3==0){
//      print("divisible by 2 or 3")
//    }
//
//    25)Check for Positive AND Not Divisible by 3:
//
//      Implement a Scala program to check if a given number is positive and not divisible by 3.
//
//    Sample Data:
//      Number: 7
//
//
//    val num = 7
//    if(num>0 && num%3!=0){
//      print("number is positive and not divisible by 3")
//    }
//
//    26)Eligibility for Senior Discount AND Not a New Customer:
//
//      Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
//    65) and is not a new customer.
//
//    Sample Data:
//
//      Age: 70
//
//    New Customer: false
//
//    val Age= 70
//    val NewCustomer= false
//    if(Age>65 && NewCustomer==false){
//      print("eligible for citizen discount and not a new cust")
//    }
//
//    27)Check for Odd OR Prime Number:
//
//      Write a Scala function to check if a given number is either odd or a prime number.
//
//    Sample Data:
//
//      Number: 11
//
//
//    28)Eligibility for Discount AND Free Shipping:
//
//      Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//      than 150) and qualifies for free shipping (purchase amount greater than 100).
//
//      Sample Data:
//
//    29)Check for Non-Negative AND Not Divisible by 7:
//
//      Implement a Scala program to check if a given number is non-negative and not divisible by 7.
//
//    Sample Data:
//
//      Number: 14
//
//    30)Eligibility for Student Discount OR Free Trial:
//
//      Write a Scala program to check if a person is eligible for a student discount (age less than 25) or is
//      eligible for a free trial.
//
//      Sample Data:
//
//      Age: 22
//
//    val num = 22
//    val FreeTrial= true
//    if(num<=25 || FreeTrial == true){
//      print("eligible for student discount or free trial")}
//
//
//
//    Free Trial: true
//
//    Sample Data:
//
//      31)Check for Divisibility by 4 OR 6:
//
//      Create a Scala function to check if a given number is divisible by either 4 or 6.
//    val num = 24
//    if(num%4==0 || num%6==0){
//      print("divisible by 4 or 6")
//    }

//    var a = "karthik"
//    print(a(0))



  }
}
