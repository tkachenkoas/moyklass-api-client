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

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * MKTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKTask {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private OffsetDateTime beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_ALL_DAY = "isAllDay";
  @SerializedName(SERIALIZED_NAME_IS_ALL_DAY)
  private Boolean isAllDay = false;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "isComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete = false;

  public static final String SERIALIZED_NAME_REMINDS = "reminds";
  @SerializedName(SERIALIZED_NAME_REMINDS)
  private List<Long> reminds = null;

  public static final String SERIALIZED_NAME_MANAGER_ID = "managerId";
  @SerializedName(SERIALIZED_NAME_MANAGER_ID)
  private Long managerId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_CLASS_ID = "classId";
  @SerializedName(SERIALIZED_NAME_CLASS_ID)
  private Long classId;

  public static final String SERIALIZED_NAME_FILIAL_ID = "filialId";
  @SerializedName(SERIALIZED_NAME_FILIAL_ID)
  private Long filialId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Long categoryId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt = null;


   /**
   * ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "ID")

  public Long getId() {
    return id;
  }




  public MKTask body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Текст задачи
   * @return body
  **/
  @ApiModelProperty(example = "Позвонить Иванову Павлу, предложить абонемент", required = true, value = "Текст задачи")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public MKTask beginDate(OffsetDateTime beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Начало задачи
   * @return beginDate
  **/
  @ApiModelProperty(example = "2019-06-13T10:00Z", required = true, value = "Начало задачи")

  public OffsetDateTime getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
  }


  public MKTask endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Окончание задачи
   * @return endDate
  **/
  @ApiModelProperty(example = "2019-06-13T10:00Z", required = true, value = "Окончание задачи")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public MKTask isAllDay(Boolean isAllDay) {
    
    this.isAllDay = isAllDay;
    return this;
  }

   /**
   * Задача на весь день
   * @return isAllDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Задача на весь день")

  public Boolean getIsAllDay() {
    return isAllDay;
  }


  public void setIsAllDay(Boolean isAllDay) {
    this.isAllDay = isAllDay;
  }


  public MKTask isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * Задача выполнена
   * @return isComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Задача выполнена")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public MKTask reminds(List<Long> reminds) {
    
    this.reminds = reminds;
    return this;
  }

  public MKTask addRemindsItem(Long remindsItem) {
    if (this.reminds == null) {
      this.reminds = new ArrayList<>();
    }
    this.reminds.add(remindsItem);
    return this;
  }

   /**
   * За сколько времени напомнить о задаче (в миллисекундах)
   * @return reminds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[900000,3600000]", value = "За сколько времени напомнить о задаче (в миллисекундах)")

  public List<Long> getReminds() {
    return reminds;
  }


  public void setReminds(List<Long> reminds) {
    this.reminds = reminds;
  }


  public MKTask managerId(Long managerId) {
    
    this.managerId = managerId;
    return this;
  }

   /**
   * ID сотрудника
   * @return managerId
  **/
  @ApiModelProperty(example = "300", required = true, value = "ID сотрудника")

  public Long getManagerId() {
    return managerId;
  }


  public void setManagerId(Long managerId) {
    this.managerId = managerId;
  }


  public MKTask userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID ученика
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "ID ученика")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public MKTask classId(Long classId) {
    
    this.classId = classId;
    return this;
  }

   /**
   * ID группы
   * @return classId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", value = "ID группы")

  public Long getClassId() {
    return classId;
  }


  public void setClassId(Long classId) {
    this.classId = classId;
  }


  public MKTask filialId(Long filialId) {
    
    this.filialId = filialId;
    return this;
  }

   /**
   * ID филиала
   * @return filialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "ID филиала")

  public Long getFilialId() {
    return filialId;
  }


  public void setFilialId(Long filialId) {
    this.filialId = filialId;
  }


  public MKTask categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * ID категории задачи
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "ID категории задачи")

  public Long getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public MKTask createdAt(Date createdAt) {
    
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
    MKTask task = (MKTask) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.body, task.body) &&
        Objects.equals(this.beginDate, task.beginDate) &&
        Objects.equals(this.endDate, task.endDate) &&
        Objects.equals(this.isAllDay, task.isAllDay) &&
        Objects.equals(this.isComplete, task.isComplete) &&
        Objects.equals(this.reminds, task.reminds) &&
        Objects.equals(this.managerId, task.managerId) &&
        Objects.equals(this.userId, task.userId) &&
        Objects.equals(this.classId, task.classId) &&
        Objects.equals(this.filialId, task.filialId) &&
        Objects.equals(this.categoryId, task.categoryId) &&
        Objects.equals(this.createdAt, task.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, beginDate, endDate, isAllDay, isComplete, reminds, managerId, userId, classId, filialId, categoryId, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isAllDay: ").append(toIndentedString(isAllDay)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    reminds: ").append(toIndentedString(reminds)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    filialId: ").append(toIndentedString(filialId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

