Feature: Country Select  and Ui Verification

Scenario Outline: Country Select with Value 

Given Start Test Case <url>
And Click LinkToDPCS
And Switch to Second Window
And Verify languageDesc <LangDesc>






Examples: 

|url|LangDesc|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=en|Review Data Privacy Statement|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=fr|Revue Déclaration de confidentialité des données|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=de|Überblick Datenschutzerklärung|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=nl|Raadpleeg Privacyverklaring|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=es|Revisar Declaración de privacidad de datos|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=sv|Godkänn Dataintegritetspolicy|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=nb|Godkjenn Personvernerklæring|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=is-IS|Review Data Privacy Statement|
|https://cctest-auto.azurewebsites.net/?req_id=5001&country=GB&lang=pt|Rever Declaração de privacidade dos dados|