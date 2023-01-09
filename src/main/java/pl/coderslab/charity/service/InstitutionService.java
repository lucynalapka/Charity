package pl.coderslab.charity.service;


import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;


import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@Service
public class InstitutionService {

//public interface InstitutionService {

//    List<Institution> getAll();
//    void deleteInstitutionById(Long id);
//    Long getId();
//    public Optional<Institution> get(Long id);
//
//    void update(Institution institution);
//    void add(Institution institution);

    private final InstitutionRepository institutionRepository;

    public InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }


    public List<Institution> getAll() {
        return institutionRepository.findAll();
    }

    public void deleteInstitutionById(Long id) {
        institutionRepository.deleteInstitutionById(id);
    }
  public void add(Institution institution){
        institutionRepository.save(institution);
    }
    public void update(Institution institution){
        institutionRepository.save(institution);
    }

//    public Long getId() {;
//    }
}
