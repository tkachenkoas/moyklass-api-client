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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MKUserJoin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserJoin {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_CLASS_ID = "classId";
  @SerializedName(SERIALIZED_NAME_CLASS_ID)
  private Long classId = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  /**
   * Статус заявки
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STUDY("study"),
    
    OVER("over");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_AUTO_JOIN = "autoJoin";
  @SerializedName(SERIALIZED_NAME_AUTO_JOIN)
  private Boolean autoJoin = true;

  public static final String SERIALIZED_NAME_REMIND_DATE = "remindDate";
  @SerializedName(SERIALIZED_NAME_REMIND_DATE)
  private LocalDate remindDate;

  public static final String SERIALIZED_NAME_REMIND_SUM = "remindSum";
  @SerializedName(SERIALIZED_NAME_REMIND_SUM)
  private Long remindSum;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private MKJoinStats stats;

  public static final String SERIALIZED_NAME_LESSON_IDS = "lessonIds";
  @SerializedName(SERIALIZED_NAME_LESSON_IDS)
  private List<Long> lessonIds = null;


   /**
   * ID заявки
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "ID заявки")

  public Long getId() {
    return id;
  }




  public MKUserJoin userId(Long userId) {
    
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


  public MKUserJoin classId(Long classId) {
    
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getClassId() {
    return classId;
  }


  public void setClassId(Long classId) {
    this.classId = classId;
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




   /**
   * Статус заявки
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Статус заявки")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Автоматическая записывать на все занятия в группе
   * @return autoJoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Автоматическая записывать на все занятия в группе")

  public Boolean getAutoJoin() {
    return autoJoin;
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




   /**
   * Сумма долга к оплате
   * @return remindSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "Сумма долга к оплате")

  public Long getRemindSum() {
    return remindSum;
  }




  public MKUserJoin stats(MKJoinStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKJoinStats getStats() {
    return stats;
  }


  public void setStats(MKJoinStats stats) {
    this.stats = stats;
  }


  public MKUserJoin lessonIds(List<Long> lessonIds) {
    
    this.lessonIds = lessonIds;
    return this;
  }

  public MKUserJoin addLessonIdsItem(Long lessonIdsItem) {
    if (this.lessonIds == null) {
      this.lessonIds = new ArrayList<>();
    }
    this.lessonIds.add(lessonIdsItem);
    return this;
  }

   /**
   * ID занятий, на которые нужно записать ученика при создании заявки
   * @return lessonIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID занятий, на которые нужно записать ученика при создании заявки")

  public List<Long> getLessonIds() {
    return lessonIds;
  }


  public void setLessonIds(List<Long> lessonIds) {
    this.lessonIds = lessonIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKUserJoin userJoin = (MKUserJoin) o;
    return Objects.equals(this.id, userJoin.id) &&
        Objects.equals(this.userId, userJoin.userId) &&
        Objects.equals(this.classId, userJoin.classId) &&
        Objects.equals(this.price, userJoin.price) &&
        Objects.equals(this.status, userJoin.status) &&
        Objects.equals(this.autoJoin, userJoin.autoJoin) &&
        Objects.equals(this.remindDate, userJoin.remindDate) &&
        Objects.equals(this.remindSum, userJoin.remindSum) &&
        Objects.equals(this.stats, userJoin.stats) &&
        Objects.equals(this.lessonIds, userJoin.lessonIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, classId, price, status, autoJoin, remindDate, remindSum, stats, lessonIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserJoin {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    autoJoin: ").append(toIndentedString(autoJoin)).append("\n");
    sb.append("    remindDate: ").append(toIndentedString(remindDate)).append("\n");
    sb.append("    remindSum: ").append(toIndentedString(remindSum)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    lessonIds: ").append(toIndentedString(lessonIds)).append("\n");
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

