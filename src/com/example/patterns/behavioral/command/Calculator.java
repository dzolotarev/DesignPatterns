package com.example.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", (x, y) -> processor.multiply(x, y));
        operationMap.put("/", (x, y) -> processor.divide(x, y));
    }

    public void calculate(int operand1, String action, int operand2) {
        Operation operation = operationMap.get(action);
        if (Objects.isNull(operation)) {
            throw new IllegalStateException("no operation registered for '" + action + "'");
        }
        operation.execute(operand1, operand2);
    }
}
