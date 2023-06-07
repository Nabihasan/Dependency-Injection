package com.ms;

public class SimJio {
	
		private String no;
		public  SimJio(String no) {
			this.no=no;
		}
		
		public void call() {
			System.out.println("call with jio "+no);
		}
		public void msg() {
			System.out.println("msg with jio "+no);
		}
}
