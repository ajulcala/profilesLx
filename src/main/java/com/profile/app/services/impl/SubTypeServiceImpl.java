package com.profile.app.services.impl;

import com.profile.app.models.dao.SubTypeDao;
import com.profile.app.models.documents.SubType;
import com.profile.app.services.SubTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Slf4j
@Service
public class SubTypeServiceImpl implements SubTypeService {
    @Autowired
    SubTypeDao dao;
    @Override
    public Mono<SubType> create(SubType subType) {
        log.info("subtype guardado");
        return dao.save(subType);
    }

    @Override
    public Flux<SubType> findAll() {
        return dao.findAll();
    }

    @Override
    public Mono<SubType> findById(String id) {
        log.info("buscando subtype por id");
        return dao.findById(id);
    }

    @Override
    public Mono<SubType> update(SubType subType) {
        log.info("actualizando subtype");
        return dao.save(subType);
    }

    @Override
    public Mono<Boolean> delete(String id) {
        log.info("eliminando subtype");
        return dao.findById(id)
                .flatMap(st -> dao.delete(st).then(Mono.just(Boolean.TRUE))
                ).defaultIfEmpty(Boolean.FALSE);
    }
}
