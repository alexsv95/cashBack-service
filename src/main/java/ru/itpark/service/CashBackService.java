package ru.itpark.service;

public class CashBackService {
    public int calculate (int costs) {
        int limit = 3_000;
        int result = costs * 5 / 100;
        if (result > limit) {
            return limit;
        }

        return result;
    }
}
