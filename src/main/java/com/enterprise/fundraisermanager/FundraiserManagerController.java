package com.enterprise.fundraisermanager;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.service.IFundraiserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FundraiserManagerController {

    IFundraiserService fundraiserService;

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return start page
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @GetMapping("/fundraiser")
    @ResponseBody
    public List<Fundraiser> fetchAllFundraisers() {
        return fundraiserService.fetchAll();
    }

    @GetMapping("/fundraiser/{id}/")
    public ResponseEntity fetchFundraiserByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/fundraiser", consumes="application/json", produces = "application/json")
    public Fundraiser createFundraiser(@RequestBody Fundraiser fundraiser) {
        Fundraiser newFundraiser = null;
        try {
            newFundraiser = fundraiserService.save(fundraiser);
        }catch (Exception e) {
            //TODO add logging
        }
        return newFundraiser;
    }

    @DeleteMapping("/fundraiser/{id}/")
    public ResponseEntity deleteFundraiser(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }


}