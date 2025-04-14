package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.model.Address;
import com.s.d.Library_Management_System.requestdto.AddressDto;

public class AddressConverter {
    public static Address addressConverter(AddressDto addressDto){
        Address address = new Address();

        address.setHouseNo(addressDto.getHouseNo());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setPincode(address.getPincode());

        return address;
    }
}
