# InternalApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1InternalIntegrationsGet**](InternalApi.md#v1InternalIntegrationsGet) | **GET** /v1/internal/integrations | Интеграции


<a name="v1InternalIntegrationsGet"></a>
# **v1InternalIntegrationsGet**
> List&lt;MKIntegration&gt; v1InternalIntegrationsGet(serviceType)

Интеграции

Возвращает список всех интеграций

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.InternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    InternalApi apiInstance = new InternalApi(defaultClient);
    Long serviceType = 56L; // Long | Тип сервиса
    try {
      List<MKIntegration> result = apiInstance.v1InternalIntegrationsGet(serviceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalApi#v1InternalIntegrationsGet");
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
 **serviceType** | **Long**| Тип сервиса | [optional]

### Return type

[**List&lt;MKIntegration&gt;**](MKIntegration.md)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список интеграций |  -  |

