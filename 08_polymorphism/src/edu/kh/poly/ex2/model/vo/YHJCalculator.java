package edu.kh.poly.ex2.model.vo;

public class YHJCalculator implements Calculator{

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 + num2);
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1-num2);
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1*num2);
	}

	@Override
	public double divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1/num2);
	}

	@Override
	public double areaOfCircle(double r) {
		// TODO Auto-generated method stub
		return (r*r*PI); // Calculator.PI;
	}

	@Override
	public double pow(double a, int b) {
		double result = 1;
		for(int i = 1; i<=b; i++) {
		 result *= a ;} // result = result *a;
		// Math.pow(a,b) 거듭제곱
		return result;
					}
					

					
				
	}

	

