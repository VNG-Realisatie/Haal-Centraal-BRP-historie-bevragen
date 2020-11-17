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
import org.openapitools.client.model.OntbindingHuwelijkPartnerschap;

/**
 * Gegevens over (historische) huwelijken en/of geregistreerd partnerschappen van de persoon. 
 */
@ApiModel(description = "Gegevens over (historische) huwelijken en/of geregistreerd partnerschappen van de persoon. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T14:29:30.495Z[Etc/UTC]")
public class PartnerhistorieAllOf {
  public static final String SERIALIZED_NAME_ONTBINDING_HUWELIJK_PARTNERSCHAP = "ontbindingHuwelijkPartnerschap";
  @SerializedName(SERIALIZED_NAME_ONTBINDING_HUWELIJK_PARTNERSCHAP)
  private OntbindingHuwelijkPartnerschap ontbindingHuwelijkPartnerschap;


  public PartnerhistorieAllOf ontbindingHuwelijkPartnerschap(OntbindingHuwelijkPartnerschap ontbindingHuwelijkPartnerschap) {
    
    this.ontbindingHuwelijkPartnerschap = ontbindingHuwelijkPartnerschap;
    return this;
  }

   /**
   * Get ontbindingHuwelijkPartnerschap
   * @return ontbindingHuwelijkPartnerschap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OntbindingHuwelijkPartnerschap getOntbindingHuwelijkPartnerschap() {
    return ontbindingHuwelijkPartnerschap;
  }


  public void setOntbindingHuwelijkPartnerschap(OntbindingHuwelijkPartnerschap ontbindingHuwelijkPartnerschap) {
    this.ontbindingHuwelijkPartnerschap = ontbindingHuwelijkPartnerschap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerhistorieAllOf partnerhistorieAllOf = (PartnerhistorieAllOf) o;
    return Objects.equals(this.ontbindingHuwelijkPartnerschap, partnerhistorieAllOf.ontbindingHuwelijkPartnerschap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ontbindingHuwelijkPartnerschap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerhistorieAllOf {\n");
    sb.append("    ontbindingHuwelijkPartnerschap: ").append(toIndentedString(ontbindingHuwelijkPartnerschap)).append("\n");
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
