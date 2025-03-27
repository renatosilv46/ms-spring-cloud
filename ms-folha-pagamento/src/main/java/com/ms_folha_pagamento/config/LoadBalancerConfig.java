//package com.ms_folha_pagamento.config;
//
//import com.ms_folha_pagamento.infra.CustomServiceInstance;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.core.publisher.Flux;
//
//import java.util.List;
//
//@Configuration
//@LoadBalancerClient(name = "ms-recursos-humanos", configuration = LoadBalancerConfig.class)
//public class LoadBalancerConfig {
//    @Bean
//    public ServiceInstanceListSupplier serviceInstanceListSupplier() {
//        return new ServiceInstanceListSupplier() {
//            @Override
//            public String getServiceId() {
//                return "ms-recursos-humanos";
//            }
//
//            @Override
//            public Flux<List<ServiceInstance>> get() {
//                return Flux.just(List.of(
//                        new CustomServiceInstance("localhost", 8001),
//                        new CustomServiceInstance("localhost", 8080)
//                ));
//            }
//        };
//    }
//}
