package com.enterprise.fundraisermanager;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.service.IFundraiserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FundraiserManagerApplicationTests {

    @Autowired
    private IFundraiserService fundraiserService;
    private Fundraiser fundraiser;

    @Test
    void contextLoads() {
    }

    @Test
    void fetchFundraiserByID_returnsCookieSaleForID12345(){
        givenFundraiserDataAreAvailable();
        whenSearchFundraiserWithID12345();
        thenReturnOneCookieSaleForId12345();
    }

    private void givenFundraiserDataAreAvailable() {
    }

    private void whenSearchFundraiserWithID12345() {
        fundraiser = fundraiserService.fetchById(12345);
    }

    private void thenReturnOneCookieSaleForId12345() {
        String description = fundraiser.getDescription();
        assertEquals("Girl Scout Cookie Fundraiser", description);
    }

}