package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.example.dto.BorrowerDto;
import org.example.dto.LogInDto;
import org.example.entity.Borrower;
import org.example.service.BorrowerService;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
public class BorrowerController {
    @Autowired
    BorrowerService borrowerService;
    private final LoginService loginService;

    @GetMapping("/borrowers")
    public List<BorrowerDto> getBorrowers(){
        return borrowerService.getBorrowers();
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody BorrowerDto borrower){
        borrowerService.addBorrower(borrower);
        loginService.addLoginDetails(new LogInDto(borrower.getUserName(),borrower.getPassword()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return borrowerService.deleteBorrower(id)?ResponseEntity.ok("Deleted"):ResponseEntity.notFound().build();
    }

    @GetMapping("/find-by-username/{userName}")
    public BorrowerDto findBorrower(@PathVariable String userName){
        return borrowerService.findBorrower(userName);
    }
    @GetMapping("/is-existing-user/{userName}")
    public Boolean isExistingUser(@PathVariable String userName){
        return borrowerService.isExistingUser(userName);
    }

}
