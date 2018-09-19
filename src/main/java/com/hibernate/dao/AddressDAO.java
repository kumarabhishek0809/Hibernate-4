package com.hibernate.dao;

import com.hibernate.domain.Address;

import java.util.Set;

public interface AddressDAO {
    void saveAddress(Set<Address> addresses);
}
