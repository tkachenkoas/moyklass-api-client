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
 * MKBillsPaging
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKBillsPaging {
  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Integer totalItems;

  public static final String SERIALIZED_NAME_TOTAL_DEPT = "totalDept";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEPT)
  private Integer totalDept;


  public MKBillsPaging totalItems(Integer totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Общее количество строк в результате, без учета limit и offset
   * @return totalItems
  **/
  @ApiModelProperty(example = "5", required = true, value = "Общее количество строк в результате, без учета limit и offset")

  public Integer getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }


  public MKBillsPaging totalDept(Integer totalDept) {
    
    this.totalDept = totalDept;
    return this;
  }

   /**
   * Общее количество занятий в долг
   * @return totalDept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Общее количество занятий в долг")

  public Integer getTotalDept() {
    return totalDept;
  }


  public void setTotalDept(Integer totalDept) {
    this.totalDept = totalDept;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKBillsPaging billsPaging = (MKBillsPaging) o;
    return Objects.equals(this.totalItems, billsPaging.totalItems) &&
        Objects.equals(this.totalDept, billsPaging.totalDept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItems, totalDept);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKBillsPaging {\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalDept: ").append(toIndentedString(totalDept)).append("\n");
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

