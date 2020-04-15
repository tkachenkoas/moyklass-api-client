/*
 * API для работы с CRM \"Мой Класс\"
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.moyklass.api.model;

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

/**
 * MKLkSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKLkSettings {
  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_ACCENT_COLOR = "accentColor";
  @SerializedName(SERIALIZED_NAME_ACCENT_COLOR)
  private String accentColor;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Object contacts;

  public static final String SERIALIZED_NAME_ALLOW_PAGES = "allowPages";
  @SerializedName(SERIALIZED_NAME_ALLOW_PAGES)
  private Object allowPages;

  public static final String SERIALIZED_NAME_SELECT_LESSONS = "selectLessons";
  @SerializedName(SERIALIZED_NAME_SELECT_LESSONS)
  private String selectLessons;

  public static final String SERIALIZED_NAME_ALLOW_RECORDS = "allowRecords";
  @SerializedName(SERIALIZED_NAME_ALLOW_RECORDS)
  private Boolean allowRecords;

  public static final String SERIALIZED_NAME_ALLOW_RECORDS_TIMEOUT = "allowRecordsTimeout";
  @SerializedName(SERIALIZED_NAME_ALLOW_RECORDS_TIMEOUT)
  private Integer allowRecordsTimeout;

  public static final String SERIALIZED_NAME_CANCEL_RECORDS = "cancelRecords";
  @SerializedName(SERIALIZED_NAME_CANCEL_RECORDS)
  private String cancelRecords;

  public static final String SERIALIZED_NAME_CANCEL_RECORDS_TIMEOUT = "cancelRecordsTimeout";
  @SerializedName(SERIALIZED_NAME_CANCEL_RECORDS_TIMEOUT)
  private Integer cancelRecordsTimeout;


  public MKLkSettings companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Название компании
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Название компании")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public MKLkSettings logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Логотип
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Логотип")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public MKLkSettings color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Основной цвет
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Основной цвет")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public MKLkSettings accentColor(String accentColor) {
    
    this.accentColor = accentColor;
    return this;
  }

   /**
   * Цвет кнопок
   * @return accentColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Цвет кнопок")

  public String getAccentColor() {
    return accentColor;
  }


  public void setAccentColor(String accentColor) {
    this.accentColor = accentColor;
  }


  public MKLkSettings contacts(Object contacts) {
    
    this.contacts = contacts;
    return this;
  }

   /**
   * Контакты компании
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Контакты компании")

  public Object getContacts() {
    return contacts;
  }


  public void setContacts(Object contacts) {
    this.contacts = contacts;
  }


  public MKLkSettings allowPages(Object allowPages) {
    
    this.allowPages = allowPages;
    return this;
  }

   /**
   * Страницы, доступные для просмотра
   * @return allowPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Страницы, доступные для просмотра")

  public Object getAllowPages() {
    return allowPages;
  }


  public void setAllowPages(Object allowPages) {
    this.allowPages = allowPages;
  }


  public MKLkSettings selectLessons(String selectLessons) {
    
    this.selectLessons = selectLessons;
    return this;
  }

   /**
   * Выбор занятий при записи в группу
   * @return selectLessons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Выбор занятий при записи в группу")

  public String getSelectLessons() {
    return selectLessons;
  }


  public void setSelectLessons(String selectLessons) {
    this.selectLessons = selectLessons;
  }


  public MKLkSettings allowRecords(Boolean allowRecords) {
    
    this.allowRecords = allowRecords;
    return this;
  }

   /**
   * Разрешать запись на занятия
   * @return allowRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Разрешать запись на занятия")

  public Boolean getAllowRecords() {
    return allowRecords;
  }


  public void setAllowRecords(Boolean allowRecords) {
    this.allowRecords = allowRecords;
  }


  public MKLkSettings allowRecordsTimeout(Integer allowRecordsTimeout) {
    
    this.allowRecordsTimeout = allowRecordsTimeout;
    return this;
  }

   /**
   * За сколько минут до начала запрещать запись
   * @return allowRecordsTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "За сколько минут до начала запрещать запись")

  public Integer getAllowRecordsTimeout() {
    return allowRecordsTimeout;
  }


  public void setAllowRecordsTimeout(Integer allowRecordsTimeout) {
    this.allowRecordsTimeout = allowRecordsTimeout;
  }


  public MKLkSettings cancelRecords(String cancelRecords) {
    
    this.cancelRecords = cancelRecords;
    return this;
  }

   /**
   * Разрешать запись на занятия
   * @return cancelRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Разрешать запись на занятия")

  public String getCancelRecords() {
    return cancelRecords;
  }


  public void setCancelRecords(String cancelRecords) {
    this.cancelRecords = cancelRecords;
  }


  public MKLkSettings cancelRecordsTimeout(Integer cancelRecordsTimeout) {
    
    this.cancelRecordsTimeout = cancelRecordsTimeout;
    return this;
  }

   /**
   * За сколько минут до начала запрещать отменять запись
   * @return cancelRecordsTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "За сколько минут до начала запрещать отменять запись")

  public Integer getCancelRecordsTimeout() {
    return cancelRecordsTimeout;
  }


  public void setCancelRecordsTimeout(Integer cancelRecordsTimeout) {
    this.cancelRecordsTimeout = cancelRecordsTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKLkSettings lkSettings = (MKLkSettings) o;
    return Objects.equals(this.companyName, lkSettings.companyName) &&
        Objects.equals(this.logo, lkSettings.logo) &&
        Objects.equals(this.color, lkSettings.color) &&
        Objects.equals(this.accentColor, lkSettings.accentColor) &&
        Objects.equals(this.contacts, lkSettings.contacts) &&
        Objects.equals(this.allowPages, lkSettings.allowPages) &&
        Objects.equals(this.selectLessons, lkSettings.selectLessons) &&
        Objects.equals(this.allowRecords, lkSettings.allowRecords) &&
        Objects.equals(this.allowRecordsTimeout, lkSettings.allowRecordsTimeout) &&
        Objects.equals(this.cancelRecords, lkSettings.cancelRecords) &&
        Objects.equals(this.cancelRecordsTimeout, lkSettings.cancelRecordsTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, logo, color, accentColor, contacts, allowPages, selectLessons, allowRecords, allowRecordsTimeout, cancelRecords, cancelRecordsTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKLkSettings {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    accentColor: ").append(toIndentedString(accentColor)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    allowPages: ").append(toIndentedString(allowPages)).append("\n");
    sb.append("    selectLessons: ").append(toIndentedString(selectLessons)).append("\n");
    sb.append("    allowRecords: ").append(toIndentedString(allowRecords)).append("\n");
    sb.append("    allowRecordsTimeout: ").append(toIndentedString(allowRecordsTimeout)).append("\n");
    sb.append("    cancelRecords: ").append(toIndentedString(cancelRecords)).append("\n");
    sb.append("    cancelRecordsTimeout: ").append(toIndentedString(cancelRecordsTimeout)).append("\n");
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

