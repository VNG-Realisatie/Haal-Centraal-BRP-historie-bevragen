/*
 * BRP historie bevragen
 * API voor het zoeken en raadplegen van historische verblijfplaatsen, partners, nationaliteiten en verblijfstitels uit de BRP (inclusief de RNI).  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 0.0.1 (develop)
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.AanduidingBijHuisnummerEnum;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.SoortAdresEnum;
import org.openapitools.client.model.Verblijfplaats;
import org.openapitools.client.model.VerblijfplaatsInOnderzoek;
import org.openapitools.client.model.VerblijfplaatshistorieAllOf;
import org.openapitools.client.model.Waardetabel;

/**
 * Verblijfplaatshistorie
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T14:29:30.495Z[Etc/UTC]")
public class Verblijfplaatshistorie {
  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private String straat;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private String woonplaats;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE = "adresseerbaarObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE)
  private String adresseerbaarObjectIdentificatie;

  public static final String SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER = "aanduidingBijHuisnummer";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER)
  private AanduidingBijHuisnummerEnum aanduidingBijHuisnummer;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_FUNCTIE_ADRES = "functieAdres";
  @SerializedName(SERIALIZED_NAME_FUNCTIE_ADRES)
  private SoortAdresEnum functieAdres;

  public static final String SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND = "indicatieVestigingVanuitBuitenland";
  @SerializedName(SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND)
  private Boolean indicatieVestigingVanuitBuitenland;

  public static final String SERIALIZED_NAME_LOCATIEBESCHRIJVING = "locatiebeschrijving";
  @SerializedName(SERIALIZED_NAME_LOCATIEBESCHRIJVING)
  private String locatiebeschrijving;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private String korteNaam;

  public static final String SERIALIZED_NAME_VANUIT_VERTROKKEN_ONBEKEND_WAARHEEN = "vanuitVertrokkenOnbekendWaarheen";
  @SerializedName(SERIALIZED_NAME_VANUIT_VERTROKKEN_ONBEKEND_WAARHEEN)
  private Boolean vanuitVertrokkenOnbekendWaarheen;

  public static final String SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING = "datumAanvangAdreshouding";
  @SerializedName(SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING)
  private DatumOnvolledig datumAanvangAdreshouding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID = "datumIngangGeldigheid";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID)
  private DatumOnvolledig datumIngangGeldigheid;

  public static final String SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE = "datumInschrijvingInGemeente";
  @SerializedName(SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE)
  private DatumOnvolledig datumInschrijvingInGemeente;

  public static final String SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND = "datumVestigingInNederland";
  @SerializedName(SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND)
  private DatumOnvolledig datumVestigingInNederland;

  public static final String SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING = "gemeenteVanInschrijving";
  @SerializedName(SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING)
  private Waardetabel gemeenteVanInschrijving;

  public static final String SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN = "landVanwaarIngeschreven";
  @SerializedName(SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN)
  private Waardetabel landVanwaarIngeschreven;

  public static final String SERIALIZED_NAME_ADRESREGEL1 = "adresregel1";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL1)
  private String adresregel1;

  public static final String SERIALIZED_NAME_ADRESREGEL2 = "adresregel2";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL2)
  private String adresregel2;

  public static final String SERIALIZED_NAME_ADRESREGEL3 = "adresregel3";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL3)
  private String adresregel3;

  public static final String SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN = "vertrokkenOnbekendWaarheen";
  @SerializedName(SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN)
  private Boolean vertrokkenOnbekendWaarheen;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardetabel land;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private VerblijfplaatsInOnderzoek inOnderzoek;

  public static final String SERIALIZED_NAME_DATUM_TOT = "datumTot";
  @SerializedName(SERIALIZED_NAME_DATUM_TOT)
  private DatumOnvolledig datumTot;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;


  public Verblijfplaatshistorie straat(String straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Een naam die door de gemeente aan een openbare ruimte is gegeven.
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "Een naam die door de gemeente aan een openbare ruimte is gegeven.")

  public String getStraat() {
    return straat;
  }


  public void setStraat(String straat) {
    this.straat = straat;
  }


  public Verblijfplaatshistorie huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public Verblijfplaatshistorie huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public Verblijfplaatshistorie huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bis", value = "Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public Verblijfplaatshistorie postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ", value = "De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Verblijfplaatshistorie woonplaats(String woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Duiven", value = "Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.")

  public String getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }


  public Verblijfplaatshistorie adresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
    return this;
  }

   /**
   * De verblijfplaats van de persoon kan een ligplaats, een standplaats of een verblijfsobject zijn. 
   * @return adresseerbaarObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226010000038820", value = "De verblijfplaats van de persoon kan een ligplaats, een standplaats of een verblijfsobject zijn. ")

  public String getAdresseerbaarObjectIdentificatie() {
    return adresseerbaarObjectIdentificatie;
  }


  public void setAdresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
  }


  public Verblijfplaatshistorie aanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    return this;
  }

   /**
   * Get aanduidingBijHuisnummer
   * @return aanduidingBijHuisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AanduidingBijHuisnummerEnum getAanduidingBijHuisnummer() {
    return aanduidingBijHuisnummer;
  }


  public void setAanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
  }


  public Verblijfplaatshistorie nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Unieke identificatie van een nummeraanduiding (en het bijbehorende adres) in de BAG. 
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0518200000366054", value = "Unieke identificatie van een nummeraanduiding (en het bijbehorende adres) in de BAG. ")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public Verblijfplaatshistorie functieAdres(SoortAdresEnum functieAdres) {
    
    this.functieAdres = functieAdres;
    return this;
  }

   /**
   * Get functieAdres
   * @return functieAdres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoortAdresEnum getFunctieAdres() {
    return functieAdres;
  }


  public void setFunctieAdres(SoortAdresEnum functieAdres) {
    this.functieAdres = functieAdres;
  }


  public Verblijfplaatshistorie indicatieVestigingVanuitBuitenland(Boolean indicatieVestigingVanuitBuitenland) {
    
    this.indicatieVestigingVanuitBuitenland = indicatieVestigingVanuitBuitenland;
    return this;
  }

   /**
   * Geeft aan dat de ingeschreven persoon zich vanuit het buitenland heeft ingeschreven. 
   * @return indicatieVestigingVanuitBuitenland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Geeft aan dat de ingeschreven persoon zich vanuit het buitenland heeft ingeschreven. ")

  public Boolean getIndicatieVestigingVanuitBuitenland() {
    return indicatieVestigingVanuitBuitenland;
  }


  public void setIndicatieVestigingVanuitBuitenland(Boolean indicatieVestigingVanuitBuitenland) {
    this.indicatieVestigingVanuitBuitenland = indicatieVestigingVanuitBuitenland;
  }


  public Verblijfplaatshistorie locatiebeschrijving(String locatiebeschrijving) {
    
    this.locatiebeschrijving = locatiebeschrijving;
    return this;
  }

   /**
   * Omschrijving van de ligging van een verblijfsobject, standplaats of ligplaats. 
   * @return locatiebeschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Naast de derde brug", value = "Omschrijving van de ligging van een verblijfsobject, standplaats of ligplaats. ")

  public String getLocatiebeschrijving() {
    return locatiebeschrijving;
  }


  public void setLocatiebeschrijving(String locatiebeschrijving) {
    this.locatiebeschrijving = locatiebeschrijving;
  }


  public Verblijfplaatshistorie korteNaam(String korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * De officiële openbareruimtenaam uit de Basisregistratie Gebouwen en Adressen (BAG) of een verkorte versie. 
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De officiële openbareruimtenaam uit de Basisregistratie Gebouwen en Adressen (BAG) of een verkorte versie. ")

  public String getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(String korteNaam) {
    this.korteNaam = korteNaam;
  }


  public Verblijfplaatshistorie vanuitVertrokkenOnbekendWaarheen(Boolean vanuitVertrokkenOnbekendWaarheen) {
    
    this.vanuitVertrokkenOnbekendWaarheen = vanuitVertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Geeft aan dat de persoon is teruggekeerd uit een situatie van &#39;vertrokken onbekend waarheen.&#39; 
   * @return vanuitVertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Geeft aan dat de persoon is teruggekeerd uit een situatie van 'vertrokken onbekend waarheen.' ")

  public Boolean getVanuitVertrokkenOnbekendWaarheen() {
    return vanuitVertrokkenOnbekendWaarheen;
  }


  public void setVanuitVertrokkenOnbekendWaarheen(Boolean vanuitVertrokkenOnbekendWaarheen) {
    this.vanuitVertrokkenOnbekendWaarheen = vanuitVertrokkenOnbekendWaarheen;
  }


  public Verblijfplaatshistorie datumAanvangAdreshouding(DatumOnvolledig datumAanvangAdreshouding) {
    
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
    return this;
  }

   /**
   * Get datumAanvangAdreshouding
   * @return datumAanvangAdreshouding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumAanvangAdreshouding() {
    return datumAanvangAdreshouding;
  }


  public void setDatumAanvangAdreshouding(DatumOnvolledig datumAanvangAdreshouding) {
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
  }


  public Verblijfplaatshistorie datumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    
    this.datumIngangGeldigheid = datumIngangGeldigheid;
    return this;
  }

   /**
   * Get datumIngangGeldigheid
   * @return datumIngangGeldigheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangGeldigheid() {
    return datumIngangGeldigheid;
  }


  public void setDatumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    this.datumIngangGeldigheid = datumIngangGeldigheid;
  }


  public Verblijfplaatshistorie datumInschrijvingInGemeente(DatumOnvolledig datumInschrijvingInGemeente) {
    
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
    return this;
  }

   /**
   * Get datumInschrijvingInGemeente
   * @return datumInschrijvingInGemeente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumInschrijvingInGemeente() {
    return datumInschrijvingInGemeente;
  }


  public void setDatumInschrijvingInGemeente(DatumOnvolledig datumInschrijvingInGemeente) {
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
  }


  public Verblijfplaatshistorie datumVestigingInNederland(DatumOnvolledig datumVestigingInNederland) {
    
    this.datumVestigingInNederland = datumVestigingInNederland;
    return this;
  }

   /**
   * Get datumVestigingInNederland
   * @return datumVestigingInNederland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumVestigingInNederland() {
    return datumVestigingInNederland;
  }


  public void setDatumVestigingInNederland(DatumOnvolledig datumVestigingInNederland) {
    this.datumVestigingInNederland = datumVestigingInNederland;
  }


  public Verblijfplaatshistorie gemeenteVanInschrijving(Waardetabel gemeenteVanInschrijving) {
    
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
    return this;
  }

   /**
   * Get gemeenteVanInschrijving
   * @return gemeenteVanInschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getGemeenteVanInschrijving() {
    return gemeenteVanInschrijving;
  }


  public void setGemeenteVanInschrijving(Waardetabel gemeenteVanInschrijving) {
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
  }


  public Verblijfplaatshistorie landVanwaarIngeschreven(Waardetabel landVanwaarIngeschreven) {
    
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
    return this;
  }

   /**
   * Get landVanwaarIngeschreven
   * @return landVanwaarIngeschreven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getLandVanwaarIngeschreven() {
    return landVanwaarIngeschreven;
  }


  public void setLandVanwaarIngeschreven(Waardetabel landVanwaarIngeschreven) {
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
  }


  public Verblijfplaatshistorie adresregel1(String adresregel1) {
    
    this.adresregel1 = adresregel1;
    return this;
  }

   /**
   * Het eerste deel van een adres is een combinatie van de straat en huisnummer. 
   * @return adresregel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort 26A-3", value = "Het eerste deel van een adres is een combinatie van de straat en huisnummer. ")

  public String getAdresregel1() {
    return adresregel1;
  }


  public void setAdresregel1(String adresregel1) {
    this.adresregel1 = adresregel1;
  }


  public Verblijfplaatshistorie adresregel2(String adresregel2) {
    
    this.adresregel2 = adresregel2;
    return this;
  }

   /**
   * Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. 
   * @return adresregel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234AA Nootdorp", value = "Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. ")

  public String getAdresregel2() {
    return adresregel2;
  }


  public void setAdresregel2(String adresregel2) {
    this.adresregel2 = adresregel2;
  }


  public Verblijfplaatshistorie adresregel3(String adresregel3) {
    
    this.adresregel3 = adresregel3;
    return this;
  }

   /**
   * Het derde deel van een adres is optioneel. Het gaat om een of meer geografische gebieden van het adres in het buitenland. 
   * @return adresregel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Selangor", value = "Het derde deel van een adres is optioneel. Het gaat om een of meer geografische gebieden van het adres in het buitenland. ")

  public String getAdresregel3() {
    return adresregel3;
  }


  public void setAdresregel3(String adresregel3) {
    this.adresregel3 = adresregel3;
  }


  public Verblijfplaatshistorie vertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe. 
   * @return vertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe. ")

  public Boolean getVertrokkenOnbekendWaarheen() {
    return vertrokkenOnbekendWaarheen;
  }


  public void setVertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
  }


  public Verblijfplaatshistorie land(Waardetabel land) {
    
    this.land = land;
    return this;
  }

   /**
   * Get land
   * @return land
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getLand() {
    return land;
  }


  public void setLand(Waardetabel land) {
    this.land = land;
  }


  public Verblijfplaatshistorie inOnderzoek(VerblijfplaatsInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerblijfplaatsInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(VerblijfplaatsInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public Verblijfplaatshistorie datumTot(DatumOnvolledig datumTot) {
    
    this.datumTot = datumTot;
    return this;
  }

   /**
   * Get datumTot
   * @return datumTot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumTot() {
    return datumTot;
  }


  public void setDatumTot(DatumOnvolledig datumTot) {
    this.datumTot = datumTot;
  }


  public Verblijfplaatshistorie geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Gegevens mogen niet worden verstrekt aan derden / maatschappelijke instellingen. 
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gegevens mogen niet worden verstrekt aan derden / maatschappelijke instellingen. ")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verblijfplaatshistorie verblijfplaatshistorie = (Verblijfplaatshistorie) o;
    return Objects.equals(this.straat, verblijfplaatshistorie.straat) &&
        Objects.equals(this.huisnummer, verblijfplaatshistorie.huisnummer) &&
        Objects.equals(this.huisletter, verblijfplaatshistorie.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, verblijfplaatshistorie.huisnummertoevoeging) &&
        Objects.equals(this.postcode, verblijfplaatshistorie.postcode) &&
        Objects.equals(this.woonplaats, verblijfplaatshistorie.woonplaats) &&
        Objects.equals(this.adresseerbaarObjectIdentificatie, verblijfplaatshistorie.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.aanduidingBijHuisnummer, verblijfplaatshistorie.aanduidingBijHuisnummer) &&
        Objects.equals(this.nummeraanduidingIdentificatie, verblijfplaatshistorie.nummeraanduidingIdentificatie) &&
        Objects.equals(this.functieAdres, verblijfplaatshistorie.functieAdres) &&
        Objects.equals(this.indicatieVestigingVanuitBuitenland, verblijfplaatshistorie.indicatieVestigingVanuitBuitenland) &&
        Objects.equals(this.locatiebeschrijving, verblijfplaatshistorie.locatiebeschrijving) &&
        Objects.equals(this.korteNaam, verblijfplaatshistorie.korteNaam) &&
        Objects.equals(this.vanuitVertrokkenOnbekendWaarheen, verblijfplaatshistorie.vanuitVertrokkenOnbekendWaarheen) &&
        Objects.equals(this.datumAanvangAdreshouding, verblijfplaatshistorie.datumAanvangAdreshouding) &&
        Objects.equals(this.datumIngangGeldigheid, verblijfplaatshistorie.datumIngangGeldigheid) &&
        Objects.equals(this.datumInschrijvingInGemeente, verblijfplaatshistorie.datumInschrijvingInGemeente) &&
        Objects.equals(this.datumVestigingInNederland, verblijfplaatshistorie.datumVestigingInNederland) &&
        Objects.equals(this.gemeenteVanInschrijving, verblijfplaatshistorie.gemeenteVanInschrijving) &&
        Objects.equals(this.landVanwaarIngeschreven, verblijfplaatshistorie.landVanwaarIngeschreven) &&
        Objects.equals(this.adresregel1, verblijfplaatshistorie.adresregel1) &&
        Objects.equals(this.adresregel2, verblijfplaatshistorie.adresregel2) &&
        Objects.equals(this.adresregel3, verblijfplaatshistorie.adresregel3) &&
        Objects.equals(this.vertrokkenOnbekendWaarheen, verblijfplaatshistorie.vertrokkenOnbekendWaarheen) &&
        Objects.equals(this.land, verblijfplaatshistorie.land) &&
        Objects.equals(this.inOnderzoek, verblijfplaatshistorie.inOnderzoek) &&
        Objects.equals(this.datumTot, verblijfplaatshistorie.datumTot) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, verblijfplaatshistorie.geheimhoudingPersoonsgegevens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(straat, huisnummer, huisletter, huisnummertoevoeging, postcode, woonplaats, adresseerbaarObjectIdentificatie, aanduidingBijHuisnummer, nummeraanduidingIdentificatie, functieAdres, indicatieVestigingVanuitBuitenland, locatiebeschrijving, korteNaam, vanuitVertrokkenOnbekendWaarheen, datumAanvangAdreshouding, datumIngangGeldigheid, datumInschrijvingInGemeente, datumVestigingInNederland, gemeenteVanInschrijving, landVanwaarIngeschreven, adresregel1, adresregel2, adresregel3, vertrokkenOnbekendWaarheen, land, inOnderzoek, datumTot, geheimhoudingPersoonsgegevens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verblijfplaatshistorie {\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    aanduidingBijHuisnummer: ").append(toIndentedString(aanduidingBijHuisnummer)).append("\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    functieAdres: ").append(toIndentedString(functieAdres)).append("\n");
    sb.append("    indicatieVestigingVanuitBuitenland: ").append(toIndentedString(indicatieVestigingVanuitBuitenland)).append("\n");
    sb.append("    locatiebeschrijving: ").append(toIndentedString(locatiebeschrijving)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    vanuitVertrokkenOnbekendWaarheen: ").append(toIndentedString(vanuitVertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    datumAanvangAdreshouding: ").append(toIndentedString(datumAanvangAdreshouding)).append("\n");
    sb.append("    datumIngangGeldigheid: ").append(toIndentedString(datumIngangGeldigheid)).append("\n");
    sb.append("    datumInschrijvingInGemeente: ").append(toIndentedString(datumInschrijvingInGemeente)).append("\n");
    sb.append("    datumVestigingInNederland: ").append(toIndentedString(datumVestigingInNederland)).append("\n");
    sb.append("    gemeenteVanInschrijving: ").append(toIndentedString(gemeenteVanInschrijving)).append("\n");
    sb.append("    landVanwaarIngeschreven: ").append(toIndentedString(landVanwaarIngeschreven)).append("\n");
    sb.append("    adresregel1: ").append(toIndentedString(adresregel1)).append("\n");
    sb.append("    adresregel2: ").append(toIndentedString(adresregel2)).append("\n");
    sb.append("    adresregel3: ").append(toIndentedString(adresregel3)).append("\n");
    sb.append("    vertrokkenOnbekendWaarheen: ").append(toIndentedString(vertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    datumTot: ").append(toIndentedString(datumTot)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

