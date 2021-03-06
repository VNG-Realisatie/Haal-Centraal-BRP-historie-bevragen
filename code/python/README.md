# openapi-client
API voor het zoeken en raadplegen van historische verblijfplaatsen, partners, nationaliteiten en verblijfstitels uit de BRP (inclusief de RNI).

Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen/tree/v1.0.0/features) voor nadere toelichting.


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.0.1 (develop)
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen)

## Requirements.

Python >= 3.6

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import time
import openapi_client
from pprint import pprint
from openapi_client.api import brp_historie_bevragen_api
from openapi_client.model.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.model.foutbericht import Foutbericht
from openapi_client.model.nationaliteithistorie_hal_collectie import NationaliteithistorieHalCollectie
from openapi_client.model.partnerhistorie_hal_collectie import PartnerhistorieHalCollectie
from openapi_client.model.verblijfplaatshistorie_hal_collectie import VerblijfplaatshistorieHalCollectie
from openapi_client.model.verblijfstitelhistorie_hal_collectie import VerblijfstitelhistorieHalCollectie
# Defining the host is optional and defaults to https://www.haalcentraal.nl/haalcentraal/api/brphistorie
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://www.haalcentraal.nl/haalcentraal/api/brphistorie"
)



# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = brp_historie_bevragen_api.BRPHistorieBevragenApi(api_client)
    burgerservicenummer = "555555021" # str | Uniek persoonsnummer 
fields = "fields_example" # str | Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
peildatum = dateutil_parser('Sun Sep 09 00:00:00 UTC 2018').date() # date | De datum waarop de resource wordt opgevraagd. (optional)
datum_van = dateutil_parser('Sun Sep 09 00:00:00 UTC 2018').date() # date | De begindatum van de periode waarover de resource wordt opgevraagd. (optional)
datum_tot_en_met = dateutil_parser('Tue Oct 09 00:00:00 UTC 2018').date() # date | De einddatum van de periode waarover de resource wordt opgevraagd. (optional)

    try:
        api_response = api_instance.getnationaliteithistorie(burgerservicenummer, fields=fields, peildatum=peildatum, datum_van=datum_van, datum_tot_en_met=datum_tot_en_met)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling BRPHistorieBevragenApi->getnationaliteithistorie: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *https://www.haalcentraal.nl/haalcentraal/api/brphistorie*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BRPHistorieBevragenApi* | [**getnationaliteithistorie**](docs/BRPHistorieBevragenApi.md#getnationaliteithistorie) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/nationaliteithistorie | 
*BRPHistorieBevragenApi* | [**getpartnerhistorie**](docs/BRPHistorieBevragenApi.md#getpartnerhistorie) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/partnerhistorie | 
*BRPHistorieBevragenApi* | [**getverblijfplaatshistorie**](docs/BRPHistorieBevragenApi.md#getverblijfplaatshistorie) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/verblijfplaatshistorie | 
*BRPHistorieBevragenApi* | [**getverblijfstitelhistorie**](docs/BRPHistorieBevragenApi.md#getverblijfstitelhistorie) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/verblijfstitelhistorie | 


## Documentation For Models

 - [AanduidingBijHuisnummerEnum](docs/AanduidingBijHuisnummerEnum.md)
 - [AanduidingBijzonderNederlanderschapEnum](docs/AanduidingBijzonderNederlanderschapEnum.md)
 - [AangaanHuwelijkPartnerschap](docs/AangaanHuwelijkPartnerschap.md)
 - [AangaanHuwelijkPartnerschapInOnderzoek](docs/AangaanHuwelijkPartnerschapInOnderzoek.md)
 - [Adres](docs/Adres.md)
 - [BadRequestFoutbericht](docs/BadRequestFoutbericht.md)
 - [BadRequestFoutberichtAllOf](docs/BadRequestFoutberichtAllOf.md)
 - [DatumOnvolledig](docs/DatumOnvolledig.md)
 - [Foutbericht](docs/Foutbericht.md)
 - [Geboorte](docs/Geboorte.md)
 - [GeboorteAllOf](docs/GeboorteAllOf.md)
 - [GeboorteInOnderzoek](docs/GeboorteInOnderzoek.md)
 - [Geboortedatum](docs/Geboortedatum.md)
 - [GeslachtEnum](docs/GeslachtEnum.md)
 - [HalCollectionLinks](docs/HalCollectionLinks.md)
 - [HalLink](docs/HalLink.md)
 - [InvalidParams](docs/InvalidParams.md)
 - [Naam](docs/Naam.md)
 - [NaamInOnderzoek](docs/NaamInOnderzoek.md)
 - [Nationaliteit](docs/Nationaliteit.md)
 - [NationaliteitInOnderzoek](docs/NationaliteitInOnderzoek.md)
 - [Nationaliteithistorie](docs/Nationaliteithistorie.md)
 - [NationaliteithistorieAllOf](docs/NationaliteithistorieAllOf.md)
 - [NationaliteithistorieHalCollectie](docs/NationaliteithistorieHalCollectie.md)
 - [NationaliteithistorieHalCollectieEmbedded](docs/NationaliteithistorieHalCollectieEmbedded.md)
 - [OntbindingHuwelijkInOnderzoek](docs/OntbindingHuwelijkInOnderzoek.md)
 - [OntbindingHuwelijkPartnerschap](docs/OntbindingHuwelijkPartnerschap.md)
 - [Partner](docs/Partner.md)
 - [PartnerInOnderzoek](docs/PartnerInOnderzoek.md)
 - [Partnerhistorie](docs/Partnerhistorie.md)
 - [PartnerhistorieAllOf](docs/PartnerhistorieAllOf.md)
 - [PartnerhistorieHal](docs/PartnerhistorieHal.md)
 - [PartnerhistorieHalAllOf](docs/PartnerhistorieHalAllOf.md)
 - [PartnerhistorieHalCollectie](docs/PartnerhistorieHalCollectie.md)
 - [PartnerhistorieHalCollectieEmbedded](docs/PartnerhistorieHalCollectieEmbedded.md)
 - [PartnerhistorieLinks](docs/PartnerhistorieLinks.md)
 - [SoortAdresEnum](docs/SoortAdresEnum.md)
 - [SoortVerbintenisEnum](docs/SoortVerbintenisEnum.md)
 - [Verblijfplaats](docs/Verblijfplaats.md)
 - [VerblijfplaatsAllOf](docs/VerblijfplaatsAllOf.md)
 - [VerblijfplaatsInOnderzoek](docs/VerblijfplaatsInOnderzoek.md)
 - [Verblijfplaatshistorie](docs/Verblijfplaatshistorie.md)
 - [VerblijfplaatshistorieAllOf](docs/VerblijfplaatshistorieAllOf.md)
 - [VerblijfplaatshistorieHal](docs/VerblijfplaatshistorieHal.md)
 - [VerblijfplaatshistorieHalAllOf](docs/VerblijfplaatshistorieHalAllOf.md)
 - [VerblijfplaatshistorieHalCollectie](docs/VerblijfplaatshistorieHalCollectie.md)
 - [VerblijfplaatshistorieHalCollectieEmbedded](docs/VerblijfplaatshistorieHalCollectieEmbedded.md)
 - [VerblijfplaatshistorieLinks](docs/VerblijfplaatshistorieLinks.md)
 - [Verblijfstitel](docs/Verblijfstitel.md)
 - [VerblijfstitelInOnderzoek](docs/VerblijfstitelInOnderzoek.md)
 - [Verblijfstitelhistorie](docs/Verblijfstitelhistorie.md)
 - [VerblijfstitelhistorieAllOf](docs/VerblijfstitelhistorieAllOf.md)
 - [VerblijfstitelhistorieHalCollectie](docs/VerblijfstitelhistorieHalCollectie.md)
 - [VerblijfstitelhistorieHalCollectieEmbedded](docs/VerblijfstitelhistorieHalCollectieEmbedded.md)
 - [Waardetabel](docs/Waardetabel.md)


## Documentation For Authorization

 All endpoints do not require authorization.

## Author




## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in openapi_client.apis and openapi_client.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from openapi_client.api.default_api import DefaultApi`
- `from openapi_client.model.pet import Pet`

Solution 1:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import openapi_client
from openapi_client.apis import *
from openapi_client.models import *
```

