# UserFilesApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1UserFilesFileIdGet**](UserFilesApi.md#v1UserFilesFileIdGet) | **GET** /v1/user/files/{fileId} | Скачивание файла


<a name="v1UserFilesFileIdGet"></a>
# **v1UserFilesFileIdGet**
> MKDownloadFile v1UserFilesFileIdGet(fileId)

Скачивание файла

Скачивание файла

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.UserFilesApi;

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

    UserFilesApi apiInstance = new UserFilesApi(defaultClient);
    Long fileId = 56L; // Long | ID файла
    try {
      MKDownloadFile result = apiInstance.v1UserFilesFileIdGet(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFilesApi#v1UserFilesFileIdGet");
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
 **fileId** | **Long**| ID файла |

### Return type

[**MKDownloadFile**](MKDownloadFile.md)

### Authorization

[userSession](../README.md#userSession), [xCookieToken](../README.md#xCookieToken), [xCsrfToken](../README.md#xCsrfToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные файла |  -  |
**400** | Ошибка валидации |  -  |

