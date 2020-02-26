package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
    List<Whisky> findByYear(int year);
    List<Whisky> findByDistilleryNameAndAge(String name, int age);
    List<Whisky> findByDistilleryRegion(String region);

    List<Whisky> findWhiskiesFromYear(int year);
    List<Whisky> findWhiskiesFromParticularDistilleryOfAge(String name, int age);
    List<Whisky> whiskiesFromRegion(String region);


}
