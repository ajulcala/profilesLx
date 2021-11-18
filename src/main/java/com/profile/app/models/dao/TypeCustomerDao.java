package com.profile.app.models.dao;

import com.profile.app.models.documents.TypeCustomer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * * My <b>interface</b>.
 * aqui se configura la queries de mongo para las consultas
 *
 * @TypeCustomer annotation
 */
public interface TypeCustomerDao extends ReactiveMongoRepository<TypeCustomer, String> {
}
