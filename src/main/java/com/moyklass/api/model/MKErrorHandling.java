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
 * MKErrorHandling
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKErrorHandling {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;


  public MKErrorHandling code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Код ошибки
   * @return code
  **/
  @ApiModelProperty(example = "RequestValidationError", required = true, value = "Код ошибки")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public MKErrorHandling message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Описание ошибки
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Описание ошибки")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public MKErrorHandling meta(Object meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Дополнительная информация об ошибке
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Дополнительная информация об ошибке")

  public Object getMeta() {
    return meta;
  }


  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKErrorHandling errorHandling = (MKErrorHandling) o;
    return Objects.equals(this.code, errorHandling.code) &&
        Objects.equals(this.message, errorHandling.message) &&
        Objects.equals(this.meta, errorHandling.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKErrorHandling {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

