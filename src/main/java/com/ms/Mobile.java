package com.ms;

public class Mobile {
	
		 SimJio sim=new SimJio("9887766566");
	
		public void makeCall() {
			sim1.call();
		}
		public void sendMsg() {
					sim.msg();
				}
		SimJio sim1=new SimJio("98800000");
		public static void main(String[] gg) {
			Mobile m=new Mobile();
			

			m.makeCall();
			m.sendMsg();
		}
}
