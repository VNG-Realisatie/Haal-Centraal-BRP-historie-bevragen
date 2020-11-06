/* 
 * BRP historie bevragen
 *
 * API voor het zoeken en raadplegen van historische verblijfplaatsen, partners, nationaliteiten en verblijfstitels uit de BRP (inclusief de RNI).  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 0.0.1 (develop)
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Naam
    /// </summary>
    [DataContract]
    public partial class Naam :  IEquatable<Naam>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Naam" /> class.
        /// </summary>
        /// <param name="geslachtsnaam">De achternaam van een persoon. .</param>
        /// <param name="voorletters">De voorletters van de persoon, afgeleid van de voornamen. .</param>
        /// <param name="voornamen">De verzameling namen voor de geslachtsnaam, gescheiden door spaties. .</param>
        /// <param name="voorvoegsel">voorvoegsel.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        public Naam(string geslachtsnaam = default(string), string voorletters = default(string), string voornamen = default(string), string voorvoegsel = default(string), NaamInOnderzoek inOnderzoek = default(NaamInOnderzoek))
        {
            this.Geslachtsnaam = geslachtsnaam;
            this.Voorletters = voorletters;
            this.Voornamen = voornamen;
            this.Voorvoegsel = voorvoegsel;
            this.InOnderzoek = inOnderzoek;
        }
        
        /// <summary>
        /// De achternaam van een persoon. 
        /// </summary>
        /// <value>De achternaam van een persoon. </value>
        [DataMember(Name="geslachtsnaam", EmitDefaultValue=false)]
        public string Geslachtsnaam { get; set; }

        /// <summary>
        /// De voorletters van de persoon, afgeleid van de voornamen. 
        /// </summary>
        /// <value>De voorletters van de persoon, afgeleid van de voornamen. </value>
        [DataMember(Name="voorletters", EmitDefaultValue=false)]
        public string Voorletters { get; set; }

        /// <summary>
        /// De verzameling namen voor de geslachtsnaam, gescheiden door spaties. 
        /// </summary>
        /// <value>De verzameling namen voor de geslachtsnaam, gescheiden door spaties. </value>
        [DataMember(Name="voornamen", EmitDefaultValue=false)]
        public string Voornamen { get; set; }

        /// <summary>
        /// Gets or Sets Voorvoegsel
        /// </summary>
        [DataMember(Name="voorvoegsel", EmitDefaultValue=false)]
        public string Voorvoegsel { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public NaamInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Naam {\n");
            sb.Append("  Geslachtsnaam: ").Append(Geslachtsnaam).Append("\n");
            sb.Append("  Voorletters: ").Append(Voorletters).Append("\n");
            sb.Append("  Voornamen: ").Append(Voornamen).Append("\n");
            sb.Append("  Voorvoegsel: ").Append(Voorvoegsel).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Naam);
        }

        /// <summary>
        /// Returns true if Naam instances are equal
        /// </summary>
        /// <param name="input">Instance of Naam to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Naam input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Geslachtsnaam == input.Geslachtsnaam ||
                    (this.Geslachtsnaam != null &&
                    this.Geslachtsnaam.Equals(input.Geslachtsnaam))
                ) && 
                (
                    this.Voorletters == input.Voorletters ||
                    (this.Voorletters != null &&
                    this.Voorletters.Equals(input.Voorletters))
                ) && 
                (
                    this.Voornamen == input.Voornamen ||
                    (this.Voornamen != null &&
                    this.Voornamen.Equals(input.Voornamen))
                ) && 
                (
                    this.Voorvoegsel == input.Voorvoegsel ||
                    (this.Voorvoegsel != null &&
                    this.Voorvoegsel.Equals(input.Voorvoegsel))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Geslachtsnaam != null)
                    hashCode = hashCode * 59 + this.Geslachtsnaam.GetHashCode();
                if (this.Voorletters != null)
                    hashCode = hashCode * 59 + this.Voorletters.GetHashCode();
                if (this.Voornamen != null)
                    hashCode = hashCode * 59 + this.Voornamen.GetHashCode();
                if (this.Voorvoegsel != null)
                    hashCode = hashCode * 59 + this.Voorvoegsel.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
