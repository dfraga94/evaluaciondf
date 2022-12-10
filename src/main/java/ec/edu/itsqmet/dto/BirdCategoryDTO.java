package ec.edu.itsqmet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "bird_category")
public class BirdCategoryDTO {

	@Id
	private Integer id;
	private String name;

}
