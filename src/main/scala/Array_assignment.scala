object Array_assignment {
  def main(args: Array[String]): Unit = {

//    Array Questions:
//
//      1. Sum of Array Elements
//    Write a program to find the sum of all elements in an integer array.
//    Input: [1, 2, 3, 4, 5]
//    Output: 15
//    var l = Array(1,2,3,4,5)
//    var a = l.length-1
//    var sum=0
//    for(i<-0 to a){
//      sum=sum+l(i)
//    }
//    print(sum)


//
//    2. Maximum and Minimum in Array
//      Find the maximum and minimum values in an array.
//      Input: [3, 5, 7, 2, 8]
//    Output: Max: 8, Min: 2

//    var l = Array(3, 5, 7, 2, 8)
//    var a = l.length-1
//    var max = l(0)
//    var min = l(0)
//
//    for(i<-1 to a) {
//      if (max < l(i)) {
//        max = l(i)
//      }
//      else if(min>l(i)){
//        min=l(i)
//      }
//
//    }
//    println(max)
//    println(min)

//
//    3. Reverse an Array
//      Write a program to reverse the elements of an array.
//    Input: [1, 2, 3, 4, 5]
//    Output: [5, 4, 3, 2, 1]
//    var l = Array(1, 2, 3, 4, 5)
//    for(i<- l.length-1 to 0 by -1){
//      print(l(i))
//    }
//
//    4. Search Element in Array
//    Check if a given number exists in the array. Return its index if found, otherwise return -1.
//    Input: [10, 20, 30, 40], Search: 30
//    Output: 2

    var l = Array(10,20,30,40)
    var search = 30
    for(i<-0 to l.length-1){
      if(l(i)==search){
        print(i)
      }
      }


//
//
//    5. Sort an Array
//      Write a program to sort an array in ascending order.
//    Input: [5, 3, 8, 6, 2]
//    Output: [2, 3, 5, 6, 8]
//
//    6. Remove Duplicates from Array
//    Remove all duplicates from a given array.
//      Input: [1, 2, 2, 3, 4, 4, 5]
//    Output: [1, 2, 3, 4, 5]
//
//    7. Second Largest Element
//      Find the second largest element in an array.
//    Input: [12, 35, 1, 10, 34, 1]
//    Output: 34
//
//    8. Left Rotate an Array
//    Rotate an array to the left by k positions.
//      Input: [1, 2, 3, 4, 5], k=2
//    Output: [3, 4, 5, 1, 2]
//
//    9. Find Pair with Given Sum
//      Find a pair of elements in an array whose sum equals a given number.
//    Input: [1, 4, 6, 8], Target: 10
//    Output: (4, 6)
//
//    10. Count Even and Odd Numbers
//      Count the number of even and odd elements in an array.
//      Input: [2, 5, 6, 9, 10]
//    Output: Even: 3, Odd: 2
//
//    String Questions:
//
//      11. Palindrome Check
//    Check whether a given string is a palindrome or not.
//    Input: "madam"
//    Output: True
//
//    12. Reverse a String
//      Write a program to reverse a string.
//      Input: "hello"
//    Output: "olleh"

//  var s = "hello"
//  for(i<-s.length()-1 to 0 by -1) {
//    print(s(i))
//  }
//
//    13. Count Vowels and Consonants
//    Count the number of vowels and consonants in a string.
//    Input: "programming"
//    Output: Vowels: 3, Consonants: 8


//    var vcount=0
//    var ccount=0
//    var s = "programming"
//    var l = s.length -1
//    for(i<-0 to l){
//
//      if(s(i)== 'e'||s(i)== 'o' ||s(i)== 'u' ||s(i)== 'a'||s(i)== 'i'){
//      vcount= vcount+1
//      }
//      else{
//        ccount=ccount+1
//      }
//
//    }
//    println(s"vcount:$vcount,ccount:$ccount")


//    14. Check Anagram
//    Check if two strings are anagrams of each other.
//      Input: "listen", "silent"
//    Output: True
//
//    15. Find Duplicate Characters in String
//      Write a program to find duplicate characters in a string.
//    Input: "programming"
//    Output: ['r', 'g', 'm']
//
//    16. Longest Word in a Sentence
//      Find the longest word in a given sentence.
//    Input: "I love programming"
//    Output: "programming"
//
//    17. Character Frequency Count
//      Count the frequency of each character in a string.
//      Input: "hello"
//    Output: {h:1, e:1, l:2, o:1}
//
//    18. Convert String to Title Case
//      Convert the first letter of each word in a string to uppercase.
//    Input: "hello world"
//    Output: "Hello World"
//
//    19. Remove Spaces from String
//    Remove all spaces from a string.
//    Input: "I love Python"
//    Output: "IlovePython"
//
//    20. Find Substring
//    Check if a given substring exists in a string.
//      Input: "hello world", Substring: "world"
//    Output: True
//
//    Lowercase and Uppercase Related Questions:
//
//      1. Convert String to Uppercase
//    Write a program to convert all characters in a string to uppercase.
//    Input: "hello world"
//    Output: "HELLO WORLD"
//
//    2. Convert String to Lowercase
//    Write a program to convert all characters in a string to lowercase.
//    Input: "HELLO WORLD"
//    Output: "hello world"
//
//    3. Check if String is Uppercase
//    Write a program to check if a given string is completely in uppercase.
//      Input: "HELLO"
//    Output: True
//    4. Check if String is Lowercase
//    Write a program to check if a given string is completely in lowercase.
//      Input: "hello"
//    Output: True
//
//    5. Toggle Case of String
//    Convert uppercase letters to lowercase and vice versa for a given string.
//      Input: "HeLLo WoRLD"
//    Output: "hElIO wOrld"
//
//    6. Capitalize First Letter of Each Word
//    Write a program to capitalize the first letter of each word in a string.
//    Input: "hello world"
//    Output: "Hello World"
//
//    7. Count Uppercase and Lowercase Letters
//      Write a program to count the number of uppercase and lowercase letters in a string.
//      Input: "HeLLo WoRLD"
//    Output: Uppercase: 6, Lowercase: 4
//
//    8. Find All Uppercase Characters in String
//    Extract all uppercase characters from a string.
//      Input: "HeLLo WoRLD"
//    Output: ['H', 'L', 'L', 'W', 'R', 'L', 'D']
//    9. Find All Lowercase Characters in String
//    Extract all lowercase characters from a string.
//      Input: "HeLLo WoRLD"
//    Output: ['e', 'o', 'o']
//
//    10. Convert Uppercase to Lowercase and Vice Versa
//      Write a program that takes a string and converts uppercase letters to lowercase and
//      lowercase letters to uppercase.
//    Input: "Python Programming"
//    Output: "pYTHON pROGRAMMING"
//
//    Concatenation Related Questions:
//
//      11. Concatenate Two Strings
//        Write a program to concatenate two strings.
//      Input: "Hello", "World"
//    Output: "HelloWorld"
//
//    12. Concatenate Strings with Space
//    Concatenate two strings with a space between them.
//    Input: "Hello", "World"
//    Output: "Hello World"
//
//    13. Concatenate Multiple Strings
//      Write a program to concatenate multiple strings from a list.
//    Input: ["Data", "Engineering", "with", "Python"]
//    Output: "DataEngineeringwithPython"
//
//    14. Join Strings Using a Delimiter
//      Concatenate strings from a list using a delimiter (e.g., comma, hyphen).
//      Input: ["Data", "Engineering", "Python"], Delimiter: "-"
//    Output: "Data-Engineering-Python"
//
//    15. Add a Suffix to a String
//    Write a program to add a specific suffix to a string.
//      Input: "Engineer", Suffix: "ing"
//    Output: "Engineering"
//
//    16. Add a Prefix to a String
//    Write a program to add a specific prefix to a string.
//      Input: "Tech", Prefix: "Info"
//    Output: "InfoTech"
//
//    17. Interleave Two Strings
//      Write a program to merge two strings character by character.
//    Input: "abc", "123"
//    Output: "a1b2c3"
//
//    18. Concatenate Alternating Characters of Two Strings
//    Write a program to concatenate alternating characters of two strings.
//    Input: "abcdef", "123"
//    Output: "a1b2c3def"
//
//    19. Concatenate Strings Repeatedly
//      Concatenate a string n times.
//      Input: "Hello", n=3
//    Output: "HelloHelloHello"
//
//    20. Find Longest Concatenated String
//    Given a list of strings, find the longest concatenated string by combining any two strings.
//    Input: ["abc", "def", "ghij"]
//    Output: "defghij"
//
//    Combination Questions (Lowercase, Uppercase, and Concatenation):
//
//      21. Concatenate and Convert to Uppercase
//        Write a program to concatenate two strings and convert the result to uppercase.
//      Input: "hello", "world"
//    Output: "HELLOWORLD"
//
//    22. Concatenate Strings After Lowercase Conversion
//      Concatenate two strings after converting both to lowercase.
//    Input: "Hello", "World"
//    Output: "helloworld"

//    23. Check if Concatenated String Contains Only Uppercase
//    Check if the concatenated result of two strings contains only uppercase letters.
//    Input: "HELLO", "WORLD123"
//    Output: False
//
//    Output: False
//
//    24. Concatenate and Capitalize
//      Concatenate two strings and capitalize the first letter of the resulting string.
//    Input: "python", "programming"
//    Output: "Pythonprogramming"
//
//    25. Concatenate Alternating Uppercase and Lowercase Letters
//    Concatenate two strings such that characters from the first string are uppercase, and
//    characters from the second string are lowercase.
//      Input: "abc", "DEF"
//    Output: "ABCdef"
  }
}
