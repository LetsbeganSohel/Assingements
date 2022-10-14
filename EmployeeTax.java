package com.cognizant.tax;

class CalculateTax{
 float BasicSlary;
 boolean citizenship;
 float tax;
 float nettSalary;
 void Calculatetax(float BasicSlary) {
	 tax = tax+  (30* (BasicSlary/100));
	 System.out.println(" The Tax of the employee  for  the   " +BasicSlary+"   " + tax); 
 }
   void  DeductTax( float BasicSlary) {
	    nettSalary =BasicSlary-tax;
	    System.out.println(" The nettsalary is :"  + nettSalary);
   }
void  ValidSalary(float BasicSlary) {
	  
		 if(BasicSlary<100000) {
			System.out.println("The salary and citizenship eligibility:   false");
		 }
		 else {
			 System.out.println("The salary and citizenship eligibility:  true");
		 }
   }
}
public class EmployeeTax{
	public static void main(String[] args) {
		 CalculateTax Tc = new   CalculateTax();
		 Tc.Calculatetax(25000);
		 Tc.DeductTax(25000);
		 Tc.ValidSalary(25000);
		 System.out.println(" Take  a another object");
		 CalculateTax Tc2 = new   CalculateTax();
		 Tc.Calculatetax(125000);
		 Tc.DeductTax(125000);
		 Tc.ValidSalary(125000);
	}
}

