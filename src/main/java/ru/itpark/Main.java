package ru.itpark;

import ru.itpark.service.CashBackService;

public class Main {
    public static void main(String[] args) {
        CashBackService service = new CashBackService();
        int cashBack = service.calculate(1_000);
        System.out.println(cashBack);
    }
}
