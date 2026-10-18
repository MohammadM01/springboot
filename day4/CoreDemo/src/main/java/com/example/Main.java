package com.example;

import com.example.notification.EmailService;
import com.example.notification.NotificationService;
import com.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Hello World");
        NotificationService notification = new SmsService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
