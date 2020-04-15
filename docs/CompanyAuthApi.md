# CompanyAuthApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyAuthGetTokenPost**](CompanyAuthApi.md#v1CompanyAuthGetTokenPost) | **POST** /v1/company/auth/getToken | Получение токена
[**v1CompanyAuthRefreshTokenPost**](CompanyAuthApi.md#v1CompanyAuthRefreshTokenPost) | **POST** /v1/company/auth/refreshToken | Обновление токена
[**v1CompanyAuthRevokeTokenPost**](CompanyAuthApi.md#v1CompanyAuthRevokeTokenPost) | **POST** /v1/company/auth/revokeToken | Удаление токена


<a name="v1CompanyAuthGetTokenPost"></a>
# **v1CompanyAuthGetTokenPost**
> MKAccessToken v1CompanyAuthGetTokenPost(mkKeyAuth)

Получение токена

Авторизация. Получение токена для работы с API. Ключи API вы можете создавать и просматривать в разделе CRM [\&quot;Мой Класс\&quot; - \&quot;Настройки - API\&quot;](https://app.moyklass.com/settings/settings/api).  [Подробнее](https://help.moyklass.com/hc/ru/articles/360027261934-%D0%A0%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-API). 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    CompanyAuthApi apiInstance = new CompanyAuthApi(defaultClient);
    MKKeyAuth mkKeyAuth = new MKKeyAuth(); // MKKeyAuth | Параметры авторизации
    try {
      MKAccessToken result = apiInstance.v1CompanyAuthGetTokenPost(mkKeyAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyAuthApi#v1CompanyAuthGetTokenPost");
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
 **mkKeyAuth** | [**MKKeyAuth**](MKKeyAuth.md)| Параметры авторизации |

### Return type

[**MKAccessToken**](MKAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Токен доступа |  -  |
**401** | Ошибка авторизации |  -  |

<a name="v1CompanyAuthRefreshTokenPost"></a>
# **v1CompanyAuthRefreshTokenPost**
> MKAccessToken v1CompanyAuthRefreshTokenPost()

Обновление токена

Генерирует новый токен, текущий токен при этом продолжает действовать.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CompanyAuthApi apiInstance = new CompanyAuthApi(defaultClient);
    try {
      MKAccessToken result = apiInstance.v1CompanyAuthRefreshTokenPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyAuthApi#v1CompanyAuthRefreshTokenPost");
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

[**MKAccessToken**](MKAccessToken.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Новый токен доступа |  -  |
**401** | Ошибка авторизации |  -  |

<a name="v1CompanyAuthRevokeTokenPost"></a>
# **v1CompanyAuthRevokeTokenPost**
> v1CompanyAuthRevokeTokenPost()

Удаление токена

Удаляет существующий токен. Токен передается в заголовке **x-access-token**

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CompanyAuthApi apiInstance = new CompanyAuthApi(defaultClient);
    try {
      apiInstance.v1CompanyAuthRevokeTokenPost();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyAuthApi#v1CompanyAuthRevokeTokenPost");
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

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Токен удален |  -  |
**401** | Ошибка авторизации |  -  |

