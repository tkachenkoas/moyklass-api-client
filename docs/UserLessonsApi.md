# UserLessonsApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1UserJoinsPost**](UserLessonsApi.md#v1UserJoinsPost) | **POST** /v1/user/joins | Создание заявки
[**v1UserLessonRecordsPost**](UserLessonsApi.md#v1UserLessonRecordsPost) | **POST** /v1/user/lessonRecords | Содание записи на занятие
[**v1UserLessonRecordsRecordIdDelete**](UserLessonsApi.md#v1UserLessonRecordsRecordIdDelete) | **DELETE** /v1/user/lessonRecords/{recordId} | Удаление записи
[**v1UserLessonRecordsRecordIdGet**](UserLessonsApi.md#v1UserLessonRecordsRecordIdGet) | **GET** /v1/user/lessonRecords/{recordId} | Информация о записи
[**v1UserLessonsGet**](UserLessonsApi.md#v1UserLessonsGet) | **GET** /v1/user/lessons | Занятия


<a name="v1UserJoinsPost"></a>
# **v1UserJoinsPost**
> MKCreateJoinResult v1UserJoinsPost(mkUserJoin)

Создание заявки

Создает новую заявку (запись) в группу

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserLessonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: userSession
    ApiKeyAuth userSession = (ApiKeyAuth) defaultClient.getAuthentication("userSession");
    userSession.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //userSession.setApiKeyPrefix("Token");

    // Configure API key authorization: xCookieToken
    ApiKeyAuth xCookieToken = (ApiKeyAuth) defaultClient.getAuthentication("xCookieToken");
    xCookieToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCookieToken.setApiKeyPrefix("Token");

    // Configure API key authorization: xCsrfToken
    ApiKeyAuth xCsrfToken = (ApiKeyAuth) defaultClient.getAuthentication("xCsrfToken");
    xCsrfToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCsrfToken.setApiKeyPrefix("Token");

    UserLessonsApi apiInstance = new UserLessonsApi(defaultClient);
    MKUserJoin mkUserJoin = new MKUserJoin(); // MKUserJoin | Информация о заявке
    try {
      MKCreateJoinResult result = apiInstance.v1UserJoinsPost(mkUserJoin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserLessonsApi#v1UserJoinsPost");
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
 **mkUserJoin** | [**MKUserJoin**](MKUserJoin.md)| Информация о заявке |

### Return type

[**MKCreateJoinResult**](MKCreateJoinResult.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Результат создания заявки |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |

<a name="v1UserLessonRecordsPost"></a>
# **v1UserLessonRecordsPost**
> MKUserLessonRecord v1UserLessonRecordsPost(mkUserLessonRecord)

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
import com.moyklass.api.UserLessonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: userSession
    ApiKeyAuth userSession = (ApiKeyAuth) defaultClient.getAuthentication("userSession");
    userSession.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //userSession.setApiKeyPrefix("Token");

    // Configure API key authorization: xCookieToken
    ApiKeyAuth xCookieToken = (ApiKeyAuth) defaultClient.getAuthentication("xCookieToken");
    xCookieToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCookieToken.setApiKeyPrefix("Token");

    // Configure API key authorization: xCsrfToken
    ApiKeyAuth xCsrfToken = (ApiKeyAuth) defaultClient.getAuthentication("xCsrfToken");
    xCsrfToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCsrfToken.setApiKeyPrefix("Token");

    UserLessonsApi apiInstance = new UserLessonsApi(defaultClient);
    MKUserLessonRecord mkUserLessonRecord = new MKUserLessonRecord(); // MKUserLessonRecord | Информация о записи
    try {
      MKUserLessonRecord result = apiInstance.v1UserLessonRecordsPost(mkUserLessonRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserLessonsApi#v1UserLessonRecordsPost");
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
 **mkUserLessonRecord** | [**MKUserLessonRecord**](MKUserLessonRecord.md)| Информация о записи |

### Return type

[**MKUserLessonRecord**](MKUserLessonRecord.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные созданной записи |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |

<a name="v1UserLessonRecordsRecordIdDelete"></a>
# **v1UserLessonRecordsRecordIdDelete**
> v1UserLessonRecordsRecordIdDelete(recordId)

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
import com.moyklass.api.UserLessonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: userSession
    ApiKeyAuth userSession = (ApiKeyAuth) defaultClient.getAuthentication("userSession");
    userSession.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //userSession.setApiKeyPrefix("Token");

    // Configure API key authorization: xCookieToken
    ApiKeyAuth xCookieToken = (ApiKeyAuth) defaultClient.getAuthentication("xCookieToken");
    xCookieToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCookieToken.setApiKeyPrefix("Token");

    // Configure API key authorization: xCsrfToken
    ApiKeyAuth xCsrfToken = (ApiKeyAuth) defaultClient.getAuthentication("xCsrfToken");
    xCsrfToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCsrfToken.setApiKeyPrefix("Token");

    UserLessonsApi apiInstance = new UserLessonsApi(defaultClient);
    Long recordId = 56L; // Long | ID записи
    try {
      apiInstance.v1UserLessonRecordsRecordIdDelete(recordId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserLessonsApi#v1UserLessonRecordsRecordIdDelete");
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

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Запись удалена |  -  |
**404** | Запись не найдена |  -  |

<a name="v1UserLessonRecordsRecordIdGet"></a>
# **v1UserLessonRecordsRecordIdGet**
> MKUserLessonRecord v1UserLessonRecordsRecordIdGet(recordId)

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
import com.moyklass.api.UserLessonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: userSession
    ApiKeyAuth userSession = (ApiKeyAuth) defaultClient.getAuthentication("userSession");
    userSession.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //userSession.setApiKeyPrefix("Token");

    // Configure API key authorization: xCookieToken
    ApiKeyAuth xCookieToken = (ApiKeyAuth) defaultClient.getAuthentication("xCookieToken");
    xCookieToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCookieToken.setApiKeyPrefix("Token");

    // Configure API key authorization: xCsrfToken
    ApiKeyAuth xCsrfToken = (ApiKeyAuth) defaultClient.getAuthentication("xCsrfToken");
    xCsrfToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCsrfToken.setApiKeyPrefix("Token");

    UserLessonsApi apiInstance = new UserLessonsApi(defaultClient);
    Long recordId = 56L; // Long | ID записи
    try {
      MKUserLessonRecord result = apiInstance.v1UserLessonRecordsRecordIdGet(recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserLessonsApi#v1UserLessonRecordsRecordIdGet");
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

[**MKUserLessonRecord**](MKUserLessonRecord.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные записи |  -  |
**404** | Запись не найдена |  -  |

<a name="v1UserLessonsGet"></a>
# **v1UserLessonsGet**
> MKUserLessons v1UserLessonsGet(date, roomId, filialId, classId, teacherId, statusId, userId, scopeUserId, visit, debt, includeRecords, includeComments, includeMarks, includeTasks, includeParams, limit, offset, sort)

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
import com.moyklass.api.UserLessonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: userSession
    ApiKeyAuth userSession = (ApiKeyAuth) defaultClient.getAuthentication("userSession");
    userSession.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //userSession.setApiKeyPrefix("Token");

    // Configure API key authorization: xCookieToken
    ApiKeyAuth xCookieToken = (ApiKeyAuth) defaultClient.getAuthentication("xCookieToken");
    xCookieToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCookieToken.setApiKeyPrefix("Token");

    // Configure API key authorization: xCsrfToken
    ApiKeyAuth xCsrfToken = (ApiKeyAuth) defaultClient.getAuthentication("xCsrfToken");
    xCsrfToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //xCsrfToken.setApiKeyPrefix("Token");

    UserLessonsApi apiInstance = new UserLessonsApi(defaultClient);
    List<LocalDate> date = 2019-01-01; // List<LocalDate> | Дата проведения занятий. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону
    List<Long> roomId = 43; // List<Long> | ID аудитории
    List<Long> filialId = 4; // List<Long> | ID филиала.
    List<Long> classId = 10; // List<Long> | ID группы
    List<Long> teacherId = 2; // List<Long> | ID сотрудника - преподавателя
    Integer statusId = 0; // Integer | Статус занятия. 0 - не проведено, 1 - проведено
    Long userId = 123; // Long | ID ученика, записанного на занятие
    Long scopeUserId = 123; // Long | ID ученика для определения видимости занятий
    String visit = visited; // String | Статус посещения занятия ученика, указанного в userId. Без указания userId не имеет смысла. visited - Посетил, lost - Пропустил. Выбираются только проведенные занятия. 
    Boolean debt = true; // Boolean | Занятия в долг (не оплаченные)
    Boolean includeRecords = true; // Boolean | Включить в ответ записи на занятия
    Boolean includeComments = true; // Boolean | Включить в ответ комментарии к занятию
    Boolean includeMarks = true; // Boolean | Включить в ответ оценки к занятию
    Boolean includeTasks = true; // Boolean | Включить в ответ задания к занятию
    Boolean includeParams = true; // Boolean | Включить в ответ дополнительную информацию к занятию
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    String sort = "id"; // String | Поле сортировки
    try {
      MKUserLessons result = apiInstance.v1UserLessonsGet(date, roomId, filialId, classId, teacherId, statusId, userId, scopeUserId, visit, debt, includeRecords, includeComments, includeMarks, includeTasks, includeParams, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserLessonsApi#v1UserLessonsGet");
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
 **scopeUserId** | **Long**| ID ученика для определения видимости занятий | [optional]
 **visit** | **String**| Статус посещения занятия ученика, указанного в userId. Без указания userId не имеет смысла. visited - Посетил, lost - Пропустил. Выбираются только проведенные занятия.  | [optional] [enum: visited, lost]
 **debt** | **Boolean**| Занятия в долг (не оплаченные) | [optional]
 **includeRecords** | **Boolean**| Включить в ответ записи на занятия | [optional] [default to false]
 **includeComments** | **Boolean**| Включить в ответ комментарии к занятию | [optional] [default to false]
 **includeMarks** | **Boolean**| Включить в ответ оценки к занятию | [optional] [default to false]
 **includeTasks** | **Boolean**| Включить в ответ задания к занятию | [optional] [default to false]
 **includeParams** | **Boolean**| Включить в ответ дополнительную информацию к занятию | [optional] [default to false]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **sort** | **String**| Поле сортировки | [optional] [default to id] [enum: id, date]

### Return type

[**MKUserLessons**](MKUserLessons.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список занятий |  -  |

