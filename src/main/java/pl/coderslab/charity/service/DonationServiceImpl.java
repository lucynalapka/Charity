package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;

@Service
public class DonationServiceImpl implements DonationService{

    private final DonationService donationService;

    public DonationServiceImpl(DonationService donationService) {
        this.donationService = donationService;
    }

    @Override
    public void saveDonation(Donation donation) {
        donationService.saveDonation(donation);
    }
}
