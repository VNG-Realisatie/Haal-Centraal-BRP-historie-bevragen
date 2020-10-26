# coding: utf-8

"""
    BRP historie bevragen

    API voor het zoeken en raadplegen van historische verblijfplaatsen, partners, nationaliteiten en verblijfstitels uit de BRP (inclusief de RNI).  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-historie-bevragen/tree/v1.0.0/features) voor nadere toelichting.   # noqa: E501

    The version of the OpenAPI document: 0.0.1 (develop)
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Partner(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'burgerservicenummer': 'str',
        'geslachtsaanduiding': 'GeslachtEnum',
        'soort_verbintenis': 'SoortVerbintenisEnum',
        'naam': 'Naam',
        'geboorte': 'Geboorte',
        'in_onderzoek': 'PartnerInOnderzoek',
        'aangaan_huwelijk_partnerschap': 'AangaanHuwelijkPartnerschap',
        'geheimhouding_persoonsgegevens': 'bool'
    }

    attribute_map = {
        'burgerservicenummer': 'burgerservicenummer',
        'geslachtsaanduiding': 'geslachtsaanduiding',
        'soort_verbintenis': 'soortVerbintenis',
        'naam': 'naam',
        'geboorte': 'geboorte',
        'in_onderzoek': 'inOnderzoek',
        'aangaan_huwelijk_partnerschap': 'aangaanHuwelijkPartnerschap',
        'geheimhouding_persoonsgegevens': 'geheimhoudingPersoonsgegevens'
    }

    def __init__(self, burgerservicenummer=None, geslachtsaanduiding=None, soort_verbintenis=None, naam=None, geboorte=None, in_onderzoek=None, aangaan_huwelijk_partnerschap=None, geheimhouding_persoonsgegevens=None, local_vars_configuration=None):  # noqa: E501
        """Partner - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._burgerservicenummer = None
        self._geslachtsaanduiding = None
        self._soort_verbintenis = None
        self._naam = None
        self._geboorte = None
        self._in_onderzoek = None
        self._aangaan_huwelijk_partnerschap = None
        self._geheimhouding_persoonsgegevens = None
        self.discriminator = None

        if burgerservicenummer is not None:
            self.burgerservicenummer = burgerservicenummer
        if geslachtsaanduiding is not None:
            self.geslachtsaanduiding = geslachtsaanduiding
        if soort_verbintenis is not None:
            self.soort_verbintenis = soort_verbintenis
        if naam is not None:
            self.naam = naam
        if geboorte is not None:
            self.geboorte = geboorte
        if in_onderzoek is not None:
            self.in_onderzoek = in_onderzoek
        if aangaan_huwelijk_partnerschap is not None:
            self.aangaan_huwelijk_partnerschap = aangaan_huwelijk_partnerschap
        if geheimhouding_persoonsgegevens is not None:
            self.geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    @property
    def burgerservicenummer(self):
        """Gets the burgerservicenummer of this Partner.  # noqa: E501


        :return: The burgerservicenummer of this Partner.  # noqa: E501
        :rtype: str
        """
        return self._burgerservicenummer

    @burgerservicenummer.setter
    def burgerservicenummer(self, burgerservicenummer):
        """Sets the burgerservicenummer of this Partner.


        :param burgerservicenummer: The burgerservicenummer of this Partner.  # noqa: E501
        :type: str
        """

        self._burgerservicenummer = burgerservicenummer

    @property
    def geslachtsaanduiding(self):
        """Gets the geslachtsaanduiding of this Partner.  # noqa: E501


        :return: The geslachtsaanduiding of this Partner.  # noqa: E501
        :rtype: GeslachtEnum
        """
        return self._geslachtsaanduiding

    @geslachtsaanduiding.setter
    def geslachtsaanduiding(self, geslachtsaanduiding):
        """Sets the geslachtsaanduiding of this Partner.


        :param geslachtsaanduiding: The geslachtsaanduiding of this Partner.  # noqa: E501
        :type: GeslachtEnum
        """

        self._geslachtsaanduiding = geslachtsaanduiding

    @property
    def soort_verbintenis(self):
        """Gets the soort_verbintenis of this Partner.  # noqa: E501


        :return: The soort_verbintenis of this Partner.  # noqa: E501
        :rtype: SoortVerbintenisEnum
        """
        return self._soort_verbintenis

    @soort_verbintenis.setter
    def soort_verbintenis(self, soort_verbintenis):
        """Sets the soort_verbintenis of this Partner.


        :param soort_verbintenis: The soort_verbintenis of this Partner.  # noqa: E501
        :type: SoortVerbintenisEnum
        """

        self._soort_verbintenis = soort_verbintenis

    @property
    def naam(self):
        """Gets the naam of this Partner.  # noqa: E501


        :return: The naam of this Partner.  # noqa: E501
        :rtype: Naam
        """
        return self._naam

    @naam.setter
    def naam(self, naam):
        """Sets the naam of this Partner.


        :param naam: The naam of this Partner.  # noqa: E501
        :type: Naam
        """

        self._naam = naam

    @property
    def geboorte(self):
        """Gets the geboorte of this Partner.  # noqa: E501


        :return: The geboorte of this Partner.  # noqa: E501
        :rtype: Geboorte
        """
        return self._geboorte

    @geboorte.setter
    def geboorte(self, geboorte):
        """Sets the geboorte of this Partner.


        :param geboorte: The geboorte of this Partner.  # noqa: E501
        :type: Geboorte
        """

        self._geboorte = geboorte

    @property
    def in_onderzoek(self):
        """Gets the in_onderzoek of this Partner.  # noqa: E501


        :return: The in_onderzoek of this Partner.  # noqa: E501
        :rtype: PartnerInOnderzoek
        """
        return self._in_onderzoek

    @in_onderzoek.setter
    def in_onderzoek(self, in_onderzoek):
        """Sets the in_onderzoek of this Partner.


        :param in_onderzoek: The in_onderzoek of this Partner.  # noqa: E501
        :type: PartnerInOnderzoek
        """

        self._in_onderzoek = in_onderzoek

    @property
    def aangaan_huwelijk_partnerschap(self):
        """Gets the aangaan_huwelijk_partnerschap of this Partner.  # noqa: E501


        :return: The aangaan_huwelijk_partnerschap of this Partner.  # noqa: E501
        :rtype: AangaanHuwelijkPartnerschap
        """
        return self._aangaan_huwelijk_partnerschap

    @aangaan_huwelijk_partnerschap.setter
    def aangaan_huwelijk_partnerschap(self, aangaan_huwelijk_partnerschap):
        """Sets the aangaan_huwelijk_partnerschap of this Partner.


        :param aangaan_huwelijk_partnerschap: The aangaan_huwelijk_partnerschap of this Partner.  # noqa: E501
        :type: AangaanHuwelijkPartnerschap
        """

        self._aangaan_huwelijk_partnerschap = aangaan_huwelijk_partnerschap

    @property
    def geheimhouding_persoonsgegevens(self):
        """Gets the geheimhouding_persoonsgegevens of this Partner.  # noqa: E501

        Gegevens mogen niet worden verstrekt aan derden/ maatschappelijke instellingen.   # noqa: E501

        :return: The geheimhouding_persoonsgegevens of this Partner.  # noqa: E501
        :rtype: bool
        """
        return self._geheimhouding_persoonsgegevens

    @geheimhouding_persoonsgegevens.setter
    def geheimhouding_persoonsgegevens(self, geheimhouding_persoonsgegevens):
        """Sets the geheimhouding_persoonsgegevens of this Partner.

        Gegevens mogen niet worden verstrekt aan derden/ maatschappelijke instellingen.   # noqa: E501

        :param geheimhouding_persoonsgegevens: The geheimhouding_persoonsgegevens of this Partner.  # noqa: E501
        :type: bool
        """

        self._geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Partner):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Partner):
            return True

        return self.to_dict() != other.to_dict()
