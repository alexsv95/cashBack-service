package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateUnderLimit() {
        //A-A-A
        // A - arrage (подготовка)
        CashBackService service = new CashBackService();
        // A - Act (выполнение целевого действия)
        int cashBack = service.calculate(1_000);
        // A - Assert (проверка)
        assertEquals(50, cashBack);
    }

    @Test
    void calculateOverLimit() {
        //A-A-A
        // A - arrage (подготовка)
        CashBackService service = new CashBackService();
        // A - Act (выполнение целевого действия)
        int cashBack = service.calculate(1_000_000);
        // A - Assert (проверка)
        assertEquals(3_000, cashBack);
    }
}