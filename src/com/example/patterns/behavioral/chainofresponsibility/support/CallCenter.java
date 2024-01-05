package com.example.patterns.behavioral.chainofresponsibility.support;

public class CallCenter extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(завис|зависло|глючит|глюк|тормозит|лагает|ничего не понимаю|спасити).*")) {
            System.out.println("\t+ Спокойный как удав оператор колл-центра помог решить проблему.");
        } else {
            System.out.println("\t- Операторы колл-центра не смогли решить вопрос.");
            passAlongTheChain(problem);
        }
    }
}
