# JoinsApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyJoinsGet**](JoinsApi.md#v1CompanyJoinsGet) | **GET** /v1/company/joins | Заявки
[**v1CompanyJoinsJoinIdDelete**](JoinsApi.md#v1CompanyJoinsJoinIdDelete) | **DELETE** /v1/company/joins/{joinId} | Удаление заявки
[**v1CompanyJoinsJoinIdGet**](JoinsApi.md#v1CompanyJoinsJoinIdGet) | **GET** /v1/company/joins/{joinId} | Информация о заявке
[**v1CompanyJoinsJoinIdPost**](JoinsApi.md#v1CompanyJoinsJoinIdPost) | **POST** /v1/company/joins/{joinId} | Изменение заявки
[**v1CompanyJoinsJoinIdStatusPost**](JoinsApi.md#v1CompanyJoinsJoinIdStatusPost) | **POST** /v1/company/joins/{joinId}/status | Изменение статуса заявки
[**v1CompanyJoinsJoinIdTagsPost**](JoinsApi.md#v1CompanyJoinsJoinIdTagsPost) | **POST** /v1/company/joins/{joinId}/tags | Изменение тегов заявки
[**v1CompanyJoinsPost**](JoinsApi.md#v1CompanyJoinsPost) | **POST** /v1/company/joins | Создание заявки


<a name="v1CompanyJoinsGet"></a>
# **v1CompanyJoinsGet**
> MKJoins v1CompanyJoinsGet(createdAt, filialId, classId, statusId, userId, managerId, offset, limit)

Заявки

Возвращает список заявок (записей) в группы

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    List<LocalDate> createdAt = 2019-01-01; // List<LocalDate> | Дата создания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону.
    List<Long> filialId = 4; // List<Long> | ID филиала.
    List<Long> classId = 10; // List<Long> | ID группы
    Integer statusId = 0; // Integer | Статус записи
    Long userId = 123; // Long | ID ученика
    Long managerId = 123; // Long | ID сотрудника
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKJoins result = apiInstance.v1CompanyJoinsGet(createdAt, filialId, classId, statusId, userId, managerId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsGet");
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
 **statusId** | **Integer**| Статус записи | [optional]
 **userId** | **Long**| ID ученика | [optional]
 **managerId** | **Long**| ID сотрудника | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKJoins**](MKJoins.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список заявок |  -  |

<a name="v1CompanyJoinsJoinIdDelete"></a>
# **v1CompanyJoinsJoinIdDelete**
> v1CompanyJoinsJoinIdDelete(joinId)

Удаление заявки

Удаляет заявку из системы.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    Long joinId = 56L; // Long | ID заявки
    try {
      apiInstance.v1CompanyJoinsJoinIdDelete(joinId);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsJoinIdDelete");
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
 **joinId** | **Long**| ID заявки |

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
**204** | Заявка удалена |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Заявка не найдена |  -  |

<a name="v1CompanyJoinsJoinIdGet"></a>
# **v1CompanyJoinsJoinIdGet**
> MKJoin v1CompanyJoinsJoinIdGet(joinId)

Информация о заявке

Возвращает информацию о заявке

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    Long joinId = 56L; // Long | ID заявки
    try {
      MKJoin result = apiInstance.v1CompanyJoinsJoinIdGet(joinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsJoinIdGet");
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
 **joinId** | **Long**| ID заявки |

### Return type

[**MKJoin**](MKJoin.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные заявки |  -  |
**404** | Заявка не найдена |  -  |

<a name="v1CompanyJoinsJoinIdPost"></a>
# **v1CompanyJoinsJoinIdPost**
> MKJoin v1CompanyJoinsJoinIdPost(joinId, mkJoinEdit)

Изменение заявки

Изменяет основную информацию по заявке

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    Long joinId = 56L; // Long | ID заявки
    MKJoinEdit mkJoinEdit = new MKJoinEdit(); // MKJoinEdit | Обновленная информация по заявке
    try {
      MKJoin result = apiInstance.v1CompanyJoinsJoinIdPost(joinId, mkJoinEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsJoinIdPost");
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
 **joinId** | **Long**| ID заявки |
 **mkJoinEdit** | [**MKJoinEdit**](MKJoinEdit.md)| Обновленная информация по заявке |

### Return type

[**MKJoin**](MKJoin.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Обновленные данные заявки |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Заявка не найдена |  -  |

<a name="v1CompanyJoinsJoinIdStatusPost"></a>
# **v1CompanyJoinsJoinIdStatusPost**
> v1CompanyJoinsJoinIdStatusPost(joinId, Object)

Изменение статуса заявки

Изменяет статус заявки

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    Long joinId = 56L; // Long | ID заявки
    Object Object = new Object(); // Object | Новый статус и причина изменения
    try {
      apiInstance.v1CompanyJoinsJoinIdStatusPost(joinId, Object);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsJoinIdStatusPost");
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
 **joinId** | **Long**| ID заявки |
 **Object** | [**Object**](Object.md)| Новый статус и причина изменения |

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
**204** | Статус изменен |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Заявка не найдена |  -  |

<a name="v1CompanyJoinsJoinIdTagsPost"></a>
# **v1CompanyJoinsJoinIdTagsPost**
> v1CompanyJoinsJoinIdTagsPost(joinId, Object)

Изменение тегов заявки

Изменяет теги заявки

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    Long joinId = 56L; // Long | ID заявки
    Object Object = new Object(); // Object | Новые теги
    try {
      apiInstance.v1CompanyJoinsJoinIdTagsPost(joinId, Object);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsJoinIdTagsPost");
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
 **joinId** | **Long**| ID заявки |
 **Object** | [**Object**](Object.md)| Новые теги |

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
**204** | Теги изменены |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Заявка не найдена |  -  |

<a name="v1CompanyJoinsPost"></a>
# **v1CompanyJoinsPost**
> MKJoin v1CompanyJoinsPost(mkJoin)

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
import com.moyklass.api.JoinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    JoinsApi apiInstance = new JoinsApi(defaultClient);
    MKJoin mkJoin = new MKJoin(); // MKJoin | Информация о заявке
    try {
      MKJoin result = apiInstance.v1CompanyJoinsPost(mkJoin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JoinsApi#v1CompanyJoinsPost");
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
 **mkJoin** | [**MKJoin**](MKJoin.md)| Информация о заявке |

### Return type

[**MKJoin**](MKJoin.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные созданной заявки |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**500** | Ошибка на стороне сервера |  -  |

