package com.eragapati.modulith.modulith_demo.common.service;

import com.eragapati.modulith.modulith_demo.common.InterestCalculator;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class InterestCalculatorImpl implements InterestCalculator {

    @Override
    public Mono<Double> calculateInterest() {
        return Mono.just(10.26);
    }
}
