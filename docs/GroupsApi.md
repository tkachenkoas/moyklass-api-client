# GroupsApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyClassesGet**](GroupsApi.md#v1CompanyClassesGet) | **GET** /v1/company/classes | Группы
[**v1CompanyCoursesGet**](GroupsApi.md#v1CompanyCoursesGet) | **GET** /v1/company/courses | Программы
[**v1CompanyLessonRecordsPost**](GroupsApi.md#v1CompanyLessonRecordsPost) | **POST** /v1/company/lessonRecords | Содание записи на занятие
[**v1CompanyLessonRecordsRecordIdDelete**](GroupsApi.md#v1CompanyLessonRecordsRecordIdDelete) | **DELETE** /v1/company/lessonRecords/{recordId} | Удаление записи
[**v1CompanyLessonRecordsRecordIdGet**](GroupsApi.md#v1CompanyLessonRecordsRecordIdGet) | **GET** /v1/company/lessonRecords/{recordId} | Информация о записи
[**v1CompanyLessonRecordsRecordIdPost**](GroupsApi.md#v1CompanyLessonRecordsRecordIdPost) | **POST** /v1/company/lessonRecords/{recordId} | Изменение записи
[**v1CompanyLessonsGet**](GroupsApi.md#v1CompanyLessonsGet) | **GET** /v1/company/lessons | Занятия
[**v1CompanyLessonsLessonIdMarkTypeUserIdDelete**](GroupsApi.md#v1CompanyLessonsLessonIdMarkTypeUserIdDelete) | **DELETE** /v1/company/lessons/{lessonId}/mark/{type}/{userId} | Удаление оценки за занятие
[**v1CompanyLessonsLessonIdMarkTypeUserIdPost**](GroupsApi.md#v1CompanyLessonsLessonIdMarkTypeUserIdPost) | **POST** /v1/company/lessons/{lessonId}/mark/{type}/{userId} | Создание/изменение оценки за занятие
[**v1CompanyLessonsLessonIdTaskTypeDelete**](GroupsApi.md#v1CompanyLessonsLessonIdTaskTypeDelete) | **DELETE** /v1/company/lessons/{lessonId}/task/{type} | Удаление задания на занятие
[**v1CompanyLessonsLessonIdTaskTypeFilesGet**](GroupsApi.md#v1CompanyLessonsLessonIdTaskTypeFilesGet) | **GET** /v1/company/lessons/{lessonId}/task/{type}/files | Список файлов задания
[**v1CompanyLessonsLessonIdTaskTypeFilesPost**](GroupsApi.md#v1CompanyLessonsLessonIdTaskTypeFilesPost) | **POST** /v1/company/lessons/{lessonId}/task/{type}/files | Добавление файла задания на занятие
[**v1CompanyLessonsLessonIdTaskTypePost**](GroupsApi.md#v1CompanyLessonsLessonIdTaskTypePost) | **POST** /v1/company/lessons/{lessonId}/task/{type} | Создание/изменение задания на занятие


<a name="v1CompanyClassesGet"></a>
# **v1CompanyClassesGet**
> List&lt;MKClass&gt; v1CompanyClassesGet()

Группы

Возвращает список групп (наборов)

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    try {
      List<MKClass> result = apiInstance.v1CompanyClassesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyClassesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MKClass&gt;**](MKClass.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список групп |  -  |

<a name="v1CompanyCoursesGet"></a>
# **v1CompanyCoursesGet**
> List&lt;MKCourse&gt; v1CompanyCoursesGet(includeClasses)

Программы

Возвращает список программ обучения

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Boolean includeClasses = true; // Boolean | Включить в ответ группы
    try {
      List<MKCourse> result = apiInstance.v1CompanyCoursesGet(includeClasses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyCoursesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeClasses** | **Boolean**| Включить в ответ группы | [optional] [default to false]

### Return type

[**List&lt;MKCourse&gt;**](MKCourse.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список программ |  -  |

<a name="v1CompanyLessonRecordsPost"></a>
# **v1CompanyLessonRecordsPost**
> MKLessonRecord v1CompanyLessonRecordsPost(mkLessonRecord)

Содание записи на занятие

Создает новую запись на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    MKLessonRecord mkLessonRecord = new MKLessonRecord(); // MKLessonRecord | Информация о записи
    try {
      MKLessonRecord result = apiInstance.v1CompanyLessonRecordsPost(mkLessonRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonRecordsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mkLessonRecord** | [**MKLessonRecord**](MKLessonRecord.md)| Информация о записи |

### Return type

[**MKLessonRecord**](MKLessonRecord.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные созданной записи |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |

<a name="v1CompanyLessonRecordsRecordIdDelete"></a>
# **v1CompanyLessonRecordsRecordIdDelete**
> v1CompanyLessonRecordsRecordIdDelete(recordId)

Удаление записи

Удаляет запись на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long recordId = 56L; // Long | ID записи
    try {
      apiInstance.v1CompanyLessonRecordsRecordIdDelete(recordId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonRecordsRecordIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**| ID записи |

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Запись удалена |  -  |
**404** | Запись не найдена |  -  |

<a name="v1CompanyLessonRecordsRecordIdGet"></a>
# **v1CompanyLessonRecordsRecordIdGet**
> MKLessonRecord v1CompanyLessonRecordsRecordIdGet(recordId)

Информация о записи

Возвращает информацию о записи на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long recordId = 56L; // Long | ID записи
    try {
      MKLessonRecord result = apiInstance.v1CompanyLessonRecordsRecordIdGet(recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonRecordsRecordIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**| ID записи |

### Return type

[**MKLessonRecord**](MKLessonRecord.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные записи |  -  |
**404** | Запись не найдена |  -  |

<a name="v1CompanyLessonRecordsRecordIdPost"></a>
# **v1CompanyLessonRecordsRecordIdPost**
> MKLessonRecord v1CompanyLessonRecordsRecordIdPost(recordId, mkLessonRecordEdit)

Изменение записи

Изменяет информацию о записи

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long recordId = 56L; // Long | ID записи
    MKLessonRecordEdit mkLessonRecordEdit = new MKLessonRecordEdit(); // MKLessonRecordEdit | Обновленная информация о записи
    try {
      MKLessonRecord result = apiInstance.v1CompanyLessonRecordsRecordIdPost(recordId, mkLessonRecordEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonRecordsRecordIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**| ID записи |
 **mkLessonRecordEdit** | [**MKLessonRecordEdit**](MKLessonRecordEdit.md)| Обновленная информация о записи |

### Return type

[**MKLessonRecord**](MKLessonRecord.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Обновленные данные записи |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Запись не найдена |  -  |

<a name="v1CompanyLessonsGet"></a>
# **v1CompanyLessonsGet**
> MKLessons v1CompanyLessonsGet(date, roomId, filialId, classId, teacherId, statusId, userId, offset, limit, includeRecords, includeMarks, includeTasks)

Занятия

Возвращает список занятий

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    List<LocalDate> date = 2019-01-01; // List<LocalDate> | Дата проведения занятий. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону
    List<Long> roomId = 43; // List<Long> | ID аудитории
    List<Long> filialId = 4; // List<Long> | ID филиала.
    List<Long> classId = 10; // List<Long> | ID группы
    List<Long> teacherId = 2; // List<Long> | ID сотрудника - преподавателя
    Integer statusId = 0; // Integer | Статус занятия. 0 - не проведено, 1 - проведено
    Long userId = 123; // Long | ID ученика, записанного на занятие
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    Boolean includeRecords = true; // Boolean | Включить в ответ записи на занятия
    Boolean includeMarks = true; // Boolean | Включить в ответ оценки к занятию
    Boolean includeTasks = true; // Boolean | Включить в ответ задания к занятию
    try {
      MKLessons result = apiInstance.v1CompanyLessonsGet(date, roomId, filialId, classId, teacherId, statusId, userId, offset, limit, includeRecords, includeMarks, includeTasks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Дата проведения занятий. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону | [optional]
 **roomId** | [**List&lt;Long&gt;**](Long.md)| ID аудитории | [optional]
 **filialId** | [**List&lt;Long&gt;**](Long.md)| ID филиала. | [optional]
 **classId** | [**List&lt;Long&gt;**](Long.md)| ID группы | [optional]
 **teacherId** | [**List&lt;Long&gt;**](Long.md)| ID сотрудника - преподавателя | [optional]
 **statusId** | **Integer**| Статус занятия. 0 - не проведено, 1 - проведено | [optional]
 **userId** | **Long**| ID ученика, записанного на занятие | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]
 **includeRecords** | **Boolean**| Включить в ответ записи на занятия | [optional] [default to false]
 **includeMarks** | **Boolean**| Включить в ответ оценки к занятию | [optional] [default to false]
 **includeTasks** | **Boolean**| Включить в ответ задания к занятию | [optional] [default to false]

### Return type

[**MKLessons**](MKLessons.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список занятий |  -  |

<a name="v1CompanyLessonsLessonIdMarkTypeUserIdDelete"></a>
# **v1CompanyLessonsLessonIdMarkTypeUserIdDelete**
> v1CompanyLessonsLessonIdMarkTypeUserIdDelete(lessonId, userId, type)

Удаление оценки за занятие

Удаляет оценку из системы.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    Long userId = 56L; // Long | ID пользователя
    String type = "type_example"; // String | Тип оценки (За дз / за занятие)
    try {
      apiInstance.v1CompanyLessonsLessonIdMarkTypeUserIdDelete(lessonId, userId, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdMarkTypeUserIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **userId** | **Long**| ID пользователя |
 **type** | **String**| Тип оценки (За дз / за занятие) | [enum: home, lesson]

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Оценка удалена |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Оценка или занятие не найдено |  -  |

<a name="v1CompanyLessonsLessonIdMarkTypeUserIdPost"></a>
# **v1CompanyLessonsLessonIdMarkTypeUserIdPost**
> v1CompanyLessonsLessonIdMarkTypeUserIdPost(lessonId, userId, type, mkLessonMarkEdit)

Создание/изменение оценки за занятие

Создает или, если уже создано, изменяет оценку на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    Long userId = 56L; // Long | ID пользователя
    String type = "type_example"; // String | Тип оценки (За дз / за занятие)
    MKLessonMarkEdit mkLessonMarkEdit = new MKLessonMarkEdit(); // MKLessonMarkEdit | Данные оценки
    try {
      apiInstance.v1CompanyLessonsLessonIdMarkTypeUserIdPost(lessonId, userId, type, mkLessonMarkEdit);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdMarkTypeUserIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **userId** | **Long**| ID пользователя |
 **type** | **String**| Тип оценки (За дз / за занятие) | [enum: home, lesson]
 **mkLessonMarkEdit** | [**MKLessonMarkEdit**](MKLessonMarkEdit.md)| Данные оценки |

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Оценка обновлена/добавлена |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Оценка или занятие не найдено |  -  |

<a name="v1CompanyLessonsLessonIdTaskTypeDelete"></a>
# **v1CompanyLessonsLessonIdTaskTypeDelete**
> v1CompanyLessonsLessonIdTaskTypeDelete(lessonId, type)

Удаление задания на занятие

Удаляет задание из системы.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    String type = "type_example"; // String | Тип задания (Домашнее / за занятие)
    try {
      apiInstance.v1CompanyLessonsLessonIdTaskTypeDelete(lessonId, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdTaskTypeDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **type** | **String**| Тип задания (Домашнее / за занятие) | [enum: home, lesson]

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Задание удалено |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Задание или занятие не найдено |  -  |

<a name="v1CompanyLessonsLessonIdTaskTypeFilesGet"></a>
# **v1CompanyLessonsLessonIdTaskTypeFilesGet**
> List&lt;java.io.File&gt; v1CompanyLessonsLessonIdTaskTypeFilesGet(lessonId, type)

Список файлов задания

Возвращает массив файлов прикрепленных к заданию

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    String type = "type_example"; // String | Тип задания (Домашнее / за занятие)
    try {
      List<java.io.File> result = apiInstance.v1CompanyLessonsLessonIdTaskTypeFilesGet(lessonId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdTaskTypeFilesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **type** | **String**| Тип задания (Домашнее / за занятие) | [enum: home, lesson]

### Return type

[**List&lt;java.io.File&gt;**](java.io.File.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список файлов прикрепленных к заданию |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Задание или занятие не найдено |  -  |

<a name="v1CompanyLessonsLessonIdTaskTypeFilesPost"></a>
# **v1CompanyLessonsLessonIdTaskTypeFilesPost**
> v1CompanyLessonsLessonIdTaskTypeFilesPost(lessonId, type, mkDownloadFile)

Добавление файла задания на занятие

Добавляет файл задания на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    String type = "type_example"; // String | Тип задания (Домашнее / за занятие)
    MKDownloadFile mkDownloadFile = new MKDownloadFile(); // MKDownloadFile | Файл
    try {
      apiInstance.v1CompanyLessonsLessonIdTaskTypeFilesPost(lessonId, type, mkDownloadFile);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdTaskTypeFilesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **type** | **String**| Тип задания (Домашнее / за занятие) | [enum: home, lesson]
 **mkDownloadFile** | [**MKDownloadFile**](MKDownloadFile.md)| Файл |

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Файл добавлен |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Задание или занятие не найдено |  -  |
**413** | Файл слишком большой |  -  |

<a name="v1CompanyLessonsLessonIdTaskTypePost"></a>
# **v1CompanyLessonsLessonIdTaskTypePost**
> v1CompanyLessonsLessonIdTaskTypePost(lessonId, type, mkLessonTaskEdit)

Создание/изменение задания на занятие

Создает или, если уже создано, изменяет задание на занятие

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Long lessonId = 56L; // Long | ID занятия
    String type = "type_example"; // String | Тип задания (Домашнее / за занятие)
    MKLessonTaskEdit mkLessonTaskEdit = new MKLessonTaskEdit(); // MKLessonTaskEdit | Данные задания
    try {
      apiInstance.v1CompanyLessonsLessonIdTaskTypePost(lessonId, type, mkLessonTaskEdit);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#v1CompanyLessonsLessonIdTaskTypePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessonId** | **Long**| ID занятия |
 **type** | **String**| Тип задания (Домашнее / за занятие) | [enum: home, lesson]
 **mkLessonTaskEdit** | [**MKLessonTaskEdit**](MKLessonTaskEdit.md)| Данные задания |

### Return type

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Задание обновлено/добавлено |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Задание или занятие не найдено |  -  |

