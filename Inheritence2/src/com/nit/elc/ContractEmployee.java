package com.nit.elc;

public class ContractEmployee extends EmployeeDemo{
	protected int contractDuration;

	public ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeid = "+super.EmployeeId+", employee Name="+super.EmployeeName+", employee "
				+ "Salry="+super.EmployeeSalary+" contractDuration=" + this.contractDuration + "]";
	}

	

	

	
}
