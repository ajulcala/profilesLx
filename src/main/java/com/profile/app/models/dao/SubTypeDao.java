package com.profile.app.models.dao;

import com.profile.app.models.documents.SubType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * * My <b>interface</b>.
 * aqui se configura la queries de mongo para las consultas
 *
 * @Subtype annotation
 */
public interface SubTypeDao extends ReactiveMongoRepository<SubType, String> {
}
