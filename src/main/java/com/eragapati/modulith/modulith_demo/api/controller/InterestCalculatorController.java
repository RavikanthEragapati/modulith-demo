package com.eragapati.modulith.modulith_demo.api.controller;

import com.eragapati.modulith.modulith_demo.api.service.RefundInterestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class InterestCalculatorController {

    private final RefundInterestService refundInterestService;

    @GetMapping("/int")
    public Mono<ResponseEntity<String>> getRefundAmt() {
        return refundInterestService.getSomething().map(data -> new ResponseEntity(Mono.just(data), HttpStatusCode.valueOf(200)));
    }
}
