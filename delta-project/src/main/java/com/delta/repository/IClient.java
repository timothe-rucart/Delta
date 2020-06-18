package com.delta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delta.model.Client;

@Repository
public interface IClient extends JpaRepository<Client, Integer>{

}
