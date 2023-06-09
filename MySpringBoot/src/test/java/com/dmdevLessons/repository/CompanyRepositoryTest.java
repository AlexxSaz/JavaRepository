package com.dmdevLessons.repository;

import com.dmdevLessons.IntegrationTestBase;
import com.dmdevLessons.entity.CompanyEntity;import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CompanyRepositoryTest extends IntegrationTestBase {

    private  static final  Integer APPLE_ID=1;

    @Autowired
    private CompanyRepository companyRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetById(){
        Optional<CompanyEntity> company = companyRepository.findById(APPLE_ID);
        assertTrue(company.isPresent());
        company.ifPresent(entity->{
            assertEquals("Apple", entity.getName());
        });
    }

    @Test
    void testSave(){
        CompanyEntity company = CompanyEntity.builder()
                .name("AlexSaz")
                .build();
        companyRepository.save(company);
        assertNotNull(company.getId());
    }
}