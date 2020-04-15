/*
 * API для работы с CRM \"Мой Класс\"
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.moyklass.api;

import com.moyklass.api.invoker.ApiCallback;
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.ApiResponse;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.Pair;
import com.moyklass.api.invoker.ProgressRequestBody;
import com.moyklass.api.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.moyklass.api.model.MKDownloadFile;
import com.moyklass.api.model.MKErrorHandling;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFilesApi {
    private ApiClient localVarApiClient;

    public UserFilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserFilesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1UserFilesFileIdGet
     * @param fileId ID файла (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Данные файла </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserFilesFileIdGetCall(Long fileId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/files/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserFilesFileIdGetValidateBeforeCall(Long fileId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling v1UserFilesFileIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = v1UserFilesFileIdGetCall(fileId, _callback);
        return localVarCall;

    }

    /**
     * Скачивание файла
     * Скачивание файла
     * @param fileId ID файла (required)
     * @return MKDownloadFile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Данные файла </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
     </table>
     */
    public MKDownloadFile v1UserFilesFileIdGet(Long fileId) throws ApiException {
        ApiResponse<MKDownloadFile> localVarResp = v1UserFilesFileIdGetWithHttpInfo(fileId);
        return localVarResp.getData();
    }

    /**
     * Скачивание файла
     * Скачивание файла
     * @param fileId ID файла (required)
     * @return ApiResponse&lt;MKDownloadFile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Данные файла </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKDownloadFile> v1UserFilesFileIdGetWithHttpInfo(Long fileId) throws ApiException {
        okhttp3.Call localVarCall = v1UserFilesFileIdGetValidateBeforeCall(fileId, null);
        Type localVarReturnType = new TypeToken<MKDownloadFile>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Скачивание файла (asynchronously)
     * Скачивание файла
     * @param fileId ID файла (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Данные файла </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserFilesFileIdGetAsync(Long fileId, final ApiCallback<MKDownloadFile> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserFilesFileIdGetValidateBeforeCall(fileId, _callback);
        Type localVarReturnType = new TypeToken<MKDownloadFile>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}