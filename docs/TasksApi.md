# TasksApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyTasksGet**](TasksApi.md#v1CompanyTasksGet) | **GET** /v1/company/tasks | Задачи
[**v1CompanyTasksPost**](TasksApi.md#v1CompanyTasksPost) | **POST** /v1/company/tasks | Содание задачи
[**v1CompanyTasksTaskIdDelete**](TasksApi.md#v1CompanyTasksTaskIdDelete) | **DELETE** /v1/company/tasks/{taskId} | Удаление задачи
[**v1CompanyTasksTaskIdGet**](TasksApi.md#v1CompanyTasksTaskIdGet) | **GET** /v1/company/tasks/{taskId} | Информация о задаче
[**v1CompanyTasksTaskIdPost**](TasksApi.md#v1CompanyTasksTaskIdPost) | **POST** /v1/company/tasks/{taskId} | Изменение задачи


<a name="v1CompanyTasksGet"></a>
# **v1CompanyTasksGet**
> MKTasks v1CompanyTasksGet(createdAt, filialId, classId, userId, managerId, isComplete, offset, limit)

Задачи

Возвращает список задач

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    TasksApi apiInstance = new TasksApi(defaultClient);
    List<LocalDate> createdAt = 2019-01-01; // List<LocalDate> | Дата создания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону.
    List<Long> filialId = 4; // List<Long> | ID филиала.
    List<Long> classId = 10; // List<Long> | ID группы
    Long userId = 123; // Long | ID ученика
    Long managerId = 123; // Long | ID сотрудника
    Boolean isComplete = true; // Boolean | Статус задачи, завершена или нет.
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKTasks result = apiInstance.v1CompanyTasksGet(createdAt, filialId, classId, userId, managerId, isComplete, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#v1CompanyTasksGet");
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
 **createdAt** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Дата создания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону. | [optional]
 **filialId** | [**List&lt;Long&gt;**](Long.md)| ID филиала. | [optional]
 **classId** | [**List&lt;Long&gt;**](Long.md)| ID группы | [optional]
 **userId** | **Long**| ID ученика | [optional]
 **managerId** | **Long**| ID сотрудника | [optional]
 **isComplete** | **Boolean**| Статус задачи, завершена или нет. | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKTasks**](MKTasks.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список задач |  -  |

<a name="v1CompanyTasksPost"></a>
# **v1CompanyTasksPost**
> MKTask v1CompanyTasksPost(mkTask)

Содание задачи

Создает новую задачу

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    TasksApi apiInstance = new TasksApi(defaultClient);
    MKTask mkTask = new MKTask(); // MKTask | Информация о задаче
    try {
      MKTask result = apiInstance.v1CompanyTasksPost(mkTask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#v1CompanyTasksPost");
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
 **mkTask** | [**MKTask**](MKTask.md)| Информация о задаче |

### Return type

[**MKTask**](MKTask.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные созданной задачи |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |

<a name="v1CompanyTasksTaskIdDelete"></a>
# **v1CompanyTasksTaskIdDelete**
> v1CompanyTasksTaskIdDelete(taskId)

Удаление задачи

Удаляет задачу из системы.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    TasksApi apiInstance = new TasksApi(defaultClient);
    Long taskId = 56L; // Long | ID задачи
    try {
      apiInstance.v1CompanyTasksTaskIdDelete(taskId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#v1CompanyTasksTaskIdDelete");
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
 **taskId** | **Long**| ID задачи |

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
**204** | Задача удалена |  -  |
**404** | Задача не найдена |  -  |

<a name="v1CompanyTasksTaskIdGet"></a>
# **v1CompanyTasksTaskIdGet**
> MKTask v1CompanyTasksTaskIdGet(taskId)

Информация о задаче

Возвращает задачу

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    TasksApi apiInstance = new TasksApi(defaultClient);
    Long taskId = 56L; // Long | ID задачи
    try {
      MKTask result = apiInstance.v1CompanyTasksTaskIdGet(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#v1CompanyTasksTaskIdGet");
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
 **taskId** | **Long**| ID задачи |

### Return type

[**MKTask**](MKTask.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные задачи |  -  |
**404** | Задача не найдена |  -  |

<a name="v1CompanyTasksTaskIdPost"></a>
# **v1CompanyTasksTaskIdPost**
> MKTask v1CompanyTasksTaskIdPost(taskId, mkTask)

Изменение задачи

Изменяет задачу

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    TasksApi apiInstance = new TasksApi(defaultClient);
    Long taskId = 56L; // Long | ID задачи
    MKTask mkTask = new MKTask(); // MKTask | Обновленая задача
    try {
      MKTask result = apiInstance.v1CompanyTasksTaskIdPost(taskId, mkTask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#v1CompanyTasksTaskIdPost");
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
 **taskId** | **Long**| ID задачи |
 **mkTask** | [**MKTask**](MKTask.md)| Обновленая задача |

### Return type

[**MKTask**](MKTask.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Обновленные данные задачи |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Задача не найдена |  -  |

