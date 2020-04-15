# HooksApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1HooksAmoEventsUniqueKeyPost**](HooksApi.md#v1HooksAmoEventsUniqueKeyPost) | **POST** /v1/hooks/amoEvents/{uniqueKey} | Реакция на события от amoCRM интеграций
[**v1HooksFbEventsGet**](HooksApi.md#v1HooksFbEventsGet) | **GET** /v1/hooks/fbEvents | Подтверждение подписки на события FB
[**v1HooksFbEventsPost**](HooksApi.md#v1HooksFbEventsPost) | **POST** /v1/hooks/fbEvents | Реакция на события от FB интеграций
[**v1HooksIgEventsIntegrationIdPost**](HooksApi.md#v1HooksIgEventsIntegrationIdPost) | **POST** /v1/hooks/igEvents/{integrationId} | Реакция на события от Instagram интеграций
[**v1HooksTildaUniqueKeyPost**](HooksApi.md#v1HooksTildaUniqueKeyPost) | **POST** /v1/hooks/tilda/{uniqueKey} | Реакция на события от Tilda интеграций
[**v1HooksVkEventsIntegrationIdPost**](HooksApi.md#v1HooksVkEventsIntegrationIdPost) | **POST** /v1/hooks/vkEvents/{integrationId} | Реакция на события от VK интеграций


<a name="v1HooksAmoEventsUniqueKeyPost"></a>
# **v1HooksAmoEventsUniqueKeyPost**
> Object v1HooksAmoEventsUniqueKeyPost(uniqueKey, leads, contacts)

Реакция на события от amoCRM интеграций

Принимает запрос от amoCRM

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    String uniqueKey = 000123-11bf5b37-e0b8-42e0-8dcf-dc8c4aefc000; // String | Уникальный ключ интеграции
    Object leads = null; // Object | Список сделок
    Object contacts = null; // Object | Список контактов
    try {
      Object result = apiInstance.v1HooksAmoEventsUniqueKeyPost(uniqueKey, leads, contacts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksAmoEventsUniqueKeyPost");
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
 **uniqueKey** | **String**| Уникальный ключ интеграции |
 **leads** | [**Object**](Object.md)| Список сделок | [optional]
 **contacts** | [**Object**](Object.md)| Список контактов | [optional]

### Return type

**Object**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**403** | Неверный ключ интеграции |  -  |

<a name="v1HooksFbEventsGet"></a>
# **v1HooksFbEventsGet**
> String v1HooksFbEventsGet()

Подтверждение подписки на события FB

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    try {
      String result = apiInstance.v1HooksFbEventsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksFbEventsGet");
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

**String**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ответ для подтверждения |  -  |

<a name="v1HooksFbEventsPost"></a>
# **v1HooksFbEventsPost**
> Object v1HooksFbEventsPost(mkFbEvent)

Реакция на события от FB интеграций

Принимает запрос от FB API

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    MKFbEvent mkFbEvent = new MKFbEvent(); // MKFbEvent | Информация о событиях генераций лидов
    try {
      Object result = apiInstance.v1HooksFbEventsPost(mkFbEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksFbEventsPost");
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
 **mkFbEvent** | [**MKFbEvent**](MKFbEvent.md)| Информация о событиях генераций лидов |

### Return type

**Object**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**500** | Ошибка сервера |  -  |

<a name="v1HooksIgEventsIntegrationIdPost"></a>
# **v1HooksIgEventsIntegrationIdPost**
> String v1HooksIgEventsIntegrationIdPost(integrationId, mkIgEvent)

Реакция на события от Instagram интеграций

Принимает запрос от сервиса Instagram

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    Long integrationId = 55; // Long | ID интеграции
    MKIgEvent mkIgEvent = new MKIgEvent(); // MKIgEvent | Информация о событии
    try {
      String result = apiInstance.v1HooksIgEventsIntegrationIdPost(integrationId, mkIgEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksIgEventsIntegrationIdPost");
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
 **integrationId** | **Long**| ID интеграции |
 **mkIgEvent** | [**MKIgEvent**](MKIgEvent.md)| Информация о событии |

### Return type

**String**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**403** | Неверный внутренний секретный ключ |  -  |

<a name="v1HooksTildaUniqueKeyPost"></a>
# **v1HooksTildaUniqueKeyPost**
> Object v1HooksTildaUniqueKeyPost(uniqueKey, tranid, formid)

Реакция на события от Tilda интеграций

Принимает запрос от Tilda

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    String uniqueKey = 000123-11bf5b37-e0b8-42e0-8dcf-dc8c4aefc000; // String | Уникальный ключ интеграции
    String tranid = "tranid_example"; // String | Уникальный номер заявки
    String formid = "formid_example"; // String | Номер блока, с которого была отправка
    try {
      Object result = apiInstance.v1HooksTildaUniqueKeyPost(uniqueKey, tranid, formid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksTildaUniqueKeyPost");
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
 **uniqueKey** | **String**| Уникальный ключ интеграции |
 **tranid** | **String**| Уникальный номер заявки | [optional]
 **formid** | **String**| Номер блока, с которого была отправка | [optional]

### Return type

**Object**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**403** | Неверный ключ интеграции |  -  |

<a name="v1HooksVkEventsIntegrationIdPost"></a>
# **v1HooksVkEventsIntegrationIdPost**
> String v1HooksVkEventsIntegrationIdPost(integrationId, mkVkEvent)

Реакция на события от VK интеграций

Принимает запрос от VK API

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.HooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    HooksApi apiInstance = new HooksApi(defaultClient);
    Long integrationId = 55; // Long | ID интеграции
    MKVkEvent mkVkEvent = new MKVkEvent(); // MKVkEvent | Информация о событии в группе
    try {
      String result = apiInstance.v1HooksVkEventsIntegrationIdPost(integrationId, mkVkEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HooksApi#v1HooksVkEventsIntegrationIdPost");
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
 **integrationId** | **Long**| ID интеграции |
 **mkVkEvent** | [**MKVkEvent**](MKVkEvent.md)| Информация о событии в группе |

### Return type

**String**

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**403** | Неверный секретный ключ callback сервера или id группы |  -  |

