package com.profile.app.models.dao;

import com.profile.app.models.documents.SubType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SubTypeDao extends ReactiveMongoRepository<SubType, String> {
}
