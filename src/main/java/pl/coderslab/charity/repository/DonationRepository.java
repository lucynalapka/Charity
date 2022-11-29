package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.model.Donation;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface DonationRepository extends JpaRepository<Donation, Long> {


   List<Donation> findAll();

    @Query("SELECT SUM(quantity) FROM Donation")
    Long countQuantitySum();

    @Query("select count(id) from Donation")
    Integer countAllById();

}
