package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;


import java.io.IOException;
import java.util.List;

public interface IEventDao {

    List<Fundraiser> fetchFundraisers(String combinedName) throws IOException;
}
