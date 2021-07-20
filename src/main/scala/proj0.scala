 import scala.io.StdIn._
object proj0 {
  def main(args: Array[String]): Unit = {
  var name = readLine("Enter your name:  ")
    println("Enter your current bank statement: ")
    var bank_st = readLong()
    println("Enter your Credit Score: ")
    var credit_score = readInt()
    println("Enter your monthly income: ")
    var monthly_income = readLong()
    println("Enter your monthly expenses: ")
    var monthly_expenses  = readLong()
    println("Enter the Loan amount you to borrow: ")
    var loanAmt = readLong()
    var DI = DI_ratio(monthly_expenses, monthly_income)
    var Req = reqInfo(loanAmt,DI,bank_st,credit_score)
}
def DI_ratio (monthly_expenses:Long, monthly_income:Long):Float ={
  var DoI = monthly_expenses/monthly_income
  return DoI
}
  def reqInfo(loanAmt:Long, DoI:Float,bank_st:Long, credit_score:Int) {

  val rDownPayment = 0.15*loanAmt
   val reqBankB = rDownPayment + (0.04*loanAmt)
   val reqDE = 0.50
   val reqCS = 700 

   if (credit_score < reqCS){
     println("Your credit score is lower than required")}
     else if(DoI > reqDE){
       println("Your income is lower than required")}
       else if(bank_st < reqBankB){
         println("Please try for lower Loan Amount")
       }
else{
  println("Congratulation you are PRE-QUALIFIED. Schedule your appointment with us for next step")
}
     }
   }
