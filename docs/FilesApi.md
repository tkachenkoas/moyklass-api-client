# FilesApi

All URIs are relative to *https://api.moyklass.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CompanyFilesFileIdDelete**](FilesApi.md#v1CompanyFilesFileIdDelete) | **DELETE** /v1/company/files/{fileId} | Удаление файла
[**v1CompanyFilesFileIdGet**](FilesApi.md#v1CompanyFilesFileIdGet) | **GET** /v1/company/files/{fileId} | Скачивание файла


<a name="v1CompanyFilesFileIdDelete"></a>
# **v1CompanyFilesFileIdDelete**
> v1CompanyFilesFileIdDelete(fileId)

Удаление файла

Удаление файла

### Example
```java
// Import classes:
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.auth.*;
import com.moyklass.api.invoker.models.*;
import com.moyklass.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Long fileId = 56L; // Long | ID файла
    try {
      apiInstance.v1CompanyFilesFileIdDelete(fileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#v1CompanyFilesFileIdDelete");
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

null (empty response body)

### Authorization

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Файл удален |  -  |
**402** | Ограничения лицензии |  -  |
**404** | Файл не найден |  -  |

<a name="v1CompanyFilesFileIdGet"></a>
# **v1CompanyFilesFileIdGet**
> MKDownloadFile v1CompanyFilesFileIdGet(fileId)

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
import com.moyklass.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.moyklass.com");
    
    // Configure API key authorization: companyApiKey
    ApiKeyAuth companyApiKey = (ApiKeyAuth) defaultClient.getAuthentication("companyApiKey");
    companyApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //companyApiKey.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Long fileId = 56L; // Long | ID файла
    try {
      MKDownloadFile result = apiInstance.v1CompanyFilesFileIdGet(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#v1CompanyFilesFileIdGet");
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

[companyApiKey](../README.md#companyApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Данные файла |  -  |
**400** | Ошибка валидации |  -  |

