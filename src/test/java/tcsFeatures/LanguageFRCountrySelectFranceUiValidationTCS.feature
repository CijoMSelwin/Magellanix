Feature: Country Select as France and Ui Verification


Scenario Outline: Country Select with Value France(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=fr
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Nom de famille
And Assert magellanixContactEmail
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Numéro de téléphone
And Assert magellanixCity
And Verify magellanixcityLabel Ville
And Assert magellanixCountry
And Verify magellanixcountryLabel Pays
And Assert magellanixResume
And Verify magellanixresumeLabel CV
And Verify SubmitLabel Choisissez
And Assert custom_InstrDiversityText <customText>
And Assert magellanixGender
And Verify magellanixgenderLabel <genderlabel>
And Assert FRagreeToCareerOppurtunityText
And Assert FRagreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|customText|
|FR|Prénom|Quel est votre genre ?|CCEP s'engage à attirer, former et conserver un effectif diversifié et ouvert, en veillant à offrir des opportunités égales à tous les candidats|


#2
Scenario Outline: Country Select with Value German(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=de
Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Nachname 
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-Mail 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefonnummer 
And Assert magellanixCity
And Verify magellanixcityLabel Stadt
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel Lebenslauf / CV
And Verify SubmitLabel Auswahl 
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert GerManyagreeToCareerOppurtunityText
And Assert GRagreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|customText|
|DE|Vorname|Quel est votre genre ?|CCEP hat sich dazu verpflichtet, eine vielfältige Belegschaft zu gewinnen, zu fördern und an sich zu binden.|



#3
Scenario Outline: Country Select with Value Spain(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=nl
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Achternaam 
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-mail
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefoonnummer  

And Assert magellanixCity
And Verify magellanixcityLabel Stad 
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel CV
And Verify SubmitLabel Kies
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert NLagreeToCareerOppurtunityText
And Assert NLagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|genderlabel|customText|
|DE|Voornaam|Quel est votre genre ?|CCEP streeft ernaar om een zeer divers en inclusief personeelsbestand aan te trekken, te ontwikkelen en te behouden, met gelijke kansen voor iedereen, ongeacht eventuele beschermde factoren|


#4
Scenario Outline: Country Select with Value spain(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=es
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Apellido
And Assert magellanixContactEmail
And Verify magellanixemailLabel Correo Electrónico 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Nº Teléfono de Contacto 

And Assert magellanixCity
And Verify magellanixcityLabel Ciudad 
And Assert magellanixCountry
And Verify magellanixcountryLabel País 
And Assert magellanixResume
And Verify magellanixresumeLabel CV
And Verify SubmitLabel Seleccionar
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert ESagreeToCareerOppurtunityText
And Assert ESagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|customText|
|DE|Nombre de pila|CCEP está comprometida a atraer, desarrollar y retener una fuerza de trabajo verdaderamente diversa e inclusiva en la que todos disfruten de las mismas oportunidades independientemente de cualquier|




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
And Verify SubmitLabel  Välj 
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert SVagreeToCareerOppurtunityText
And Assert SVagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|customText|
|DE|Förnamn|CCEP är fast beslutna om att attrahera, utveckla och behålla en bred och inkluderande arbetsstyrka med lika möjligheter för alla oavsett ålder,|



#6
Scenario Outline: Country Select with Value NB(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=nb
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Etternavn
And Assert magellanixContactEmail
And Verify magellanixemailLabel E-post 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Telefonnummer 
And Assert magellanixCity
And Verify magellanixcityLabel Sted    
And Assert magellanixCountry
And Verify magellanixcountryLabel Land
And Assert magellanixResume
And Verify magellanixresumeLabel CV 
And Verify SubmitLabel  Velg 
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert NBagreeToCareerOppurtunityText
And Assert NBagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|customText|
|DE|Fornavn|CCEP forplikter seg til å tiltrekke, utvikle og opprettholde en mangfoldig og inkluderende arbeidsstyrke, med like muligheter for alle – uavhengig av beskyttede egenskaper|



#7
Scenario Outline: Country Select with Value Iceland(Positive)
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=is-IS
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Eftirnafn
And Assert magellanixContactEmail
And Verify magellanixemailLabel Netfang
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Símanúmer 
And Assert magellanixCity
And Verify magellanixcityLabel Staður     
And Assert magellanixCountry
And Verify magellanixcountryLabel Land 
And Assert magellanixResume
And Verify magellanixresumeLabel Ferilskrá 
And Verify SubmitLabel  Velja
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert ISagreeToCareerOppurtunityText
And Assert ISagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|customText|
|DE|Nafn|CCEP leggur áherslu á að skapa og viðhalda fjölbreyttum vinnustað þar sem allir hafa jöfn tækifæri óháð kyni, uppruna, trúarbögðum, kynhneigð, aldri eða litarhætti. Upplýsingarnar hér |

#8
Scenario Outline: Country Select with Value PT
Given Start Test Case https://cctest-auto.azurewebsites.net/?req_id=TCS&country=GB&lang=pt
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Último nome
And Assert magellanixContactEmail
And Verify magellanixemailLabel O email 
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Número de telefone
And Assert magellanixCity
And Verify magellanixcityLabel Cidade    
And Assert magellanixCountry
And Verify magellanixcountryLabel País 
And Assert magellanixResume
And Verify magellanixresumeLabel Currículo / CV 
And Verify SubmitLabel  Selecione 
And Assert custom_InstrDiversityText <customText>
#And Assert cust_InstrDiversityText
And Assert PTagreeToCareerOppurtunityText
And Assert PTagreeToDataPrivacyStatement



Examples: 

|CountryCode|FirstName|customText|
|DE|Primeiro nome|A CCEP está comprometida em captar, desenvolver e reter uma força de trabalho verdadeiramente diferente e inclusiva com oportunidades iguais para todos independentemente de qualquer característica.|
