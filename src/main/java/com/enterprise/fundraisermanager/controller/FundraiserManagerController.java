package com.enterprise.fundraisermanager.controller;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.service.IFundraiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
/**
 * This class is in charge of sending all incoming requests to the appropriate service and method. The controller sends the response back to the requester once the response data is ready.
 * The Fundraiser Management Application includes features such as displaying all fundraisers, adding new fundraisers, changing fundraiser details, removing fundraisers, and searching for fundraisers.
 * @author .
 */
@Controller
public class FundraiserManagerController {
    @Autowired
    IFundraiserService fundraiserService;

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return start page
     */
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("Fundraiser", fundraiserService.fetchAll());
        return "start";
    }

    /**
     * Saves fundraiser to database.
     * @param fundraiser
     * @return start page
     */
    @RequestMapping("/saveFundraiser")
    public String saveFundraiser(Fundraiser fundraiser){
        try {
            fundraiserService.save(fundraiser);
        } catch (Exception e) {
            e.printStackTrace();
            return "start";
        }
        return "start";
    }

    /**
     * Get all information regarding the fundraiser
     * @param id
     * @return all information regarding the fundraiser
     */
    @GetMapping("/fundraiser/{id}/")
    public ResponseEntity fetchFundraiserByID(@PathVariable("id") Integer id) {
        Fundraiser foundFundraiser = fundraiserService.fetchById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundFundraiser, headers, HttpStatus.OK);
    }

    /**
     * Create a new fundraiser
     * @param fundraiser
     * @return new fundraiser object
     */
    @PostMapping(value="/fundraiser", consumes="application/json", produces = "application/json")
    public Fundraiser createFundraiser(@RequestBody Fundraiser fundraiser) {
        Fundraiser newFundraiser = null;
        try {
            newFundraiser = fundraiserService.save(fundraiser);
        }catch (Exception e) {
        }
        return newFundraiser;
    }

    /**
     * Delete a fundraiser
     * @param id
     * @return fundraisers that don't include the one that was removed
     */
    @DeleteMapping("/fundraiser/{id}/")
    public ResponseEntity deleteFundraiser(@PathVariable("id") Integer id) {
        try {
            fundraiserService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Search for a fundraiser.
     * @param searchTerm
     * @return all fundraisers similar to the search word that was typed into the search box.
     */
    @GetMapping(value="/fundraisers", consumes="application/json", produces="application/json")
    public ResponseEntity searchFundraisers(@RequestParam(value = "searchTerm", required = false, defaultValue = "None") String searchTerm) {
        List<Fundraiser>fundraisers= fundraiserService.fetchAll(searchTerm);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(fundraisers, headers, HttpStatus.OK);

    }
    @GetMapping("/fundraisers")
    public String searchFundraisersForm(@RequestParam(value="searchTerm", required=false, defaultValue="None")  String searchTerm, Model model) {
        List<Fundraiser>fundraisers= fundraiserService.fetchAll(searchTerm);
        model.addAttribute("fundraisers", fundraisers);
        return "fundraisers";

    }
    /**
     * Handle the members endpoint and return the members page.
     * @return members page
     */
    @RequestMapping("/members")
    public String members(){

        return "members";
    }
}