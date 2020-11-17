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
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.Waardetabel;

/**
 * Gegevens over de (historische) nationaliteiten van de persoon. * **datumTot**: Datum tot wanneer een nationaliteit geldig was. * **datumIngangGeldigheid**: Datum waarop de gegevens over de Nationaliteit geldig zijn geworden. * **nationaliteit** : Nationaliteittabel, die aangeeft over welke nationaliteit de ingeschrevene beschikt. * **redenOpname** : Tabel Reden opnemen/beëindigen nationaliteit, die aangeeft met welke reden de persoon de Nederlandse nationaliteit heeft verkregen of waarom een niet-Nederlandse nationaliteit is opgenomen. * **redenBeeindigen** : Tabel Reden opnemen/beëindigen nationaliteit, die aangeeft met welke reden een nationaliteit is beëindigd. 
 */
@ApiModel(description = "Gegevens over de (historische) nationaliteiten van de persoon. * **datumTot**: Datum tot wanneer een nationaliteit geldig was. * **datumIngangGeldigheid**: Datum waarop de gegevens over de Nationaliteit geldig zijn geworden. * **nationaliteit** : Nationaliteittabel, die aangeeft over welke nationaliteit de ingeschrevene beschikt. * **redenOpname** : Tabel Reden opnemen/beëindigen nationaliteit, die aangeeft met welke reden de persoon de Nederlandse nationaliteit heeft verkregen of waarom een niet-Nederlandse nationaliteit is opgenomen. * **redenBeeindigen** : Tabel Reden opnemen/beëindigen nationaliteit, die aangeeft met welke reden een nationaliteit is beëindigd. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T14:29:30.495Z[Etc/UTC]")
public class NationaliteithistorieAllOf {
  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_DATUM_TOT = "datumTot";
  @SerializedName(SERIALIZED_NAME_DATUM_TOT)
  private DatumOnvolledig datumTot;

  public static final String SERIALIZED_NAME_REDEN_BEEINDIGEN = "redenBeeindigen";
  @SerializedName(SERIALIZED_NAME_REDEN_BEEINDIGEN)
  private Waardetabel redenBeeindigen;

  public static final String SERIALIZED_NAME_INDICATIE_NATIONALITEIT_BEEINDIGD = "indicatieNationaliteitBeeindigd";
  @SerializedName(SERIALIZED_NAME_INDICATIE_NATIONALITEIT_BEEINDIGD)
  private Boolean indicatieNationaliteitBeeindigd;


  public NationaliteithistorieAllOf geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
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


  public NationaliteithistorieAllOf datumTot(DatumOnvolledig datumTot) {
    
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


  public NationaliteithistorieAllOf redenBeeindigen(Waardetabel redenBeeindigen) {
    
    this.redenBeeindigen = redenBeeindigen;
    return this;
  }

   /**
   * Get redenBeeindigen
   * @return redenBeeindigen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getRedenBeeindigen() {
    return redenBeeindigen;
  }


  public void setRedenBeeindigen(Waardetabel redenBeeindigen) {
    this.redenBeeindigen = redenBeeindigen;
  }


  public NationaliteithistorieAllOf indicatieNationaliteitBeeindigd(Boolean indicatieNationaliteitBeeindigd) {
    
    this.indicatieNationaliteitBeeindigd = indicatieNationaliteitBeeindigd;
    return this;
  }

   /**
   * Geeft aan dat de nationaliteit beëindigd is. 
   * @return indicatieNationaliteitBeeindigd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Geeft aan dat de nationaliteit beëindigd is. ")

  public Boolean getIndicatieNationaliteitBeeindigd() {
    return indicatieNationaliteitBeeindigd;
  }


  public void setIndicatieNationaliteitBeeindigd(Boolean indicatieNationaliteitBeeindigd) {
    this.indicatieNationaliteitBeeindigd = indicatieNationaliteitBeeindigd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationaliteithistorieAllOf nationaliteithistorieAllOf = (NationaliteithistorieAllOf) o;
    return Objects.equals(this.geheimhoudingPersoonsgegevens, nationaliteithistorieAllOf.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.datumTot, nationaliteithistorieAllOf.datumTot) &&
        Objects.equals(this.redenBeeindigen, nationaliteithistorieAllOf.redenBeeindigen) &&
        Objects.equals(this.indicatieNationaliteitBeeindigd, nationaliteithistorieAllOf.indicatieNationaliteitBeeindigd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geheimhoudingPersoonsgegevens, datumTot, redenBeeindigen, indicatieNationaliteitBeeindigd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationaliteithistorieAllOf {\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    datumTot: ").append(toIndentedString(datumTot)).append("\n");
    sb.append("    redenBeeindigen: ").append(toIndentedString(redenBeeindigen)).append("\n");
    sb.append("    indicatieNationaliteitBeeindigd: ").append(toIndentedString(indicatieNationaliteitBeeindigd)).append("\n");
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
