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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Абонемент
 */
@ApiModel(description = "Абонемент")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserSubscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SELL_DATE = "sellDate";
  @SerializedName(SERIALIZED_NAME_SELL_DATE)
  private LocalDate sellDate;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  public static final String SERIALIZED_NAME_PAYED = "payed";
  @SerializedName(SERIALIZED_NAME_PAYED)
  private Long payed;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_REMIND_DATE = "remindDate";
  @SerializedName(SERIALIZED_NAME_REMIND_DATE)
  private LocalDate remindDate;

  public static final String SERIALIZED_NAME_REMIND_SUMM = "remindSumm";
  @SerializedName(SERIALIZED_NAME_REMIND_SUMM)
  private Long remindSumm;

  public static final String SERIALIZED_NAME_CLASS_IDS = "classIds";
  @SerializedName(SERIALIZED_NAME_CLASS_IDS)
  private List<Long> classIds = null;

  public static final String SERIALIZED_NAME_COURSE_IDS = "courseIds";
  @SerializedName(SERIALIZED_NAME_COURSE_IDS)
  private List<Long> courseIds = null;

  public static final String SERIALIZED_NAME_FREEZE_FROM = "freezeFrom";
  @SerializedName(SERIALIZED_NAME_FREEZE_FROM)
  private LocalDate freezeFrom;

  public static final String SERIALIZED_NAME_FREEZE_TO = "freezeTo";
  @SerializedName(SERIALIZED_NAME_FREEZE_TO)
  private LocalDate freezeTo;

  public static final String SERIALIZED_NAME_VISIT_COUNT = "visitCount";
  @SerializedName(SERIALIZED_NAME_VISIT_COUNT)
  private Long visitCount;

  public static final String SERIALIZED_NAME_VISITED_COUNT = "visitedCount";
  @SerializedName(SERIALIZED_NAME_VISITED_COUNT)
  private Long visitedCount;

  public static final String SERIALIZED_NAME_STATUS_ID = "statusId";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private Long statusId;


   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID")

  public Long getId() {
    return id;
  }




  public MKUserSubscription sellDate(LocalDate sellDate) {
    
    this.sellDate = sellDate;
    return this;
  }

   /**
   * Дата продажи
   * @return sellDate
  **/
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", required = true, value = "Дата продажи")

  public LocalDate getSellDate() {
    return sellDate;
  }


  public void setSellDate(LocalDate sellDate) {
    this.sellDate = sellDate;
  }


  public MKUserSubscription beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Дата начала действия
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", value = "Дата начала действия")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public MKUserSubscription endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Дата окончания действия
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", value = "Дата окончания действия")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public MKUserSubscription price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * Стоимость
   * @return price
  **/
  @ApiModelProperty(example = "1990", required = true, value = "Стоимость")

  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public MKUserSubscription payed(Long payed) {
    
    this.payed = payed;
    return this;
  }

   /**
   * Оплаченная сумма
   * @return payed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "990", value = "Оплаченная сумма")

  public Long getPayed() {
    return payed;
  }


  public void setPayed(Long payed) {
    this.payed = payed;
  }


  public MKUserSubscription userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID ученика
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "ID ученика")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public MKUserSubscription remindDate(LocalDate remindDate) {
    
    this.remindDate = remindDate;
    return this;
  }

   /**
   * Срок оплаты долга
   * @return remindDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", value = "Срок оплаты долга")

  public LocalDate getRemindDate() {
    return remindDate;
  }


  public void setRemindDate(LocalDate remindDate) {
    this.remindDate = remindDate;
  }


  public MKUserSubscription remindSumm(Long remindSumm) {
    
    this.remindSumm = remindSumm;
    return this;
  }

   /**
   * Сумма долга к оплате
   * @return remindSumm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "Сумма долга к оплате")

  public Long getRemindSumm() {
    return remindSumm;
  }


  public void setRemindSumm(Long remindSumm) {
    this.remindSumm = remindSumm;
  }


  public MKUserSubscription classIds(List<Long> classIds) {
    
    this.classIds = classIds;
    return this;
  }

  public MKUserSubscription addClassIdsItem(Long classIdsItem) {
    if (this.classIds == null) {
      this.classIds = new ArrayList<>();
    }
    this.classIds.add(classIdsItem);
    return this;
  }

   /**
   * Группы, в которых действует абонемент
   * @return classIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Группы, в которых действует абонемент")

  public List<Long> getClassIds() {
    return classIds;
  }


  public void setClassIds(List<Long> classIds) {
    this.classIds = classIds;
  }


  public MKUserSubscription courseIds(List<Long> courseIds) {
    
    this.courseIds = courseIds;
    return this;
  }

  public MKUserSubscription addCourseIdsItem(Long courseIdsItem) {
    if (this.courseIds == null) {
      this.courseIds = new ArrayList<>();
    }
    this.courseIds.add(courseIdsItem);
    return this;
  }

   /**
   * Программы, в которых действует абонемент
   * @return courseIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Программы, в которых действует абонемент")

  public List<Long> getCourseIds() {
    return courseIds;
  }


  public void setCourseIds(List<Long> courseIds) {
    this.courseIds = courseIds;
  }


  public MKUserSubscription freezeFrom(LocalDate freezeFrom) {
    
    this.freezeFrom = freezeFrom;
    return this;
  }

   /**
   * Дата начала заморозки
   * @return freezeFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", value = "Дата начала заморозки")

  public LocalDate getFreezeFrom() {
    return freezeFrom;
  }


  public void setFreezeFrom(LocalDate freezeFrom) {
    this.freezeFrom = freezeFrom;
  }


  public MKUserSubscription freezeTo(LocalDate freezeTo) {
    
    this.freezeTo = freezeTo;
    return this;
  }

   /**
   * Дата окончания заморозки
   * @return freezeTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", value = "Дата окончания заморозки")

  public LocalDate getFreezeTo() {
    return freezeTo;
  }


  public void setFreezeTo(LocalDate freezeTo) {
    this.freezeTo = freezeTo;
  }


  public MKUserSubscription visitCount(Long visitCount) {
    
    this.visitCount = visitCount;
    return this;
  }

   /**
   * Количество занятий в абонементе
   * @return visitCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Количество занятий в абонементе")

  public Long getVisitCount() {
    return visitCount;
  }


  public void setVisitCount(Long visitCount) {
    this.visitCount = visitCount;
  }


  public MKUserSubscription visitedCount(Long visitedCount) {
    
    this.visitedCount = visitedCount;
    return this;
  }

   /**
   * Количество списанных занятий в абонементе.
   * @return visitedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Количество списанных занятий в абонементе.")

  public Long getVisitedCount() {
    return visitedCount;
  }


  public void setVisitedCount(Long visitedCount) {
    this.visitedCount = visitedCount;
  }


  public MKUserSubscription statusId(Long statusId) {
    
    this.statusId = statusId;
    return this;
  }

   /**
   * Статус абонемента: * &#x60;1&#x60; - Не активный * &#x60;2&#x60; - Активный * &#x60;3&#x60; - Заморожен * &#x60;4&#x60; - Окончен 
   * @return statusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Статус абонемента: * `1` - Не активный * `2` - Активный * `3` - Заморожен * `4` - Окончен ")

  public Long getStatusId() {
    return statusId;
  }


  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKUserSubscription userSubscription = (MKUserSubscription) o;
    return Objects.equals(this.id, userSubscription.id) &&
        Objects.equals(this.sellDate, userSubscription.sellDate) &&
        Objects.equals(this.beginDate, userSubscription.beginDate) &&
        Objects.equals(this.endDate, userSubscription.endDate) &&
        Objects.equals(this.price, userSubscription.price) &&
        Objects.equals(this.payed, userSubscription.payed) &&
        Objects.equals(this.userId, userSubscription.userId) &&
        Objects.equals(this.remindDate, userSubscription.remindDate) &&
        Objects.equals(this.remindSumm, userSubscription.remindSumm) &&
        Objects.equals(this.classIds, userSubscription.classIds) &&
        Objects.equals(this.courseIds, userSubscription.courseIds) &&
        Objects.equals(this.freezeFrom, userSubscription.freezeFrom) &&
        Objects.equals(this.freezeTo, userSubscription.freezeTo) &&
        Objects.equals(this.visitCount, userSubscription.visitCount) &&
        Objects.equals(this.visitedCount, userSubscription.visitedCount) &&
        Objects.equals(this.statusId, userSubscription.statusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellDate, beginDate, endDate, price, payed, userId, remindDate, remindSumm, classIds, courseIds, freezeFrom, freezeTo, visitCount, visitedCount, statusId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellDate: ").append(toIndentedString(sellDate)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    payed: ").append(toIndentedString(payed)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    remindDate: ").append(toIndentedString(remindDate)).append("\n");
    sb.append("    remindSumm: ").append(toIndentedString(remindSumm)).append("\n");
    sb.append("    classIds: ").append(toIndentedString(classIds)).append("\n");
    sb.append("    courseIds: ").append(toIndentedString(courseIds)).append("\n");
    sb.append("    freezeFrom: ").append(toIndentedString(freezeFrom)).append("\n");
    sb.append("    freezeTo: ").append(toIndentedString(freezeTo)).append("\n");
    sb.append("    visitCount: ").append(toIndentedString(visitCount)).append("\n");
    sb.append("    visitedCount: ").append(toIndentedString(visitedCount)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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

