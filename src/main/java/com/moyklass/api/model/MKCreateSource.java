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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Способ заведения заявки
 */
@ApiModel(description = "Способ заведения заявки")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKCreateSource {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VIEW_NAME = "viewName";
  @SerializedName(SERIALIZED_NAME_VIEW_NAME)
  private String viewName;


   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID")

  public Integer getId() {
    return id;
  }




   /**
   * Название способа
   * @return name
  **/
  @ApiModelProperty(example = "ВКонтакте", required = true, value = "Название способа")

  public String getName() {
    return name;
  }




   /**
   * Детализация способа
   * @return viewName
  **/
  @ApiModelProperty(example = "Виджет: ВКонтакте", required = true, value = "Детализация способа")

  public String getViewName() {
    return viewName;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKCreateSource createSource = (MKCreateSource) o;
    return Objects.equals(this.id, createSource.id) &&
        Objects.equals(this.name, createSource.name) &&
        Objects.equals(this.viewName, createSource.viewName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, viewName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKCreateSource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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

