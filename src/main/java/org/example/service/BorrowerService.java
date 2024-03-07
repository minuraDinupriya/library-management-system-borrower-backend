package org.example.service;

import org.apache.catalina.User;
import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;

import java.util.List;

public interface BorrowerService {
    public List<BorrowerDto> getBorrowers();

    boolean deleteBorrower(Long id);

    void addBorrower(BorrowerDto borrower);
    BorrowerDto findBorrower(String userName);

    Boolean isExistingUser(String userName);
}
