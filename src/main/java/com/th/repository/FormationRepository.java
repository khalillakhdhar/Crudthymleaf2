package com.th.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
List<Formation> findByTitreOrPrix(String titre,double prix,Pageable pageable);
Page<Formation> findAll(Pageable pageable);
}
