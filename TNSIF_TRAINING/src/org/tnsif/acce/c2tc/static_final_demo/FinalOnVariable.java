package org.tnsif.acce.c2tc.static_final_demo;

class UpiApp {
    // final variable → cannot be reassigned
    final int max_Daily_limit = 100000;

    void showLimit() {
        System.out.println("Daily transfer limit : " + max_Daily_limit);
    }
}

public class FinalOnVariable {
    public static void main(String[] args) {
        UpiApp app = new UpiApp();
        app.showLimit();

        // ❌ Not allowed: app.max_Daily_limit = 500000;
        // ✅ Instead, just display or use the existing value
        System.out.println("Attempting to change limit is not allowed because it's final.");
    }
}