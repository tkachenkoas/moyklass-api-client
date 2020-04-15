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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Программа (курс, предмет)
 */
@ApiModel(description = "Программа (курс, предмет)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserCourse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "shortDescription";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_SITE_URL = "siteUrl";
  @SerializedName(SERIALIZED_NAME_SITE_URL)
  private String siteUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Тип программы. **course** - курс, **master** - мастер-класс, **personal** - индивидуальное занятие
   */
  @JsonAdapter(CourseTypeEnum.Adapter.class)
  public enum CourseTypeEnum {
    COURSE("course"),
    
    MASTER("master"),
    
    PERSONAL("personal");

    private String value;

    CourseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CourseTypeEnum fromValue(String value) {
      for (CourseTypeEnum b : CourseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CourseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CourseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CourseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CourseTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COURSE_TYPE = "courseType";
  @SerializedName(SERIALIZED_NAME_COURSE_TYPE)
  private CourseTypeEnum courseType;


   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "100", required = true, value = "ID")

  public Long getId() {
    return id;
  }




  public MKUserCourse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Название
   * @return name
  **/
  @ApiModelProperty(example = "Акварель", required = true, value = "Название")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MKUserCourse shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Короткое описание программы
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Освоение основных техник и приемов работы с акварелью.", value = "Короткое описание программы")

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public MKUserCourse siteUrl(String siteUrl) {
    
    this.siteUrl = siteUrl;
    return this;
  }

   /**
   * Ссылка на страницу описания программы
   * @return siteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://site.com/aquarel.html", value = "Ссылка на страницу описания программы")

  public String getSiteUrl() {
    return siteUrl;
  }


  public void setSiteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
  }


  public MKUserCourse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Длинное описание программы (поддерживается html)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Длинное описание программы (поддерживается html)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MKUserCourse courseType(CourseTypeEnum courseType) {
    
    this.courseType = courseType;
    return this;
  }

   /**
   * Тип программы. **course** - курс, **master** - мастер-класс, **personal** - индивидуальное занятие
   * @return courseType
  **/
  @ApiModelProperty(example = "course", required = true, value = "Тип программы. **course** - курс, **master** - мастер-класс, **personal** - индивидуальное занятие")

  public CourseTypeEnum getCourseType() {
    return courseType;
  }


  public void setCourseType(CourseTypeEnum courseType) {
    this.courseType = courseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MKUserCourse userCourse = (MKUserCourse) o;
    return Objects.equals(this.id, userCourse.id) &&
        Objects.equals(this.name, userCourse.name) &&
        Objects.equals(this.shortDescription, userCourse.shortDescription) &&
        Objects.equals(this.siteUrl, userCourse.siteUrl) &&
        Objects.equals(this.description, userCourse.description) &&
        Objects.equals(this.courseType, userCourse.courseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortDescription, siteUrl, description, courseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserCourse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    courseType: ").append(toIndentedString(courseType)).append("\n");
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
