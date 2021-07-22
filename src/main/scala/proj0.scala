 import scala.io.StdIn._
import org.apache.orc.impl.mask.DoubleIdentity
object proj0 {
  def main(args: Array[String]): Unit = {
  println("Enter your name:  ")
    var name =readLine()
    println("Enter your age: ")
    var age = readInt()
    println("Enter your current bank statement: ")
    var bank_st = readLong()
    println("Enter your Credit Score: ")
    var credit_score = readInt()
    println("Enter your monthly income: ")
    var monthly_income = readLong()
    println("Enter your monthly payments including rent,credit cards, loans and mortgage: ")
    var monthly_payments  = readLong()
    println("Enter the loan amount you want to borrow: ")
    var loanAmt = readLong()

    var DI = DI_ratio(monthly_payments, monthly_income)
    
    var Req = reqInfo(loanAmt,DI,bank_st,credit_score)
}
def DI_ratio (monthly_payments:Long, monthly_income:Long):Float ={
  var DoI = monthly_payments/monthly_income.toFloat

  return DoI
}
  def reqInfo(loanAmt:Long,DoI:Float,bank_st:Long, credit_score:Int) {

  var rDownPayment = 0.20*loanAmt
  var reqBankB = rDownPayment + (0.05*loanAmt)
  var reqDE = 0.42
  var reqCS = 700 
  var checknbal = DoI
    
    if (checknbal > reqDE){
     println("YOUR INCOME IS LOWER THAN REQUIRED")}

      else if(bank_st < reqBankB ){
  
         println("PLEASE TRY FOR A LOWER LOAN AMOUNT")}
        
         else if(credit_score < reqCS){
       
          println("YOUR CREDIT SCORE IS LOWER THAN REQUIRED")}
       else{
  println("CONGRATULATIONS YOU ARE PRE-QUALIFIED. SCHEDULE AN APPOINTMENT WITH US FOR NEXT STEP")
}
     }
    }
   