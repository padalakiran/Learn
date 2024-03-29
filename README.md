> [!note]
> All Files Are build and Run By using Online/local Environment Change According to Your Environment
## Learn
Repository Consist of Both Java and Python Files which Answers For the Questions using Java and Python</br>
And Some MySQL Commands will be there in the Repository
</br>
Codes Covered in the repository given below</br>
## Bubble Sort
$\color{blue}{Bubble\ Sort}$:- it is a sorting technique used to sort list/array By iterarting and comparing through each element time complexity will be O(n^2)</br>
Java File:- [Bubble Sort](Java/BubbleSort.java)</br>
Python File:- [Bubble Sort](Python/BubbleSort.py)

## Reverse Array
To reverse list we can use two methods those are using slicing or swaping elements</br>
 $\color{blue}{1.\ By\ using\ Slicing}$   :- in slicing we use list[::-1] which can reverse list</br>
 $\color{blue}{2.\ By\ swaping\ Elements}$ :- in swaping Elements we can run loop by half of length of array
                          and we can simply Swap array by swaping the elements by fist with 
                          last element.</br>
Java File:- [Reverse Array](Java/Reversearray.java)</br>
Python File:- [Reverse Array](Python/ReverseArray.py)

## Binary Search
For binary Search We need</br> 
$\color{blue}{1.Sorted Array}$     :- We are Going to Sort Array using Sorting techniques like bubble sort, quick sort etc..,
                       for large sixe array mostly we use quick sort which has o(logn) time complexity</br>
$\color{blue}{2.BinarySearch logic}$:- After Sorting Array we need to find mid using formula and then check weather mid element
                       is equal to our target element if it equal to mid then return mid or it check elif condition
                       which is mid element is grater or lesser than the target element if mid element grater than target
                       it will check first part or it will check second part of array like using range of (0,mid-1)
                       or (mid,length(array)-1)</br>
Above logic can be implimented using two ways which is loops/Recurssion But Recurssion will be more efficiant</br>
Java File:- [Binary Search](Java/binarysearch.java)</br>
Python File:- [Binary Search](Python/BinarySearch.py)</br>

## Amstrong Number
 $\color{blue}{Amstrong\ Number}$ :- The number which sum of power of each digit with number of digis equal to the origina number</br>
                     Example:- 153= 1**3+5**3+3**3
                                  = 1+125+27
                                  =153 : hence it is a amstrong Number</br>
Java File:- [Amstrong Number](Java/Amstrong.java)</br>
Python File:- [Amstrong Number](Python/Amstrong.py)</br>

## Palindrome
$\color{blue}{Palindrome}$:- if a string mean to be Palindromewhich reverse of string is equal to original string</br>
              Example:- madam==madam (palindrome)
              asdc != cdsa(not a palindrome)</br>
Java File:- [Palindrome](Java/Palindrome.java)</br>
Python File:- [Palindrome](Python/Palindrome.py)</br>

## Second Largest Element In Data
$\color{blue}{Second\ Largest\ Element}$ :- We Can get Second largest data by setting the table in assending order then use the limit function
limit Syntax of a limit will be limit a,b which a refers to Skip a rows and print b rows.</br>
MySQL File:- [Sencond large Element](MySQL/Second_large_element.sql)</br>

## WiggleSort
$\color{blue}{Wiggle\ Sort}$:- odd index numbers should always greater than equal to
               previous numburs and even index numbers should always
                less than equal to next index numbers</br>
For wigglesort we do iterate through array and swaping numbers</br>
Java File:- [Wiggle Sort](Java/WiggleSort.java)</br>
Python File:- [Wiggle Sort](Python/wigglesort.py)</br>


## SQL Joins
A JOIN clause is used to combine rows from two or more tables, based on a related column between them.</br>
[Inner Join](MySQL/Innerjoin.sql):- Returns records that have matching values in both tables</br>
[Left Join](MySQL/LeftJoin.sql):- Returns all records from the left table, and the matched records from the right table</br>
[Right Join](MySQL/RightJoin.sql):- Returns all records from the right table, and the matched records from the left table</br>
[Full Join](MySQL/FullJoin.sql):- Returns all records when there is a match in either left or right table</br>

## String Comparison
Compare two Strings word to word and returns the extra element which does not present another string</br>
Java File:- [StringComparison](Java/StringComparison.java)</br>
Python File:- [StringComparison](Java/StringComparison.py)</br>
## Error Handling
Error Handling refers to the process of detecting, managing, and resolving errors and exceptions that occur during data processing and analytics. and it rersolves using try, Except block.</br>
Java File:- [ErrorHandling](Java/TryException.java)</br>
Python File:- [ErrorHandling](Java/TryException.py)</br>
## ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want</br>
Java File:- [ArrayList](Java/Arraylists.java)</br>
## HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package</br>
Java File:- [HashSet](Java/Hashsets.java)</br>
## HashMap
