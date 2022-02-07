# Fundraiser Manager

## Introduction

For the IT4045 Final Project, our group decided to make a fundraiser manager. The fundraiser manager allows organizers to set up an online space for their fundraiser. This allows any participants the ability to see information about a fundraiser, compare how much they have sold compared to other participants, and see if / how many rewards they qualify    for from the organizers. Organizers are able to edit information about their fundraiser, establish rewards / reward tiers, and edit members and member information.
 
## Storyboard
[Storyboard link](https://projects.invisionapp.com/prototype/ckz1rgk2l001sz5011jn42gmr/play)
 
## Requirements
 As a user, I want to be able to see information about a fundraiser so that I can compare how much they have sold compared to other participants and see if / how many rewards they qualify for from the organizers. 
 
 Example 1 
<br>Given: A feed of fundraiser data are available 
<br>When: The user searches for a particular fundraiser (recognizable name)
<br>Then: The fundraiser app will return any results and save in view list


Example 2 
<br>Given: Fundraiser data available 
<br>When: The user searches for “aaofdnoas” (not recognizable text)
<br>Then: The fundraiser app will not return any results and not save in view list 


Example 3 
<br>Given: The fundraiser app saved user’s searched fundraiser  
When: The User clicks and views the fundraiser
<br>Then: The user will see how much they have sold compared to other participants


Example 4 
<br>Given: The fundraiser app saved user’s searched fundraiser  
When: The User clicks and views the fundraiser
<br>Then: The user will see how many rewards they qualify for from the organizers


Example 5 
<br>Given: The user has previous fundraisers in the view list 
<br>When: Some of the previous fundraisers have expired 
<br>Then: The user can select expired fundraiser and click delete button to remove from the view list.  
## Class Diagram
 ![Class Diagram](https://github.com/gormlyja/FundraiserManager/blob/main/Capture.JPG)
 
### Class Diagram Description
IFundraiserEntryService - Interface declaring all necessary methods for FundraiserEntry related functionality.
<br>FundraiserEntryService - Contains implementation for all mentods in IFundraiserEntryService
<br>FundraiserEntryServiceStub - Implements IFundraiserEntryService's methods with hardcoded return values for initial ui development
<br>FundraiserEntry - carries FundraiserEntry data between processes
<br>IFundraiserEntryDAO - Interface declaring the methods needed for FundraiserEntry's data access object
<br>FundraiserEntryDAO - Implements IFundraiserEntryDAO allowing access to FundraiserEntry records in the database
## JSON Schema
This is what we plan to export to another app.

>{
>    "fundraiser": {
>        "id": "123456",
>        "title": "Girl Scout Cookie Sale",
>        "username": "sampleusername",
>        "description": "Fundraiser description",
>        "imageURL": "Sample URL"
>    }}
 
## Roles
 
Devops/Product Owner/Scrum Master/GitHub Admin: Jacob Gormly <br>
UI Specialist: Rahul Shakya and Binod Dahl <br>
Business Logic / Persistence: Amin Vedant and Juan Lopez Rosado

## Project Link
https://github.com/gormlyja/FundraiserManager/projects/1

<br><br>*As a group, we have decided to meet Mondays at 6PM using Discord.*
