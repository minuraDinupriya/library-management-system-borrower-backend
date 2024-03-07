package org.example.controller;

import org.apache.catalina.User;
import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class BorrowerController {
    @Autowired
    BorrowerService borrowerService;
    @GetMapping("/borrowers")
    public List<BorrowerDto> getBorrowers(){
        return borrowerService.getBorrowers();
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody BorrowerDto borrower){
        borrowerService.addBorrower(borrower);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return borrowerService.deleteBorrower(id)?ResponseEntity.ok("Deleted"):ResponseEntity.notFound().build();
    }

    @PostMapping("/find-by-username/{userName}")
    public BorrowerDto findBorrower(@PathVariable String userName){
        return borrowerService.findBorrower(userName);
    }
    @PostMapping("/is-existing-user/{userName}")
    public Boolean isExistingUser(@PathVariable String userName){
        return borrowerService.isExistingUser(userName);
    }

}
