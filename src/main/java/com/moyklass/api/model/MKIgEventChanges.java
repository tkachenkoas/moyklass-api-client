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
 * MKIgEventChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKIgEventChanges {
  public static final String SERIALIZED_NAME_LEAD = "lead";
  @SerializedName(SERIALIZED_NAME_LEAD)
  private Object lead;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Object _object;


  public MKIgEventChanges lead(Object lead) {
    
    this.lead = lead;
    return this;
  }

   /**
   * Get lead
   * @return lead
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getLead() {
    return lead;
  }


  public void setLead(Object lead) {
    this.lead = lead;
  }


  public MKIgEventChanges _object(Object _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getObject() {
    return _object;
  }


  public void setObject(Object _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKIgEventChanges igEventChanges = (MKIgEventChanges) o;
    return Objects.equals(this.lead, igEventChanges.lead) &&
        Objects.equals(this._object, igEventChanges._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lead, _object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKIgEventChanges {\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
