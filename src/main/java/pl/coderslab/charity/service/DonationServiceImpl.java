package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService{

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }


    @Override
    public void saveDonation(Donation donation) {
        donationRepository.save(donation);
    }
}
