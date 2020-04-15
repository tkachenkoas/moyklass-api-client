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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;

/**
 * Группа
 */
@ApiModel(description = "Группа")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKClass {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private OffsetDateTime beginDate;

  public static final String SERIALIZED_NAME_MAX_STUDENTS = "maxStudents";
  @SerializedName(SERIALIZED_NAME_MAX_STUDENTS)
  private Integer maxStudents;

  /**
   * Текущее состояние группы. **opened** - набор открыт, **closed** - набор закрыт, **archive** - группа в архиве
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPENED("opened"),
    
    CLOSED("closed"),
    
    ARCHIVE("archive");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt = null;

  public static final String SERIALIZED_NAME_COURSE_ID = "courseId";
  @SerializedName(SERIALIZED_NAME_COURSE_ID)
  private Long courseId;

  /**
   * Способ оплаты за обучение. **full** - разово, **lessons** - за занятия
   */
  @JsonAdapter(PayTypeEnum.Adapter.class)
  public enum PayTypeEnum {
    FULL("full"),
    
    LESSONS("lessons");

    private String value;

    PayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayTypeEnum fromValue(String value) {
      for (PayTypeEnum b : PayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_TYPE = "payType";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private PayTypeEnum payType;

  public static final String SERIALIZED_NAME_FILIAL_ID = "filialId";
  @SerializedName(SERIALIZED_NAME_FILIAL_ID)
  private Long filialId;

  public static final String SERIALIZED_NAME_PAY_PASS = "payPass";
  @SerializedName(SERIALIZED_NAME_PAY_PASS)
  private Boolean payPass;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  public static final String SERIALIZED_NAME_PRICE_COMMENT = "priceComment";
  @SerializedName(SERIALIZED_NAME_PRICE_COMMENT)
  private String priceComment;

  public static final String SERIALIZED_NAME_SHOW_DATES = "showDates";
  @SerializedName(SERIALIZED_NAME_SHOW_DATES)
  private Boolean showDates = true;

  public static final String SERIALIZED_NAME_PRICE_FOR_WIDGET = "priceForWidget";
  @SerializedName(SERIALIZED_NAME_PRICE_FOR_WIDGET)
  private String priceForWidget;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;


   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID")

  public Long getId() {
    return id;
  }




  public MKClass name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Название
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Группа по выходным", value = "Название")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MKClass beginDate(OffsetDateTime beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Старт занятий
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-10T15:00Z", value = "Старт занятий")

  public OffsetDateTime getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
  }


  public MKClass maxStudents(Integer maxStudents) {
    
    this.maxStudents = maxStudents;
    return this;
  }

   /**
   * Максимальное количество студентов в группе
   * @return maxStudents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "Максимальное количество студентов в группе")

  public Integer getMaxStudents() {
    return maxStudents;
  }


  public void setMaxStudents(Integer maxStudents) {
    this.maxStudents = maxStudents;
  }


  public MKClass status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Текущее состояние группы. **opened** - набор открыт, **closed** - набор закрыт, **archive** - группа в архиве
   * @return status
  **/
  @ApiModelProperty(example = "opened", required = true, value = "Текущее состояние группы. **opened** - набор открыт, **closed** - набор закрыт, **archive** - группа в архиве")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public MKClass createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public MKClass courseId(Long courseId) {
    
    this.courseId = courseId;
    return this;
  }

   /**
   * ID программы
   * @return courseId
  **/
  @ApiModelProperty(example = "100", required = true, value = "ID программы")

  public Long getCourseId() {
    return courseId;
  }


  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }


  public MKClass payType(PayTypeEnum payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * Способ оплаты за обучение. **full** - разово, **lessons** - за занятия
   * @return payType
  **/
  @ApiModelProperty(example = "full", required = true, value = "Способ оплаты за обучение. **full** - разово, **lessons** - за занятия")

  public PayTypeEnum getPayType() {
    return payType;
  }


  public void setPayType(PayTypeEnum payType) {
    this.payType = payType;
  }


  public MKClass filialId(Long filialId) {
    
    this.filialId = filialId;
    return this;
  }

   /**
   * ID филиала
   * @return filialId
  **/
  @ApiModelProperty(example = "300", required = true, value = "ID филиала")

  public Long getFilialId() {
    return filialId;
  }


  public void setFilialId(Long filialId) {
    this.filialId = filialId;
  }


  public MKClass payPass(Boolean payPass) {
    
    this.payPass = payPass;
    return this;
  }

   /**
   * Списывать посещения из абонемента за пропуски без уваж. причины
   * @return payPass
  **/
  @ApiModelProperty(example = "true", required = true, value = "Списывать посещения из абонемента за пропуски без уваж. причины")

  public Boolean getPayPass() {
    return payPass;
  }


  public void setPayPass(Boolean payPass) {
    this.payPass = payPass;
  }


  public MKClass price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * Цена
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Цена")

  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public MKClass priceComment(String priceComment) {
    
    this.priceComment = priceComment;
    return this;
  }

   /**
   * Комментарий к цене
   * @return priceComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Абонемент 5 занятий - 2500 р., 10 занятий - 4000 р.", value = "Комментарий к цене")

  public String getPriceComment() {
    return priceComment;
  }


  public void setPriceComment(String priceComment) {
    this.priceComment = priceComment;
  }


  public MKClass showDates(Boolean showDates) {
    
    this.showDates = showDates;
    return this;
  }

   /**
   * Отобажение даты начала у названия группы
   * @return showDates
  **/
  @ApiModelProperty(example = "false", required = true, value = "Отобажение даты начала у названия группы")

  public Boolean getShowDates() {
    return showDates;
  }


  public void setShowDates(Boolean showDates) {
    this.showDates = showDates;
  }


  public MKClass priceForWidget(String priceForWidget) {
    
    this.priceForWidget = priceForWidget;
    return this;
  }

   /**
   * Цена для виджетов.
   * @return priceForWidget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2500-4000 р/аб.", value = "Цена для виджетов.")

  public String getPriceForWidget() {
    return priceForWidget;
  }


  public void setPriceForWidget(String priceForWidget) {
    this.priceForWidget = priceForWidget;
  }


  public MKClass color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Цвет группы
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#ff33f5", value = "Цвет группы")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKClass propertyClass = (MKClass) o;
    return Objects.equals(this.id, propertyClass.id) &&
        Objects.equals(this.name, propertyClass.name) &&
        Objects.equals(this.beginDate, propertyClass.beginDate) &&
        Objects.equals(this.maxStudents, propertyClass.maxStudents) &&
        Objects.equals(this.status, propertyClass.status) &&
        Objects.equals(this.createdAt, propertyClass.createdAt) &&
        Objects.equals(this.courseId, propertyClass.courseId) &&
        Objects.equals(this.payType, propertyClass.payType) &&
        Objects.equals(this.filialId, propertyClass.filialId) &&
        Objects.equals(this.payPass, propertyClass.payPass) &&
        Objects.equals(this.price, propertyClass.price) &&
        Objects.equals(this.priceComment, propertyClass.priceComment) &&
        Objects.equals(this.showDates, propertyClass.showDates) &&
        Objects.equals(this.priceForWidget, propertyClass.priceForWidget) &&
        Objects.equals(this.color, propertyClass.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, beginDate, maxStudents, status, createdAt, courseId, payType, filialId, payPass, price, priceComment, showDates, priceForWidget, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKClass {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    maxStudents: ").append(toIndentedString(maxStudents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    filialId: ").append(toIndentedString(filialId)).append("\n");
    sb.append("    payPass: ").append(toIndentedString(payPass)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceComment: ").append(toIndentedString(priceComment)).append("\n");
    sb.append("    showDates: ").append(toIndentedString(showDates)).append("\n");
    sb.append("    priceForWidget: ").append(toIndentedString(priceForWidget)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

