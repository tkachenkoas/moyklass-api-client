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
import com.moyklass.api.model.MKPaymentsPaging;
import com.moyklass.api.model.MKUserPayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MKUserPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserPayments {
  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<MKUserPayment> payments = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private MKPaymentsPaging stats;


  public MKUserPayments payments(List<MKUserPayment> payments) {
    
    this.payments = payments;
    return this;
  }

  public MKUserPayments addPaymentsItem(MKUserPayment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MKUserPayment> getPayments() {
    return payments;
  }


  public void setPayments(List<MKUserPayment> payments) {
    this.payments = payments;
  }


  public MKUserPayments stats(MKPaymentsPaging stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKPaymentsPaging getStats() {
    return stats;
  }


  public void setStats(MKPaymentsPaging stats) {
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
    MKUserPayments userPayments = (MKUserPayments) o;
    return Objects.equals(this.payments, userPayments.payments) &&
        Objects.equals(this.stats, userPayments.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserPayments {\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
