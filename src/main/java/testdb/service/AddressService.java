package testdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testdb.entity.Address;
import testdb.repository.AddressRepository;

/**
 * Created by Admin on 20.06.2019.
 */
@Service
public class AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public void createAddress(Address address){
        addressRepository.save(address);
    }
}
