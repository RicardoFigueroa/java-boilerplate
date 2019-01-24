package com.ckinan.service;

import com.ckinan.model.Person;
import com.ckinan.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoilerplateServiceImpl implements BoilerplateService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPerson(long id) {
        return personRepository.findById(id);
    }

}
