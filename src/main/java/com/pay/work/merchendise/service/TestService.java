package com.pay.work.merchendise.service;

import com.pay.work.merchendise.model.Address;
import com.pay.work.merchendise.model.Merchant;
import com.pay.work.merchendise.repository.AddressRepository;
import com.pay.work.merchendise.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    MerchantRepository merchantRepository;

    @RequestMapping("/insert")
    public void insert(){
        Address address = new Address();
        address.setAddressId(1L);
        address.setFlatNumber("B307");
        address.setApartmentName("Electra Tower");
        address.setState("3rd Cross");
        address.setLocality("Park Avenue");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setCountry("India");
        address.setPinCode(560048);

        Merchant merchant = new Merchant();
        merchant.setMerchantId(10001L);
        merchant.setAddress(address);
        merchant.setEmailId("raviranjan@gmail.com");
        merchant.setMerchantName("Ravi Enterprise");
        merchant.setPhoneNumber(9845428327L);

        address.setMerchant(merchant);

        merchantRepository.save(merchant);
    }
}
