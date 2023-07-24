package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Address not found"));
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Address existingAddress = getAddressById(id);
        existingAddress.setLandmark(updatedAddress.getLandmark());
        existingAddress.setZipcode(updatedAddress.getZipcode());
        existingAddress.setDistrict(updatedAddress.getDistrict());
        existingAddress.setState(updatedAddress.getState());
        existingAddress.setCountry(updatedAddress.getCountry());
        return addressRepository.save(existingAddress);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}