package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.shinysneakers.domain.House;

public interface HouseRepository extends JpaRepository<House, Long>{

}
