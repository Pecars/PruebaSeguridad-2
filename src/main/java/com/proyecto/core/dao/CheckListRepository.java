package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.CheckListEntity;


@Repository
public interface CheckListRepository extends CrudRepository<CheckListEntity, Integer> {

}
