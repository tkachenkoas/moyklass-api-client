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
import com.moyklass.api.model.MKBillsPaging;
import com.moyklass.api.model.MKUserBill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MKUserBills
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserBills {
  public static final String SERIALIZED_NAME_BILLS = "bills";
  @SerializedName(SERIALIZED_NAME_BILLS)
  private List<MKUserBill> bills = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private MKBillsPaging stats;


  public MKUserBills bills(List<MKUserBill> bills) {
    
    this.bills = bills;
    return this;
  }

  public MKUserBills addBillsItem(MKUserBill billsItem) {
    if (this.bills == null) {
      this.bills = new ArrayList<>();
    }
    this.bills.add(billsItem);
    return this;
  }

   /**
   * Get bills
   * @return bills
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MKUserBill> getBills() {
    return bills;
  }


  public void setBills(List<MKUserBill> bills) {
    this.bills = bills;
  }


  public MKUserBills stats(MKBillsPaging stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKBillsPaging getStats() {
    return stats;
  }


  public void setStats(MKBillsPaging stats) {
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
    MKUserBills userBills = (MKUserBills) o;
    return Objects.equals(this.bills, userBills.bills) &&
        Objects.equals(this.stats, userBills.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bills, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserBills {\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
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

