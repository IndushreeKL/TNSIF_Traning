package org.tnsif.acce.c2tc.static_final_demo;

class Bank {
    final void security_Rule() {
        System.out.println("Follow KYC and OTP verification");
    }
}

class SBI extends Bank {
    // ❌ Cannot override security_Rule() because it's final
    // ✅ Instead, create a new method
    void additionalSecurity() {
        System.out.println("No need of KYC, just OTP");
    }
}

public class FinalOnMethod {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.security_Rule();       // Calls the final method from Bank
        sbi.additionalSecurity();  // Calls SBI’s own method
    }
}