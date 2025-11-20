package com.nit.elc;

	class PermanentEmployee extends EmployeeDemo{
		protected double providentfund;

		public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
			super(employeeId, employeeName, employeeSalary);
			this.providentfund = (super.EmployeeSalary*0.12);
		}
        public void netSalary(){
        	this.providentfund = this.providentfund+EmployeeSalary; 
//        	System.out.println(Netsal);
        }
		@Override
		public String toString() {
			return "PermanentEmployee [employeeid = "+super.EmployeeId+", employee Name="+super.EmployeeName+", employee "
					+ "Salry="+super.EmployeeSalary+" providentfund=" + this.providentfund + " Net Salary is :"+this.providentfund+"]";
		}
		
        
        
		}
	
	
	
