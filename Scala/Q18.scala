object Sample {
    def main(args: Array[String]) {
        var num1: Int = 0
        print("Enter number1: ")
        num1 = scala.io.StdIn.readInt()
        var num2 = num1
        num1 = 0
        while (num2 > 0) {
            num1 = num1 * 10 + num2 % 10
            num2 /= 10
        }
        while (num1 > 0) {
            num1 % 10 match {
                case 1 => print("one ")
                case 2 => print("two ")
                case 3 => print("three ")
                case 4 => print("four ")
                case 5 => print("five ")
                case 6 => print("six ")
                case 7 => print("seven ")
                case 8 => print("eight ")
                case 9 => print("nine ")
            }
            num1 /= 10;
        }
    }
}