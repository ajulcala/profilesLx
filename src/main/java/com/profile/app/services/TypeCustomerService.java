package com.profile.app.services;

import com.profile.app.models.documents.SubType;
import com.profile.app.models.documents.TypeCustomer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * * My <b>interface</b>.
 * estructura de los metodos usados en el controller
 *
 * @TypeCustomer annotation
 */
public interface TypeCustomerService {
  public Mono<TypeCustomer> create(TypeCustomer typeCustomer);

  public Flux<TypeCustomer> findAll();

  public Mono<TypeCustomer> findById(String id);

  public Mono<TypeCustomer> update(TypeCustomer typeCustomer);

  public Mono<Boolean> delete(String id);

  public Mono<SubType> checkSubType(String id);
}
