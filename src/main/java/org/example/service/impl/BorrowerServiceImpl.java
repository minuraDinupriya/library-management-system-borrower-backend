package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;
import org.example.repository.BorrowerRepository;
import org.example.service.BorrowerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    @Autowired
    private BorrowerRepository borrowerRepository;
    ModelMapper modelMapper;
    @Bean
    public void setUp(){
        this.modelMapper=new ModelMapper();
    }
    @Override
    public List<BorrowerDto> getBorrowers() {
        Iterable<Borrower> borrowerIterable = borrowerRepository.findAll();
        List<BorrowerDto> borrowerDtoList=new ArrayList<>();
        for (Borrower borrower: borrowerIterable){
            borrowerDtoList.add(modelMapper.map(borrower, BorrowerDto.class));
        }

        return borrowerDtoList;
    }
}
