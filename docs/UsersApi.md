# UsersApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyUsersGet**](UsersApi.md#v1CompanyUsersGet) | **GET** /v1/company/users | Список учеников
[**v1CompanyUsersPost**](UsersApi.md#v1CompanyUsersPost) | **POST** /v1/company/users | Создание ученика
[**v1CompanyUsersUserIdDelete**](UsersApi.md#v1CompanyUsersUserIdDelete) | **DELETE** /v1/company/users/{userId} | Удаление ученика
[**v1CompanyUsersUserIdGet**](UsersApi.md#v1CompanyUsersUserIdGet) | **GET** /v1/company/users/{userId} | Информация об ученике
[**v1CompanyUsersUserIdPost**](UsersApi.md#v1CompanyUsersUserIdPost) | **POST** /v1/company/users/{userId} | Изменение ученика
[**v1CompanyUsersUserIdStatusPost**](UsersApi.md#v1CompanyUsersUserIdStatusPost) | **POST** /v1/company/users/{userId}/status | Изменение статуса ученика


<a name="v1CompanyUsersGet"></a>
# **v1CompanyUsersGet**
> MKUsers v1CompanyUsersGet(createdAt, phone, email, name, offset, limit)

Список учеников

Производит поиск учеников в соответствии с фильтром

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    List<LocalDate> createdAt = 2019-01-01; // List<LocalDate> | Дата создания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону.
    String phone = 790012312323; // String | Номер телефона. Mожно указать часть номера для поиска по подстроке.
    String email = foo@site.com; // String | Email. Можно указать часть адреса для поиска по подстроке
    String name = Иванов; // String | Имя. Можно указать часть имени для поиска по подстроке.
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKUsers result = apiInstance.v1CompanyUsersGet(createdAt, phone, email, name, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersGet");
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
 **phone** | **String**| Номер телефона. Mожно указать часть номера для поиска по подстроке. | [optional]
 **email** | **String**| Email. Можно указать часть адреса для поиска по подстроке | [optional]
 **name** | **String**| Имя. Можно указать часть имени для поиска по подстроке. | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKUsers**](MKUsers.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список учеников |  -  |
**400** | Ошибка в параметрах фильтра |  -  |

<a name="v1CompanyUsersPost"></a>
# **v1CompanyUsersPost**
> MKUser v1CompanyUsersPost(mkUser)

Создание ученика

Создает нового ученика

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    MKUser mkUser = new MKUser(); // MKUser | Информация об ученике
    try {
      MKUser result = apiInstance.v1CompanyUsersPost(mkUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersPost");
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
 **mkUser** | [**MKUser**](MKUser.md)| Информация об ученике |

### Return type

[**MKUser**](MKUser.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные созданного ученика |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |

<a name="v1CompanyUsersUserIdDelete"></a>
# **v1CompanyUsersUserIdDelete**
> v1CompanyUsersUserIdDelete(userId)

Удаление ученика

Удаляет ученика из системы. Вместе с ним удаляет также все его записи, платежи, документы и т.д.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Long userId = 123456; // Long | ID ученика
    try {
      apiInstance.v1CompanyUsersUserIdDelete(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersUserIdDelete");
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
 **userId** | **Long**| ID ученика |

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
**204** | Ученик удален |  -  |
**404** | Ученик не найден |  -  |

<a name="v1CompanyUsersUserIdGet"></a>
# **v1CompanyUsersUserIdGet**
> MKUser v1CompanyUsersUserIdGet(userId, includeJoins)

Информация об ученике

Возвращает основную информацию об ученике

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Long userId = 123456; // Long | ID ученика
    Boolean includeJoins = true; // Boolean | Включить в ответ заявки учеников
    try {
      MKUser result = apiInstance.v1CompanyUsersUserIdGet(userId, includeJoins);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersUserIdGet");
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
 **userId** | **Long**| ID ученика |
 **includeJoins** | **Boolean**| Включить в ответ заявки учеников | [optional] [default to false]

### Return type

[**MKUser**](MKUser.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные ученика |  -  |
**404** | Ученик не найден |  -  |

<a name="v1CompanyUsersUserIdPost"></a>
# **v1CompanyUsersUserIdPost**
> MKUser v1CompanyUsersUserIdPost(userId, mkUser)

Изменение ученика

Изменяет основную информацию об ученике

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Long userId = 123456; // Long | ID ученика
    MKUser mkUser = new MKUser(); // MKUser | Обновленная информация об ученике
    try {
      MKUser result = apiInstance.v1CompanyUsersUserIdPost(userId, mkUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersUserIdPost");
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
 **userId** | **Long**| ID ученика |
 **mkUser** | [**MKUser**](MKUser.md)| Обновленная информация об ученике |

### Return type

[**MKUser**](MKUser.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Обновленные данные ученика |  -  |
**400** | Ошибка валидации |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Ученик не найден |  -  |

<a name="v1CompanyUsersUserIdStatusPost"></a>
# **v1CompanyUsersUserIdStatusPost**
> v1CompanyUsersUserIdStatusPost(userId, Object)

Изменение статуса ученика

Изменяет статус ученика

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Long userId = 56L; // Long | ID ученика
    Object Object = new Object(); // Object | Новый статус и причина изменения
    try {
      apiInstance.v1CompanyUsersUserIdStatusPost(userId, Object);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#v1CompanyUsersUserIdStatusPost");
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
 **userId** | **Long**| ID ученика |
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
**404** | Ученик не найден |  -  |

