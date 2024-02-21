package org.example.controller;

import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BorrowerController {
    @Autowired
    BorrowerService borrowerService;
    @GetMapping("/borrowers")
    public List<BorrowerDto> getBorrowers(){
        return borrowerService.getBorrowers();
    }
}
