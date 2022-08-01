object Question01 {
  def main(args: Array[String]): Unit = {
    //Develop the function of interest. It consumes a deposit amount and produces the actual
    //amount of interest that the money earns in a year. The bank pays a flat 2% for deposits
    //of up to Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per
    //year for deposits of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs.
    //200000.
    var Interest:Double=0
    def FindInterest(i: Double): Unit = {
        if(i<=20000){
            Interest=i*2.0/100
        }
        else if(i<=200000){
          Interest=i*4.0/100
        }
        else if(i<=2000000){
          Interest=i*3.5/100
        }
      else{
          Interest=i*6.5/100
        }
    }

    FindInterest(5000000)
    println("Interest :"+Interest)

  }
}

object Question02 {
  def main(args: Array[String]): Unit = {
/*
Write a program in PatternMatching, takes the integer input from the command line. Based
on the input, write a code using match to print Negative/Zero is input when input is less than or
equal to 0.Print Even number is given when input is even, and print Odd number is given when
input is odd.
*/
    println("Enter a Number :")
    var number=scala.io.StdIn.readInt()

    def Input(x:Int):Unit= x match {
      case y :Int if x<=0 => println("Negative/Zero Number")
      case y :Int if x%2==0 =>println("Even Number")
      case y :Int if x%2!=0 =>println("Odd Number")
    }
    Input(number)
  }
}

object Question03 {
  def main(args: Array[String]): Unit = {
    /*
Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output.
 Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String.
This particular function will be used to apply the given
format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
“Kumara”, and make sure that the output is as shown below.

Output:
BENNY
NIroshan
saman
KumarA
 */

  def toUpper(x:String):String={
    return (x.toUpperCase())

  }
    def toLower(x:String):String={
      return(x.toLowerCase())
    }

    def formatNames(f:String=>String,x:String): Unit ={
      val Str=f(x)
      print(Str)
    }
    formatNames(toUpper,"Benny ")
    println()
    formatNames(toUpper,"Niroshan ".slice(0,2))
    formatNames(toLower,"Niroshan ".slice(2,8))
    println()
    formatNames(toLower,"Saman ".slice(0,6))
    println()
    formatNames(toUpper,"Kumara ".slice(0,1))
    formatNames(toLower,"Kumara ".slice(1,5))
    formatNames(toUpper,"Kumara ".slice(5,6))


  }
}