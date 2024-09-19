package com.eragapati.modulith.modulith_demo.api.service;

import com.eragapati.modulith.modulith_demo.common.InterestCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RefundInterestService {

    private final InterestCalculator interestCalculator;

    public Mono<String> getSomething() {

        return interestCalculator.calculateInterest()
                .flatMap(data -> Mono.just(Double.toString(data)));
    }
}
