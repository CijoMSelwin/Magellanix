Feature: Country Select as France and Ui Verification


Scenario Outline: Country Select with Value France(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=fr
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Nom de famille
And Assert magellanixContactEmail
And Verify magellanixemailLabel Adresse e-mail
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Numéro de téléphone
And Verify magellanixaddressLabel Adresse – Ligne 1
And Assert magellanixCity
And Verify magellanixcityLabel Ville
And Verify magellanixzipLabel Code postal 
And Assert magellanixCountry
And Verify magellanixcountryLabel Pays
And Assert magellanixResume
And Verify magellanixresumeLabel CV
#And Assert cust_InstrDiversityText
And Assert magellanixGender
And Verify magellanixgenderLabel <genderlabel>
And Assert FRagreeToCareerOppurtunityText
And Assert FRagreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|
|FR|Prénom|Quel est votre genre ?|


#2
Scenario Outline: Country Select with Value German(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=de
Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Nachname 
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-Mail 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefonnummer 
And Verify magellanixaddressLabel Straße und Hausnummer
And Assert magellanixCity
And Verify magellanixcityLabel Stadt
And Verify magellanixzipLabel Postleitzahl
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel Lebenslauf / CV
#And Assert cust_InstrDiversityText
And Assert GerManyagreeToCareerOppurtunityText
And Assert GRagreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|
|DE|Vorname|Quel est votre genre ?|



#3
Scenario Outline: Country Select with Value Spain(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=nl
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Achternaam 
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-mail
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefoonnummer  
And Verify magellanixaddressLabel Adresregel 1
And Assert magellanixCity
And Verify magellanixcityLabel Stad 
And Verify magellanixzipLabel Postcode
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel CV
#And Assert cust_InstrDiversityText
And Assert NLagreeToCareerOppurtunityText
And Assert NLagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|genderlabel|
|DE|Voornaam|Quel est votre genre ?|


#4
Scenario Outline: Country Select with Value spain(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=es
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Apellido
And Assert magellanixContactEmail
And Verify magellanixemailLabel Correo Electrónico 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Nº Teléfono de Contacto 
And Verify magellanixaddressLabel Dirección
And Assert magellanixCity
And Verify magellanixcityLabel Ciudad 
And Verify magellanixzipLabel Código postal 
And Assert magellanixCountry
And Verify magellanixcountryLabel País 
And Assert magellanixResume
And Verify magellanixresumeLabel CV
#And Assert cust_InstrDiversityText
And Assert ESagreeToCareerOppurtunityText
And Assert ESagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|
|DE|Nombre de pila|




#5
Scenario Outline: Country Select with Value SV(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=sv
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Efternamn
And Assert magellanixContactEmail
And Verify magellanixemailLabel Mailadress 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefonnummer
And Verify magellanixaddressLabel Adressrad 1 
And Assert magellanixCity
And Verify magellanixcityLabel Ort  
And Verify magellanixzipLabel Postnummer
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel Meritförteckning/CV
#And Assert cust_InstrDiversityText
And Assert SVagreeToCareerOppurtunityText
And Assert SVagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|
|DE|Förnamn|



#6
Scenario Outline: Country Select with Value NB(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=nb
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Etternavn
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-post 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefonnummer 
And Verify magellanixaddressLabel Adresselinje 1  
And Assert magellanixCity
And Verify magellanixcityLabel Sted   
And Verify magellanixzipLabel Postnummer 
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel CV 
#And Assert cust_InstrDiversityText
And Assert NBagreeToCareerOppurtunityText
And Assert NBagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|
|DE|Fornavn|



#7
Scenario Outline: Country Select with Value Iceland(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=is-IS
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Eftirnafn
And Assert magellanixContactEmail
And Verify magellanixemailLabel Netfang
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Símanúmer 
And Verify magellanixaddressLabel Heimilsfang 
And Assert magellanixCity
And Verify magellanixcityLabel Staður    
And Verify magellanixzipLabel Póstnúmer 
And Assert magellanixCountry
And Verify magellanixcountryLabel Land 
And Assert magellanixResume
And Verify magellanixresumeLabel Ferilskrá 
#And Assert cust_InstrDiversityText
And Assert ISagreeToCareerOppurtunityText
And Assert ISagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|
|DE|Nafn|
