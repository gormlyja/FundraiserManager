package com.enterprise.fundraisermanager;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.User;
import com.enterprise.fundraisermanager.service.IFundraiserService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String index(Model model){
        Fundraiser fundraiser= new Fundraiser();
        fundraiser.setName("Girls Scout Cookies");
        fundraiser.setDescription("These are cookies sold by the girl's scout");
        fundraiser.setTotalFundraised(3050.00);
        fundraiser.setId(1003);
        model.addAttribute(fundraiser);
        return "start";
    }

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

    @GetMapping("/fundraiser")
    @ResponseBody
    public List<Fundraiser> fetchAllFundraisers() {
        return fundraiserService.fetchAll();
    }

    @GetMapping("/fundraiser/{id}/")
    public ResponseEntity fetchFundraiserByID(@PathVariable("id") Integer id) {
        Fundraiser foundFundraiser = fundraiserService.fetchById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundFundraiser, headers, HttpStatus.OK);
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
    public ResponseEntity deleteFundraiser(@PathVariable("id") Integer id) {
        try {
            fundraiserService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            //TODO confirm correct response in catch, or modify it to be correct response.
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fundraisers")
    public ResponseEntity searchFundraisers(@RequestParam(value = "searchTerm", required = false, defaultValue = "None") String searchTerm) {
        String newSearchTerm = searchTerm + " ";
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Handle the members endpoint and return the members page.
     * @return members page
     */
    @RequestMapping("/members")
    public String members(){

        return "members";
    }

    @RequestMapping("/tiers")
    public String saveTiers() {
        //TODO: Create TierService
        return "tiers";
    }

    @RequestMapping("/users")
    public String users(Model model) {
        User user = new User();
        user.setUserId(0);
        user.setUsername("JDoe1");
        user.setPassword("password1");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmailAddress("JDoe@gmail.com");
        model.addAttribute(user);
        return "users";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) {

        return "users";
    }
}