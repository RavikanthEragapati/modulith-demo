package com.eragapati.modulith.modulith_demo.common;

import reactor.core.publisher.Mono;

public interface InterestCalculator {
    Mono<Double> calculateInterest();
}
