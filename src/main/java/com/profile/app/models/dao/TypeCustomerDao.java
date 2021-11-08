package com.profile.app.models.dao;

import com.profile.app.models.documents.TypeCustomer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TypeCustomerDao extends ReactiveMongoRepository<TypeCustomer, String> {
}
