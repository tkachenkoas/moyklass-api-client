# UserAuthApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1UserAuthLoginPost**](UserAuthApi.md#v1UserAuthLoginPost) | **POST** /v1/user/auth/login | Авторизация аккаунта
[**v1UserAuthLogoutPost**](UserAuthApi.md#v1UserAuthLogoutPost) | **POST** /v1/user/auth/logout | Логаут аккаунта
[**v1UserAuthRefreshPost**](UserAuthApi.md#v1UserAuthRefreshPost) | **POST** /v1/user/auth/refresh | Обновление сессии
[**v1UserAuthSendRestoreKeyPost**](UserAuthApi.md#v1UserAuthSendRestoreKeyPost) | **POST** /v1/user/auth/sendRestoreKey | Ключ восстановления пароля
[**v1UserAuthSetPasswordPost**](UserAuthApi.md#v1UserAuthSetPasswordPost) | **POST** /v1/user/auth/setPassword | Установка пароля


<a name="v1UserAuthLoginPost"></a>
# **v1UserAuthLoginPost**
> MKAuthResult v1UserAuthLoginPost(mkUserAuth, origin)

Авторизация аккаунта

Для авторизации используются реквизиты аккаунта 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    UserAuthApi apiInstance = new UserAuthApi(defaultClient);
    MKUserAuth mkUserAuth = new MKUserAuth(); // MKUserAuth | Параметры авторизации
    String origin = "origin_example"; // String | Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет. 
    try {
      MKAuthResult result = apiInstance.v1UserAuthLoginPost(mkUserAuth, origin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthApi#v1UserAuthLoginPost");
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
 **mkUserAuth** | [**MKUserAuth**](MKUserAuth.md)| Параметры авторизации |
 **origin** | **String**| Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет.  | [optional]

### Return type

[**MKAuthResult**](MKAuthResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Результат авторизации |  -  |
**401** | Ошибка авторизации |  -  |

<a name="v1UserAuthLogoutPost"></a>
# **v1UserAuthLogoutPost**
> v1UserAuthLogoutPost()

Логаут аккаунта

Метод для выхода из системы. Сбрасывает сессию аккаунта. 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserAuthApi;

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

    UserAuthApi apiInstance = new UserAuthApi(defaultClient);
    try {
      apiInstance.v1UserAuthLogoutPost();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthApi#v1UserAuthLogoutPost");
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

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Успешный выход |  -  |
**401** | Ошибка авторизации |  -  |

<a name="v1UserAuthRefreshPost"></a>
# **v1UserAuthRefreshPost**
> MKAuthResult v1UserAuthRefreshPost()

Обновление сессии

Обновление сессии аккаунта. создает новую сессию с новым таймаутом и новым токеном CSRF. Старая сессия при этом перестает действовать 

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserAuthApi;

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

    UserAuthApi apiInstance = new UserAuthApi(defaultClient);
    try {
      MKAuthResult result = apiInstance.v1UserAuthRefreshPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthApi#v1UserAuthRefreshPost");
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

[**MKAuthResult**](MKAuthResult.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Результат авторизации |  -  |
**401** | Ошибка авторизации |  -  |

<a name="v1UserAuthSendRestoreKeyPost"></a>
# **v1UserAuthSendRestoreKeyPost**
> v1UserAuthSendRestoreKeyPost(mkUserRestoreKey, origin)

Ключ восстановления пароля

Отправляет на указанный email ключ для восстановления пароля

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    UserAuthApi apiInstance = new UserAuthApi(defaultClient);
    MKUserRestoreKey mkUserRestoreKey = new MKUserRestoreKey(); // MKUserRestoreKey | Параметры для отправки ключа
    String origin = "origin_example"; // String | Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен. 
    try {
      apiInstance.v1UserAuthSendRestoreKeyPost(mkUserRestoreKey, origin);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthApi#v1UserAuthSendRestoreKeyPost");
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
 **mkUserRestoreKey** | [**MKUserRestoreKey**](MKUserRestoreKey.md)| Параметры для отправки ключа |
 **origin** | **String**| Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Ключ отправлен |  -  |
**400** | Ошибка валидации |  -  |
**404** | Email не найден |  -  |

<a name="v1UserAuthSetPasswordPost"></a>
# **v1UserAuthSetPasswordPost**
> v1UserAuthSetPasswordPost(mkUserRestorePassword, origin)

Установка пароля

Устанавливает пароль на основе указанного ключа восстановления

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");

    UserAuthApi apiInstance = new UserAuthApi(defaultClient);
    MKUserRestorePassword mkUserRestorePassword = new MKUserRestorePassword(); // MKUserRestorePassword | Параметры для отправки ключа
    String origin = "origin_example"; // String | Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен. 
    try {
      apiInstance.v1UserAuthSetPasswordPost(mkUserRestorePassword, origin);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthApi#v1UserAuthSetPasswordPost");
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
 **mkUserRestorePassword** | [**MKUserRestorePassword**](MKUserRestorePassword.md)| Параметры для отправки ключа |
 **origin** | **String**| Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Пароль установлен |  -  |
**404** | Ключ не найден |  -  |

