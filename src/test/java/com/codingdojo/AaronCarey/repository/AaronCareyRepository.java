package com.codingdojo.AaronCarey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.AaronCarey.models.Admin;


@Repository
public interface AaronCareyRepository extends CrudRepository<Admin, Long> {
	Admin findById();
}
