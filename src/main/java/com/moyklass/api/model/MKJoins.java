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
import com.moyklass.api.model.MKJoin;
import com.moyklass.api.model.MKPaging;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MKJoins
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKJoins {
  public static final String SERIALIZED_NAME_JOINS = "joins";
  @SerializedName(SERIALIZED_NAME_JOINS)
  private List<MKJoin> joins = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private MKPaging stats;


  public MKJoins joins(List<MKJoin> joins) {
    
    this.joins = joins;
    return this;
  }

  public MKJoins addJoinsItem(MKJoin joinsItem) {
    if (this.joins == null) {
      this.joins = new ArrayList<>();
    }
    this.joins.add(joinsItem);
    return this;
  }

   /**
   * Get joins
   * @return joins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MKJoin> getJoins() {
    return joins;
  }


  public void setJoins(List<MKJoin> joins) {
    this.joins = joins;
  }


  public MKJoins stats(MKPaging stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKPaging getStats() {
    return stats;
  }


  public void setStats(MKPaging stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKJoins joins = (MKJoins) o;
    return Objects.equals(this.joins, joins.joins) &&
        Objects.equals(this.stats, joins.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joins, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKJoins {\n");
    sb.append("    joins: ").append(toIndentedString(joins)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

