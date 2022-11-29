package pl.coderslab.charity.service;

import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

public class InstitutionServiceImpl implements InstitutionService{
private final InstitutionRepository institutionRepository;

    public InstitutionServiceImpl(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @Override
    public List<Institution> getAll() {
        return institutionRepository.findAll();
    }
}
