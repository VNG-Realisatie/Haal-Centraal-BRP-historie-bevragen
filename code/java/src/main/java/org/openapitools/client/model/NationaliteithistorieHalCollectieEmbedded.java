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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Nationaliteithistorie;

/**
 * NationaliteithistorieHalCollectieEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-14T15:42:47.439Z[Etc/UTC]")
public class NationaliteithistorieHalCollectieEmbedded {
  public static final String SERIALIZED_NAME_NATIONALITEITHISTORIE = "nationaliteithistorie";
  @SerializedName(SERIALIZED_NAME_NATIONALITEITHISTORIE)
  private List<Nationaliteithistorie> nationaliteithistorie = null;


  public NationaliteithistorieHalCollectieEmbedded nationaliteithistorie(List<Nationaliteithistorie> nationaliteithistorie) {
    
    this.nationaliteithistorie = nationaliteithistorie;
    return this;
  }

  public NationaliteithistorieHalCollectieEmbedded addNationaliteithistorieItem(Nationaliteithistorie nationaliteithistorieItem) {
    if (this.nationaliteithistorie == null) {
      this.nationaliteithistorie = new ArrayList<>();
    }
    this.nationaliteithistorie.add(nationaliteithistorieItem);
    return this;
  }

   /**
   * Get nationaliteithistorie
   * @return nationaliteithistorie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Nationaliteithistorie> getNationaliteithistorie() {
    return nationaliteithistorie;
  }


  public void setNationaliteithistorie(List<Nationaliteithistorie> nationaliteithistorie) {
    this.nationaliteithistorie = nationaliteithistorie;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationaliteithistorieHalCollectieEmbedded nationaliteithistorieHalCollectieEmbedded = (NationaliteithistorieHalCollectieEmbedded) o;
    return Objects.equals(this.nationaliteithistorie, nationaliteithistorieHalCollectieEmbedded.nationaliteithistorie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nationaliteithistorie);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationaliteithistorieHalCollectieEmbedded {\n");
    sb.append("    nationaliteithistorie: ").append(toIndentedString(nationaliteithistorie)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

