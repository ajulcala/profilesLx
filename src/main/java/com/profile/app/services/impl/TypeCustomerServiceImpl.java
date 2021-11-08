package com.profile.app.services.impl;

import com.profile.app.models.dao.TypeCustomerDao;
import com.profile.app.models.documents.SubType;
import com.profile.app.models.documents.TypeCustomer;
import com.profile.app.services.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    TypeCustomerDao dao;

    @Autowired
    SubTypeServiceImpl subTypeServiceImpl;

    @Override
    public Mono<TypeCustomer> create(TypeCustomer typeCustomer) {
        return dao.save(typeCustomer);
    }

    @Override
    public Flux<TypeCustomer> findAll() {
        return dao.findAll();
    }

    @Override
    public Mono<TypeCustomer> findById(String id) {
        return dao.findById(id);
    }

    @Override
    public Mono<TypeCustomer> update(TypeCustomer typeCustomer) {
        return dao.save(typeCustomer);
    }

    @Override
    public Mono<Boolean> delete(String id) {
        return dao.findById(id)
                .flatMap(tc -> dao.delete(tc)
                        .then(Mono.just(Boolean.TRUE)))
                .defaultIfEmpty(Boolean.FALSE);
    }

    @Override
    public Mono<SubType> checkSubType(String id) {
        return subTypeServiceImpl.findById(id);
    }
}
