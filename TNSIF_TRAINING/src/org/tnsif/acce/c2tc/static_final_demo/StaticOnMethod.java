package org.tnsif.acce.c2tc.static_final_demo;

class PaymentMethod
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Bank : SBI, HDFC ,ICIC , Axis");
	}
}
public class StaticOnMethod {

	public static void main(String[] args) {
		PaymentMethod.showSupportedBanks();
	}

}