package ec.edu.itsqmet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.dto.BirdCategoryDTO;
import ec.edu.itsqmet.repository.IBirdCategoryRepository;
import ec.edu.itsqmet.services.IBirdCategoryServices;

@Service
public class BirdCategoryServiceImpl implements IBirdCategoryServices {

	@Autowired
	private IBirdCategoryRepository categoryRepository;

	@Override
	public List<BirdCategoryDTO> getAll() {
		// TODO Auto-generated method stub
		List<BirdCategoryDTO> result = categoryRepository.findAll();
		return result;
	}

}
