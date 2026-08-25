package com.baozistore.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baozistore.baozi_store.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}