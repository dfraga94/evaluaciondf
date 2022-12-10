package ec.edu.itsqmet.singleton;

import java.util.List;

import ec.edu.itsqmet.dto.BirdCategoryDTO;
import ec.edu.itsqmet.services.IBirdCategoryServices;

public class BirdCategorySingleton {

	private static BirdCategorySingleton instance;
	private static List<BirdCategoryDTO> birdscategory;

	private BirdCategorySingleton() {
	};

	public static List<BirdCategoryDTO> getBirds(IBirdCategoryServices birdCategory) {

		if (birdscategory == null) {
			birdscategory = birdCategory.getAll();
		}
		return birdscategory;
	}

	public BirdCategorySingleton getInstance() {
		if (instance == null) {
			instance = new BirdCategorySingleton();
		}
		return instance;
	}

}
