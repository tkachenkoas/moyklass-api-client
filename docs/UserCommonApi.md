# UserCommonApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1UserAccountPasswordPost**](UserCommonApi.md#v1UserAccountPasswordPost) | **POST** /v1/user/account/password | Изменение пароля
[**v1UserAccountPost**](UserCommonApi.md#v1UserAccountPost) | **POST** /v1/user/account | Изменение настроек
[**v1UserBaseInfoGet**](UserCommonApi.md#v1UserBaseInfoGet) | **GET** /v1/user/baseInfo | Основная информация аккаунта
[**v1UserLkSettingsGet**](UserCommonApi.md#v1UserLkSettingsGet) | **GET** /v1/user/lkSettings | Настройки личного кабинета
[**v1UserLkStyleGet**](UserCommonApi.md#v1UserLkStyleGet) | **GET** /v1/user/lkStyle | Стиль личного кабинета
[**v1UserUsersUserIdPost**](UserCommonApi.md#v1UserUsersUserIdPost) | **POST** /v1/user/users/{userId} | Изменение ученика


<a name="v1UserAccountPasswordPost"></a>
# **v1UserAccountPasswordPost**
> v1UserAccountPasswordPost(mkUserPassword)

Изменение пароля

Изменяет пароль аккаунта 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserCommonApi;

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

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    MKUserPassword mkUserPassword = new MKUserPassword(); // MKUserPassword | Новый пароль
    try {
      apiInstance.v1UserAccountPasswordPost(mkUserPassword);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserAccountPasswordPost");
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
 **mkUserPassword** | [**MKUserPassword**](MKUserPassword.md)| Новый пароль |

### Return type

null (empty response body)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Пароль изменен |  -  |

<a name="v1UserAccountPost"></a>
# **v1UserAccountPost**
> v1UserAccountPost(mkAccountSettings)

Изменение настроек

Применяет настройки аккаунта 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserCommonApi;

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

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    MKAccountSettings mkAccountSettings = new MKAccountSettings(); // MKAccountSettings | Настройки аккаунта
    try {
      apiInstance.v1UserAccountPost(mkAccountSettings);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserAccountPost");
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
 **mkAccountSettings** | [**MKAccountSettings**](MKAccountSettings.md)| Настройки аккаунта |

### Return type

null (empty response body)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Настройки изменены |  -  |

<a name="v1UserBaseInfoGet"></a>
# **v1UserBaseInfoGet**
> MKAccountInfo v1UserBaseInfoGet()

Основная информация аккаунта

Возвращает основную информацию по аккаунту: ученики, их балансы, записи, группы, в которые они записаны и т.д. 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserCommonApi;

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

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    try {
      MKAccountInfo result = apiInstance.v1UserBaseInfoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserBaseInfoGet");
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

[**MKAccountInfo**](MKAccountInfo.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные аккаунта |  -  |

<a name="v1UserLkSettingsGet"></a>
# **v1UserLkSettingsGet**
> MKLkSettings v1UserLkSettingsGet()

Настройки личного кабинета

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserCommonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    try {
      MKLkSettings result = apiInstance.v1UserLkSettingsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserLkSettingsGet");
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

[**MKLkSettings**](MKLkSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Настройки |  -  |
**404** | Домен личного кабинета не найден |  -  |

<a name="v1UserLkStyleGet"></a>
# **v1UserLkStyleGet**
> v1UserLkStyleGet(referer)

Стиль личного кабинета

Возвращает цвета оформления личного кабинета

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserCommonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    String referer = "referer_example"; // String | Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета. 
    try {
      apiInstance.v1UserLkStyleGet(referer);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserLkStyleGet");
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
 **referer** | **String**| Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/css, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Стиль |  -  |
**404** | Домен личного кабинета не найден |  -  |

<a name="v1UserUsersUserIdPost"></a>
# **v1UserUsersUserIdPost**
> MKUserRestricted v1UserUsersUserIdPost(userId, mkUserRestricted)

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
import com.moyklass.api.UserCommonApi;

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

    UserCommonApi apiInstance = new UserCommonApi(defaultClient);
    Long userId = 123456; // Long | ID ученика
    MKUserRestricted mkUserRestricted = new MKUserRestricted(); // MKUserRestricted | Обновленная информация об ученике
    try {
      MKUserRestricted result = apiInstance.v1UserUsersUserIdPost(userId, mkUserRestricted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserCommonApi#v1UserUsersUserIdPost");
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
 **mkUserRestricted** | [**MKUserRestricted**](MKUserRestricted.md)| Обновленная информация об ученике |

### Return type

[**MKUserRestricted**](MKUserRestricted.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

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

