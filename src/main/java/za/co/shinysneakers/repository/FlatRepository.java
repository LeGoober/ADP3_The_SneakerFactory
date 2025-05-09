package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.shinysneakers.domain.Flat;

public interface FlatRepository extends JpaRepository<Flat, Long>{

    
}