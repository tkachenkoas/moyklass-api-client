# CatalogApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyAdvSourcesGet**](CatalogApi.md#v1CompanyAdvSourcesGet) | **GET** /v1/company/advSources | Информационные источники
[**v1CompanyClientStatusesGet**](CatalogApi.md#v1CompanyClientStatusesGet) | **GET** /v1/company/clientStatuses | Статусы клиентов
[**v1CompanyCreateSourcesGet**](CatalogApi.md#v1CompanyCreateSourcesGet) | **GET** /v1/company/createSources | Способы заведения заявок
[**v1CompanyJoinStatusesGet**](CatalogApi.md#v1CompanyJoinStatusesGet) | **GET** /v1/company/joinStatuses | Статусы заявок
[**v1CompanyJoinTagsGet**](CatalogApi.md#v1CompanyJoinTagsGet) | **GET** /v1/company/joinTags | Теги заявок
[**v1CompanyStatusReasonsGet**](CatalogApi.md#v1CompanyStatusReasonsGet) | **GET** /v1/company/statusReasons | Причины изменения статуса
[**v1CompanyUserAttributesGet**](CatalogApi.md#v1CompanyUserAttributesGet) | **GET** /v1/company/userAttributes | Признаки ученика


<a name="v1CompanyAdvSourcesGet"></a>
# **v1CompanyAdvSourcesGet**
> List&lt;MKAdvSource&gt; v1CompanyAdvSourcesGet()

Информационные источники

Возвращает список информационных источников

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKAdvSource> result = apiInstance.v1CompanyAdvSourcesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyAdvSourcesGet");
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

[**List&lt;MKAdvSource&gt;**](MKAdvSource.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список информационных источников |  -  |

<a name="v1CompanyClientStatusesGet"></a>
# **v1CompanyClientStatusesGet**
> List&lt;MKClientStatus&gt; v1CompanyClientStatusesGet()

Статусы клиентов

Возвращает список статусов клиентов

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKClientStatus> result = apiInstance.v1CompanyClientStatusesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyClientStatusesGet");
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

[**List&lt;MKClientStatus&gt;**](MKClientStatus.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список статусов |  -  |

<a name="v1CompanyCreateSourcesGet"></a>
# **v1CompanyCreateSourcesGet**
> List&lt;MKCreateSource&gt; v1CompanyCreateSourcesGet()

Способы заведения заявок

Возвращает список возможных способов заведения клиентов и заявок

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKCreateSource> result = apiInstance.v1CompanyCreateSourcesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyCreateSourcesGet");
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

[**List&lt;MKCreateSource&gt;**](MKCreateSource.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список способов |  -  |

<a name="v1CompanyJoinStatusesGet"></a>
# **v1CompanyJoinStatusesGet**
> List&lt;MKJoinStatus&gt; v1CompanyJoinStatusesGet()

Статусы заявок

Возвращает список статусов заявок

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKJoinStatus> result = apiInstance.v1CompanyJoinStatusesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyJoinStatusesGet");
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

[**List&lt;MKJoinStatus&gt;**](MKJoinStatus.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список статусов |  -  |

<a name="v1CompanyJoinTagsGet"></a>
# **v1CompanyJoinTagsGet**
> List&lt;MKJoinTag&gt; v1CompanyJoinTagsGet()

Теги заявок

Возвращает список тегов для заявок

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKJoinTag> result = apiInstance.v1CompanyJoinTagsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyJoinTagsGet");
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

[**List&lt;MKJoinTag&gt;**](MKJoinTag.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список тегов |  -  |

<a name="v1CompanyStatusReasonsGet"></a>
# **v1CompanyStatusReasonsGet**
> List&lt;MKStatusReason&gt; v1CompanyStatusReasonsGet(type)

Причины изменения статуса

Возвращает причины изменения статуса записи

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String type = join; // String | Тип причины
    try {
      List<MKStatusReason> result = apiInstance.v1CompanyStatusReasonsGet(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyStatusReasonsGet");
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
 **type** | **String**| Тип причины | [optional] [default to join] [enum: join, client]

### Return type

[**List&lt;MKStatusReason&gt;**](MKStatusReason.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список причин |  -  |

<a name="v1CompanyUserAttributesGet"></a>
# **v1CompanyUserAttributesGet**
> List&lt;MKUserAttribute&gt; v1CompanyUserAttributesGet()

Признаки ученика

Возвращает список всех доступных признаков ученика

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      List<MKUserAttribute> result = apiInstance.v1CompanyUserAttributesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#v1CompanyUserAttributesGet");
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

[**List&lt;MKUserAttribute&gt;**](MKUserAttribute.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список признаков |  -  |

