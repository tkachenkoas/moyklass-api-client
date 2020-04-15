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

import java.util.Date;
import java.util.Objects;

/**
 * MKLessonRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKLessonRecord {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_LESSON_ID = "lessonId";
  @SerializedName(SERIALIZED_NAME_LESSON_ID)
  private Long lessonId;

  public static final String SERIALIZED_NAME_FREE = "free";
  @SerializedName(SERIALIZED_NAME_FREE)
  private Boolean free = false;

  public static final String SERIALIZED_NAME_VISIT = "visit";
  @SerializedName(SERIALIZED_NAME_VISIT)
  private Boolean visit = false;

  public static final String SERIALIZED_NAME_GOOD_REASON = "goodReason";
  @SerializedName(SERIALIZED_NAME_GOOD_REASON)
  private Boolean goodReason = false;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test = false;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Boolean skip = false;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt = null;


   /**
   * ID записи
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "ID записи")

  public Long getId() {
    return id;
  }




  public MKLessonRecord userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public MKLessonRecord lessonId(Long lessonId) {
    
    this.lessonId = lessonId;
    return this;
  }

   /**
   * ID занятия
   * @return lessonId
  **/
  @ApiModelProperty(example = "300", required = true, value = "ID занятия")

  public Long getLessonId() {
    return lessonId;
  }


  public void setLessonId(Long lessonId) {
    this.lessonId = lessonId;
  }


  public MKLessonRecord free(Boolean free) {
    
    this.free = free;
    return this;
  }

   /**
   * Бесплатная запись (посещение для ученика будет бесплатным)
   * @return free
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Бесплатная запись (посещение для ученика будет бесплатным)")

  public Boolean getFree() {
    return free;
  }


  public void setFree(Boolean free) {
    this.free = free;
  }


  public MKLessonRecord visit(Boolean visit) {
    
    this.visit = visit;
    return this;
  }

   /**
   * Статус посещения (true - ученик посетил занятие, false - пропустил)
   * @return visit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Статус посещения (true - ученик посетил занятие, false - пропустил)")

  public Boolean getVisit() {
    return visit;
  }


  public void setVisit(Boolean visit) {
    this.visit = visit;
  }


  public MKLessonRecord goodReason(Boolean goodReason) {
    
    this.goodReason = goodReason;
    return this;
  }

   /**
   * Уважительная причина отсутствия (true - есть уважительная причина, false - нет)
   * @return goodReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Уважительная причина отсутствия (true - есть уважительная причина, false - нет)")

  public Boolean getGoodReason() {
    return goodReason;
  }


  public void setGoodReason(Boolean goodReason) {
    this.goodReason = goodReason;
  }


   /**
   * Пробная запись на занятие
   * @return test
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Пробная запись на занятие")

  public Boolean getTest() {
    return test;
  }




   /**
   * Не учитывать запись в количестве занятых мест
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Не учитывать запись в количестве занятых мест")

  public Boolean getSkip() {
    return skip;
  }




  public MKLessonRecord createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKLessonRecord lessonRecord = (MKLessonRecord) o;
    return Objects.equals(this.id, lessonRecord.id) &&
        Objects.equals(this.userId, lessonRecord.userId) &&
        Objects.equals(this.lessonId, lessonRecord.lessonId) &&
        Objects.equals(this.free, lessonRecord.free) &&
        Objects.equals(this.visit, lessonRecord.visit) &&
        Objects.equals(this.goodReason, lessonRecord.goodReason) &&
        Objects.equals(this.test, lessonRecord.test) &&
        Objects.equals(this.skip, lessonRecord.skip) &&
        Objects.equals(this.createdAt, lessonRecord.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, lessonId, free, visit, goodReason, test, skip, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKLessonRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lessonId: ").append(toIndentedString(lessonId)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    visit: ").append(toIndentedString(visit)).append("\n");
    sb.append("    goodReason: ").append(toIndentedString(goodReason)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

