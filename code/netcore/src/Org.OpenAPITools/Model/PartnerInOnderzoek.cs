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
    /// Geeft aan welke gegevens over het huwelijk of het partnerschap in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.0.0/features/in_onderzoek.feature) 
    /// </summary>
    [DataContract]
    public partial class PartnerInOnderzoek :  IEquatable<PartnerInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartnerInOnderzoek" /> class.
        /// </summary>
        /// <param name="burgerservicenummer">burgerservicenummer.</param>
        /// <param name="geslachtsaanduiding">geslachtsaanduiding.</param>
        /// <param name="soortVerbintenis">soortVerbintenis.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public PartnerInOnderzoek(bool burgerservicenummer = default(bool), bool geslachtsaanduiding = default(bool), bool soortVerbintenis = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.Burgerservicenummer = burgerservicenummer;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.SoortVerbintenis = soortVerbintenis;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }
        
        /// <summary>
        /// Gets or Sets Burgerservicenummer
        /// </summary>
        [DataMember(Name="burgerservicenummer", EmitDefaultValue=false)]
        public bool Burgerservicenummer { get; set; }

        /// <summary>
        /// Gets or Sets Geslachtsaanduiding
        /// </summary>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public bool Geslachtsaanduiding { get; set; }

        /// <summary>
        /// Gets or Sets SoortVerbintenis
        /// </summary>
        [DataMember(Name="soortVerbintenis", EmitDefaultValue=false)]
        public bool SoortVerbintenis { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name="datumIngangOnderzoek", EmitDefaultValue=false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PartnerInOnderzoek {\n");
            sb.Append("  Burgerservicenummer: ").Append(Burgerservicenummer).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  SoortVerbintenis: ").Append(SoortVerbintenis).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
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
            return this.Equals(input as PartnerInOnderzoek);
        }

        /// <summary>
        /// Returns true if PartnerInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of PartnerInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartnerInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Burgerservicenummer == input.Burgerservicenummer ||
                    this.Burgerservicenummer.Equals(input.Burgerservicenummer)
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding)
                ) && 
                (
                    this.SoortVerbintenis == input.SoortVerbintenis ||
                    this.SoortVerbintenis.Equals(input.SoortVerbintenis)
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
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
                hashCode = hashCode * 59 + this.Burgerservicenummer.GetHashCode();
                hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                hashCode = hashCode * 59 + this.SoortVerbintenis.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
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
