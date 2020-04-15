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
import java.util.Objects;

/**
 * Списание
 */
@ApiModel(description = "Списание")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserBill {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_SUMMA = "summa";
  @SerializedName(SERIALIZED_NAME_SUMMA)
  private Long summa;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_LESSONS_COUNT = "lessonsCount";
  @SerializedName(SERIALIZED_NAME_LESSONS_COUNT)
  private Long lessonsCount;

  public static final String SERIALIZED_NAME_LESSON_RECORD_ID = "lessonRecordId";
  @SerializedName(SERIALIZED_NAME_LESSON_RECORD_ID)
  private Long lessonRecordId;

  public static final String SERIALIZED_NAME_LESSON_RECORD = "lessonRecord";
  @SerializedName(SERIALIZED_NAME_LESSON_RECORD)
  private MKUserLessonRecordLimited lessonRecord;

  public static final String SERIALIZED_NAME_LESSON_ID = "lessonId";
  @SerializedName(SERIALIZED_NAME_LESSON_ID)
  private Long lessonId;

  public static final String SERIALIZED_NAME_CLASS_ID = "classId";
  @SerializedName(SERIALIZED_NAME_CLASS_ID)
  private Long classId;

  public static final String SERIALIZED_NAME_USER_SUBSCRIPTION_ID = "userSubscriptionId";
  @SerializedName(SERIALIZED_NAME_USER_SUBSCRIPTION_ID)
  private Long userSubscriptionId;


   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID")

  public Long getId() {
    return id;
  }




  public MKUserBill date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Дата списания
   * @return date
  **/
  @ApiModelProperty(example = "Fri Jun 14 03:00:00 IDT 2019", required = true, value = "Дата списания")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public MKUserBill summa(Long summa) {
    
    this.summa = summa;
    return this;
  }

   /**
   * Сумма
   * @return summa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1990", value = "Сумма")

  public Long getSumma() {
    return summa;
  }


  public void setSumma(Long summa) {
    this.summa = summa;
  }


  public MKUserBill userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public MKUserBill lessonsCount(Long lessonsCount) {
    
    this.lessonsCount = lessonsCount;
    return this;
  }

   /**
   * Количество списанных из абонемента занятий
   * @return lessonsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Количество списанных из абонемента занятий")

  public Long getLessonsCount() {
    return lessonsCount;
  }


  public void setLessonsCount(Long lessonsCount) {
    this.lessonsCount = lessonsCount;
  }


  public MKUserBill lessonRecordId(Long lessonRecordId) {
    
    this.lessonRecordId = lessonRecordId;
    return this;
  }

   /**
   * ID записи на занятие, за которое произошло списание
   * @return lessonRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID записи на занятие, за которое произошло списание")

  public Long getLessonRecordId() {
    return lessonRecordId;
  }


  public void setLessonRecordId(Long lessonRecordId) {
    this.lessonRecordId = lessonRecordId;
  }


  public MKUserBill lessonRecord(MKUserLessonRecordLimited lessonRecord) {
    
    this.lessonRecord = lessonRecord;
    return this;
  }

   /**
   * Get lessonRecord
   * @return lessonRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKUserLessonRecordLimited getLessonRecord() {
    return lessonRecord;
  }


  public void setLessonRecord(MKUserLessonRecordLimited lessonRecord) {
    this.lessonRecord = lessonRecord;
  }


  public MKUserBill lessonId(Long lessonId) {
    
    this.lessonId = lessonId;
    return this;
  }

   /**
   * ID занятия, за которое произошло списание
   * @return lessonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID занятия, за которое произошло списание")

  public Long getLessonId() {
    return lessonId;
  }


  public void setLessonId(Long lessonId) {
    this.lessonId = lessonId;
  }


  public MKUserBill classId(Long classId) {
    
    this.classId = classId;
    return this;
  }

   /**
   * ID группы, за которое произошло списание
   * @return classId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID группы, за которое произошло списание")

  public Long getClassId() {
    return classId;
  }


  public void setClassId(Long classId) {
    this.classId = classId;
  }


  public MKUserBill userSubscriptionId(Long userSubscriptionId) {
    
    this.userSubscriptionId = userSubscriptionId;
    return this;
  }

   /**
   * ID абонемента
   * @return userSubscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1504", value = "ID абонемента")

  public Long getUserSubscriptionId() {
    return userSubscriptionId;
  }


  public void setUserSubscriptionId(Long userSubscriptionId) {
    this.userSubscriptionId = userSubscriptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKUserBill userBill = (MKUserBill) o;
    return Objects.equals(this.id, userBill.id) &&
        Objects.equals(this.date, userBill.date) &&
        Objects.equals(this.summa, userBill.summa) &&
        Objects.equals(this.userId, userBill.userId) &&
        Objects.equals(this.lessonsCount, userBill.lessonsCount) &&
        Objects.equals(this.lessonRecordId, userBill.lessonRecordId) &&
        Objects.equals(this.lessonRecord, userBill.lessonRecord) &&
        Objects.equals(this.lessonId, userBill.lessonId) &&
        Objects.equals(this.classId, userBill.classId) &&
        Objects.equals(this.userSubscriptionId, userBill.userSubscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, summa, userId, lessonsCount, lessonRecordId, lessonRecord, lessonId, classId, userSubscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserBill {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    summa: ").append(toIndentedString(summa)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lessonsCount: ").append(toIndentedString(lessonsCount)).append("\n");
    sb.append("    lessonRecordId: ").append(toIndentedString(lessonRecordId)).append("\n");
    sb.append("    lessonRecord: ").append(toIndentedString(lessonRecord)).append("\n");
    sb.append("    lessonId: ").append(toIndentedString(lessonId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    userSubscriptionId: ").append(toIndentedString(userSubscriptionId)).append("\n");
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
