package com.kosta.helloworld;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClazzRepository extends CrudRepository<Clazz, Long> {
}
