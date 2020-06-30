package com.luis.pereira.panquecasdafamilia.repository;

import com.luis.pereira.panquecasdafamilia.model.PancakeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PancakeRepository extends CrudRepository<PancakeEntity, Long> {}
