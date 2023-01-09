//package pl.coderslab.charity.service.serviceImpl;
//
//
//
//
//import org.springframework.stereotype.Service;
//import pl.coderslab.charity.model.Institution;
//import pl.coderslab.charity.repository.InstitutionRepository;
//
//import java.util.List;
//@Service
//public class InstitutionServiceImpl {
//private final InstitutionRepository institutionRepository;
//
//    public InstitutionServiceImpl(InstitutionRepository institutionRepository) {
//        this.institutionRepository = institutionRepository;
//    }
//
//    public List<Institution> getAll() {
//        return institutionRepository.findAll();
//    }
//
//    public void deleteInstitutionById(Long id) {
//        institutionRepository.deleteInstitutionById(id);
//    }
//    void add(Institution institution){
//        institutionRepository.save(institution);
//    }
//    void update(Institution institution){
//        institutionRepository.save(institution);
//    };
//}
