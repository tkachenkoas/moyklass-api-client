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
 * MKUserRestorePassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserRestorePassword {
  public static final String SERIALIZED_NAME_RESTORE_KEY = "restoreKey";
  @SerializedName(SERIALIZED_NAME_RESTORE_KEY)
  private String restoreKey;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public MKUserRestorePassword restoreKey(String restoreKey) {
    
    this.restoreKey = restoreKey;
    return this;
  }

   /**
   * Ключ восстановления пароля
   * @return restoreKey
  **/
  @ApiModelProperty(required = true, value = "Ключ восстановления пароля")

  public String getRestoreKey() {
    return restoreKey;
  }


  public void setRestoreKey(String restoreKey) {
    this.restoreKey = restoreKey;
  }


  public MKUserRestorePassword password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Новый пароль
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Новый пароль")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKUserRestorePassword userRestorePassword = (MKUserRestorePassword) o;
    return Objects.equals(this.restoreKey, userRestorePassword.restoreKey) &&
        Objects.equals(this.password, userRestorePassword.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreKey, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserRestorePassword {\n");
    sb.append("    restoreKey: ").append(toIndentedString(restoreKey)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

