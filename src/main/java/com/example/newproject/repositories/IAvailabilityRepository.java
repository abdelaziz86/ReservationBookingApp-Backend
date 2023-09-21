package com.example.newproject.repositories;

import com.example.newproject.entities.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAvailabilityRepository extends JpaRepository<Availability,Integer> {
}
