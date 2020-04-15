# CompanyApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyFilialsGet**](CompanyApi.md#v1CompanyFilialsGet) | **GET** /v1/company/filials | Филиалы компании
[**v1CompanyManagersGet**](CompanyApi.md#v1CompanyManagersGet) | **GET** /v1/company/managers | Список сотрудников
[**v1CompanyRoomsGet**](CompanyApi.md#v1CompanyRoomsGet) | **GET** /v1/company/rooms | Аудитории


<a name="v1CompanyFilialsGet"></a>
# **v1CompanyFilialsGet**
> List&lt;MKFilial&gt; v1CompanyFilialsGet()

Филиалы компании

Возвращает список филиалов

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    try {
      List<MKFilial> result = apiInstance.v1CompanyFilialsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#v1CompanyFilialsGet");
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

[**List&lt;MKFilial&gt;**](MKFilial.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список филиалов |  -  |

<a name="v1CompanyManagersGet"></a>
# **v1CompanyManagersGet**
> List&lt;MKManager&gt; v1CompanyManagersGet()

Список сотрудников

Возвращает список работающих сотрудников

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    try {
      List<MKManager> result = apiInstance.v1CompanyManagersGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#v1CompanyManagersGet");
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

[**List&lt;MKManager&gt;**](MKManager.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список сотрудников |  -  |

<a name="v1CompanyRoomsGet"></a>
# **v1CompanyRoomsGet**
> List&lt;MKRoom&gt; v1CompanyRoomsGet()

Аудитории

Аудитории компании

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    try {
      List<MKRoom> result = apiInstance.v1CompanyRoomsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#v1CompanyRoomsGet");
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

[**List&lt;MKRoom&gt;**](MKRoom.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список аудиторий |  -  |

