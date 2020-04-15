# UserPaymentsApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1UserBillsGet**](UserPaymentsApi.md#v1UserBillsGet) | **GET** /v1/user/bills | Списания ученика
[**v1UserPaymentsGet**](UserPaymentsApi.md#v1UserPaymentsGet) | **GET** /v1/user/payments | Платежи ученика
[**v1UserSubscriptionsGet**](UserPaymentsApi.md#v1UserSubscriptionsGet) | **GET** /v1/user/subscriptions | Абонементы


<a name="v1UserBillsGet"></a>
# **v1UserBillsGet**
> MKUserBills v1UserBillsGet(date, includeRecords, userId, offset, limit)

Списания ученика

Возвращает списания за занятия, за истекшие абонементы.

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserPaymentsApi;

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

    UserPaymentsApi apiInstance = new UserPaymentsApi(defaultClient);
    List<LocalDate> date = 2019-01-01; // List<LocalDate> | Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону
    Boolean includeRecords = true; // Boolean | Включить в ответ записи на занятия
    Long userId = 123; // Long | ID ученика
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKUserBills result = apiInstance.v1UserBillsGet(date, includeRecords, userId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserPaymentsApi#v1UserBillsGet");
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
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону | [optional]
 **includeRecords** | **Boolean**| Включить в ответ записи на занятия | [optional] [default to false]
 **userId** | **Long**| ID ученика | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKUserBills**](MKUserBills.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Списания |  -  |

<a name="v1UserPaymentsGet"></a>
# **v1UserPaymentsGet**
> MKUserPayments v1UserPaymentsGet(date, userId, offset, limit)

Платежи ученика

Возвращает список платежей

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserPaymentsApi;

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

    UserPaymentsApi apiInstance = new UserPaymentsApi(defaultClient);
    List<LocalDate> date = 2019-01-01; // List<LocalDate> | Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону
    Long userId = 123; // Long | ID ученика
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKUserPayments result = apiInstance.v1UserPaymentsGet(date, userId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserPaymentsApi#v1UserPaymentsGet");
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
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону | [optional]
 **userId** | **Long**| ID ученика | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKUserPayments**](MKUserPayments.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список платежей |  -  |
**400** | Ошибка в параметрах фильтра |  -  |

<a name="v1UserSubscriptionsGet"></a>
# **v1UserSubscriptionsGet**
> MKUserSubscriptions v1UserSubscriptionsGet(date, userId, statusId, offset, limit)

Абонементы

Возвращает список абонементов

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserPaymentsApi;

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

    UserPaymentsApi apiInstance = new UserPaymentsApi(defaultClient);
    List<LocalDate> date = 2019-01-01; // List<LocalDate> | Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону
    Long userId = 123; // Long | ID ученика
    List<Integer> statusId = Arrays.asList(); // List<Integer> | Статус абонемента
    Integer offset = 0; // Integer | Номер первой записи. Используется для постраничного вывода.
    Integer limit = 0; // Integer | Максимальное количество возвращаемых строк. Используется для постраничного вывода.
    try {
      MKUserSubscriptions result = apiInstance.v1UserSubscriptionsGet(date, userId, statusId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserPaymentsApi#v1UserSubscriptionsGet");
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
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону | [optional]
 **userId** | **Long**| ID ученика | [optional]
 **statusId** | [**List&lt;Integer&gt;**](Integer.md)| Статус абонемента | [optional]
 **offset** | **Integer**| Номер первой записи. Используется для постраничного вывода. | [optional] [default to 0]
 **limit** | **Integer**| Максимальное количество возвращаемых строк. Используется для постраничного вывода. | [optional] [default to 100]

### Return type

[**MKUserSubscriptions**](MKUserSubscriptions.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список абонементов |  -  |

