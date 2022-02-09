package com.enterprise.fundraisermanager;

import com.enterprise.fundraisermanager.dao.IFundraiserDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.service.FundraiserServiceStub;
import com.enterprise.fundraisermanager.service.IFundraiserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@SpringBootTest
class FundraiserManagerApplicationTests {


    private IFundraiserService fundraiserService;
    private Fundraiser fundraiser = new Fundraiser();

    @MockBean
    private IFundraiserDAO fundraiserDAO;

    @Test
    void contextLoads() {
    }

    @Test
    void fetchFundraiserByID_returnsCookieSaleForID12345() throws Exception{
        givenFundraiserDataAreAvailable();
        whenFundraiser12345AddedIsCookieSale();
        whenSearchFundraiserWithID12345();
        thenReturnOneCookieSaleForId12345();
    }

    private void whenFundraiser12345AddedIsCookieSale() {
        Fundraiser Troop451CookieSale = new Fundraiser();
        Troop451CookieSale.setId(12345);
        Troop451CookieSale.setDescription("Girl Scout Cookie Fundraiser for Troop 451");
        Mockito.when(fundraiserDAO.fetch(12345)).thenReturn(Troop451CookieSale);
    }

    private void givenFundraiserDataAreAvailable() throws Exception{
        Mockito.when(fundraiserDAO.save(fundraiser)).thenReturn(fundraiser);
        fundraiserService = new FundraiserServiceStub(fundraiserDAO);
    }

    private void whenSearchFundraiserWithID12345() {
        fundraiser = fundraiserService.fetchById(12345);
    }

    private void thenReturnOneCookieSaleForId12345() {
        String description = fundraiser.getDescription();
        assertEquals("Girl Scout Cookie Fundraiser", description);
    }

    @Test
    void saveFundraiser_validateReturnFundraiserWithNameAndDescription() throws Exception {
        givenFundraiserDataAreAvailable();
        whenUserCreatesANewFundraiserAndSaves();
        thenCreateNewFundraiserRecordAndReturnIt();
    }

    private void whenUserCreatesANewFundraiserAndSaves() {
        fundraiser.setName("Elementary School Fundraiser");
        fundraiser.setDescription("Citytown School District's third and fourth grade fundraiser.");
    }

    private void thenCreateNewFundraiserRecordAndReturnIt() throws Exception{
        Fundraiser createdFundraiser = fundraiserService.save(fundraiser);
        assertEquals(fundraiser, createdFundraiser);
        verify(fundraiserDAO, atLeastOnce()).save(fundraiser);
    }

}