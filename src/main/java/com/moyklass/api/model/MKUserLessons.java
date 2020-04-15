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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MKUserLessons
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T19:21:47.202+03:00[Asia/Jerusalem]")
public class MKUserLessons {
  public static final String SERIALIZED_NAME_LESSONS = "lessons";
  @SerializedName(SERIALIZED_NAME_LESSONS)
  private List<MKUserLesson> lessons = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private MKLessonPaging stats;


  public MKUserLessons lessons(List<MKUserLesson> lessons) {
    
    this.lessons = lessons;
    return this;
  }

  public MKUserLessons addLessonsItem(MKUserLesson lessonsItem) {
    if (this.lessons == null) {
      this.lessons = new ArrayList<>();
    }
    this.lessons.add(lessonsItem);
    return this;
  }

   /**
   * Get lessons
   * @return lessons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MKUserLesson> getLessons() {
    return lessons;
  }


  public void setLessons(List<MKUserLesson> lessons) {
    this.lessons = lessons;
  }


  public MKUserLessons stats(MKLessonPaging stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MKLessonPaging getStats() {
    return stats;
  }


  public void setStats(MKLessonPaging stats) {
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
    MKUserLessons userLessons = (MKUserLessons) o;
    return Objects.equals(this.lessons, userLessons.lessons) &&
        Objects.equals(this.stats, userLessons.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lessons, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MKUserLessons {\n");
    sb.append("    lessons: ").append(toIndentedString(lessons)).append("\n");
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

