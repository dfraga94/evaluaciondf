package ec.edu.itsqmet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.dto.BirdCategoryDTO;

public interface IBirdCategoryRepository extends JpaRepository<BirdCategoryDTO, Integer> {

}
