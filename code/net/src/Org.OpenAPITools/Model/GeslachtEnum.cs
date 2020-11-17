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
    /// Geeft aan dat de persoon een man of vrouw is, of dat het geslacht (nog) onbekend is * &#x60;man&#x60; - M * &#x60;vrouw&#x60; - V * &#x60;onbekend&#x60; - O 
    /// </summary>
    /// <value>Geeft aan dat de persoon een man of vrouw is, of dat het geslacht (nog) onbekend is * &#x60;man&#x60; - M * &#x60;vrouw&#x60; - V * &#x60;onbekend&#x60; - O </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum GeslachtEnum
    {
        /// <summary>
        /// Enum Man for value: man
        /// </summary>
        [EnumMember(Value = "man")]
        Man = 1,

        /// <summary>
        /// Enum Vrouw for value: vrouw
        /// </summary>
        [EnumMember(Value = "vrouw")]
        Vrouw = 2,

        /// <summary>
        /// Enum Onbekend for value: onbekend
        /// </summary>
        [EnumMember(Value = "onbekend")]
        Onbekend = 3

    }

}