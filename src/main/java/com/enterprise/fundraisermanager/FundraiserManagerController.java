package com.enterprise.fundraisermanager;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FundraiserManagerController {

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return start page
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @GetMapping("/fundraiser")
    public ResponseEntity fetchAllFundraisers() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/fundraiser/{id}/")
    public ResponseEntity fetchFundraiserByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/fundraiser", consumes="application/json", produces = "application/json")
    public Fundraiser createFundraiser(@RequestBody Fundraiser fundraiser) {
        return fundraiser;
    }

    @DeleteMapping("/fundraiser/{id}/")
    public ResponseEntity deleteFundraiser(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }


}
