package com.example.model.DAO;

import com.example.model.entity.Estado;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.data.repository.PageableRepository;

public interface  estadosDAO extends CrudRepository<Estado, Integer> {
}
