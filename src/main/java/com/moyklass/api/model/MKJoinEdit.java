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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * MKJoinEdit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKJoinEdit {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  public static final String SERIALIZED_NAME_STATUS_ID = "statusId";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private Long statusId;

  public static final String SERIALIZED_NAME_STATUS_CHANGE_REASON_ID = "statusChangeReasonId";
  @SerializedName(SERIALIZED_NAME_STATUS_CHANGE_REASON_ID)
  private Integer statusChangeReasonId;

  public static final String SERIALIZED_NAME_AUTO_JOIN = "autoJoin";
  @SerializedName(SERIALIZED_NAME_AUTO_JOIN)
  private Boolean autoJoin = true;

  public static final String SERIALIZED_NAME_MANAGER_ID = "managerId";
  @SerializedName(SERIALIZED_NAME_MANAGER_ID)
  private Long managerId = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment = null;

  public static final String SERIALIZED_NAME_ADV_SOURCE_ID = "advSourceId";
  @SerializedName(SERIALIZED_NAME_ADV_SOURCE_ID)
  private Long advSourceId = null;

  public static final String SERIALIZED_NAME_CREATE_SOURCE_ID = "createSourceId";
  @SerializedName(SERIALIZED_NAME_CREATE_SOURCE_ID)
  private Long createSourceId = null;


   /**
   * ID заявки
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "ID заявки")

  public Long getId() {
    return id;
  }




  public MKJoinEdit price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * Цена (для групп с разовой оплатой)
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6000", value = "Цена (для групп с разовой оплатой)")

  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public MKJoinEdit statusId(Long statusId) {
    
    this.statusId = statusId;
    return this;
  }

   /**
   * Статус заявки
   * @return statusId
  **/
  @ApiModelProperty(example = "2", required = true, value = "Статус заявки")

  public Long getStatusId() {
    return statusId;
  }


  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }


  public MKJoinEdit statusChangeReasonId(Integer statusChangeReasonId) {
    
    this.statusChangeReasonId = statusChangeReasonId;
    return this;
  }

   /**
   * ID причины смены статуса
   * @return statusChangeReasonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "ID причины смены статуса")

  public Integer getStatusChangeReasonId() {
    return statusChangeReasonId;
  }


  public void setStatusChangeReasonId(Integer statusChangeReasonId) {
    this.statusChangeReasonId = statusChangeReasonId;
  }


  public MKJoinEdit autoJoin(Boolean autoJoin) {
    
    this.autoJoin = autoJoin;
    return this;
  }

   /**
   * Автоматически записывать в статусе \&quot;Учится\&quot; на все занятия в группе
   * @return autoJoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Автоматически записывать в статусе \"Учится\" на все занятия в группе")

  public Boolean getAutoJoin() {
    return autoJoin;
  }


  public void setAutoJoin(Boolean autoJoin) {
    this.autoJoin = autoJoin;
  }


  public MKJoinEdit managerId(Long managerId) {
    
    this.managerId = managerId;
    return this;
  }

   /**
   * Get managerId
   * @return managerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getManagerId() {
    return managerId;
  }


  public void setManagerId(Long managerId) {
    this.managerId = managerId;
  }


  public MKJoinEdit comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public MKJoinEdit advSourceId(Long advSourceId) {
    
    this.advSourceId = advSourceId;
    return this;
  }

   /**
   * Get advSourceId
   * @return advSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAdvSourceId() {
    return advSourceId;
  }


  public void setAdvSourceId(Long advSourceId) {
    this.advSourceId = advSourceId;
  }


  public MKJoinEdit createSourceId(Long createSourceId) {
    
    this.createSourceId = createSourceId;
    return this;
  }

   /**
   * Get createSourceId
   * @return createSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreateSourceId() {
    return createSourceId;
  }


  public void setCreateSourceId(Long createSourceId) {
    this.createSourceId = createSourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKJoinEdit joinEdit = (MKJoinEdit) o;
    return Objects.equals(this.id, joinEdit.id) &&
        Objects.equals(this.price, joinEdit.price) &&
        Objects.equals(this.statusId, joinEdit.statusId) &&
        Objects.equals(this.statusChangeReasonId, joinEdit.statusChangeReasonId) &&
        Objects.equals(this.autoJoin, joinEdit.autoJoin) &&
        Objects.equals(this.managerId, joinEdit.managerId) &&
        Objects.equals(this.comment, joinEdit.comment) &&
        Objects.equals(this.advSourceId, joinEdit.advSourceId) &&
        Objects.equals(this.createSourceId, joinEdit.createSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, statusId, statusChangeReasonId, autoJoin, managerId, comment, advSourceId, createSourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKJoinEdit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusChangeReasonId: ").append(toIndentedString(statusChangeReasonId)).append("\n");
    sb.append("    autoJoin: ").append(toIndentedString(autoJoin)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    advSourceId: ").append(toIndentedString(advSourceId)).append("\n");
    sb.append("    createSourceId: ").append(toIndentedString(createSourceId)).append("\n");
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
