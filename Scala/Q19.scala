import scala.util.control.Breaks._
object Sample {
    def main(args: Array[String]) {
        var num1: Int = 0
        print("Enter number1: ")
        num1 = scala.io.StdIn.readInt()
        var num2 = 2
        var check = 1
        //need to import breaks imp
        breakable {
            while (num2 <= Math.sqrt(num1)) {
                if (num1 % num2 == 0) {
                    println("Not a prime no")
                    check = 0
                    break
                }
                num2 += 1
            }
        }
        if (check == 1) println("Prime no")
    }
}